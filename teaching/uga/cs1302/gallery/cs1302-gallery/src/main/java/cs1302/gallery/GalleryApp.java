package cs1302.gallery;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.TilePane;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;

/**
 * Represents an iTunes GalleryApp!
 */
public class GalleryApp extends Application {
    // Basic Structure of Application
    VBox pane = new VBox();
    Scene scene = new Scene(pane);

    // Setting up the menu for File
    VBox menuPane = new VBox();
    Menu menu = new Menu("File");
    MenuItem exitOption = new MenuItem("Exit");
    MenuBar menuBar = new MenuBar();

    // Setting up the toolbar Pane with the Buttons and search bar
    HBox toolbarPane = new HBox();
    Button toggleButton = new Button("Pause");
    Separator separator = new Separator();
    Text searchText = new Text("Search Query: ");
    TextField searchBar = new TextField("rock and roll");
    Button updateButton = new Button("Update Images");

    // Setting up the Image Pane with TilePane and ImageView
    VBox imagesPane = new VBox();
    TilePane container = new TilePane();
    ImageView[] images = new ImageView[20];

    //Setting up the progress bar and credits
    HBox lastPane = new HBox();
    ProgressBar progress = new ProgressBar();
    Text credit = new Text("Images provided courtesy of iTunes");

    // Manipulation for Play/Pause
    ArrayList<String> distinctImageUrls;
    ArrayList<String> displayedImageUrls;
    Timeline timeline = new Timeline();
    boolean isPlaying = false;

    /**
     * The entry point for our GalleryApp.
     * @param stage A reference to the window (stage) created by the system.
     */
    @Override
    public void start(Stage stage) {

        // Setting up the TilePane
        container.setPrefRows(4);
        container.setPrefColumns(5);
        container.setPrefWidth(640);

        // Setting up the images with image view and adding the images into Tilepane
        for (int i = 0; i < images.length; i++) {
            images[i] = new ImageView(new Image("http://cobweb.cs.uga.edu/~mec/cs1302/gui/default.png", 100, 100, false, false));
            container.getChildren().add(images[i]);
        }

        // Setting up the toolbar Pane
        searchBar.setPrefWidth(200);
        searchBar.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(searchBar, Priority.NEVER);
        HBox.setHgrow(toggleButton, Priority.NEVER);
        HBox.setHgrow(searchText, Priority.NEVER);
        HBox.setHgrow(updateButton, Priority.NEVER);
        toolbarPane.setPadding(new Insets(5, 5, 5, 5));
        toolbarPane.setSpacing(5);
        toolbarPane.setAlignment(Pos.BASELINE_LEFT);
        separator.setOrientation(Orientation.VERTICAL);
        separator.setMaxHeight(10);

        toggleButton.setOnAction(e -> togglePlaying(stage));
        updateButton.setOnAction(e -> loadImage(stage));
        exitOption.setOnAction(e -> stage.close());

        progress.setProgress(0F);
        lastPane.setSpacing(5);

        // Populating the scene
        menu.getItems().add(exitOption);
        menuBar.getMenus().add(menu);
        menuPane.getChildren().add(menuBar);
        toolbarPane.getChildren().addAll(toggleButton, separator, searchText, searchBar, updateButton);
        imagesPane.getChildren().add(container);
        lastPane.getChildren().addAll(progress, credit);
        pane.getChildren().addAll(menuPane, toolbarPane, imagesPane, lastPane);

        loadImage(stage);

        // Setting up the scene
        stage.setMaxWidth(506);
        stage.setMaxHeight(550);
        stage.setResizable(false);
        stage.setTitle("GalleryApp!");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    } // start

    /**
     * Loads the images into the stage.
     * @param stage A reference to the window (stage) created by the system.
     */
    private void loadImage(Stage stage) {
        Runnable progressImages = () -> {
            try {
                updateButton.setDisable(true);
                timeline.pause();

                final String baseUrl = "https://itunes.apple.com/search?term=";
                String encodedKeywords = URLEncoder.encode(searchBar.getText(), "UTF-8");
                String specificParameters = "&media=music";

                String sUrl = baseUrl + encodedKeywords + specificParameters;
                URL url = new URL(sUrl);
                InputStreamReader reader = new InputStreamReader(url.openStream());

                JsonElement je = JsonParser.parseReader(reader);
                JsonObject root = je.getAsJsonObject();

                JsonArray results = root.getAsJsonArray("results");
                int numResults = results.size();
                ArrayList<String> imageUrls = new ArrayList<String>();

                for (int i = 0; i < numResults; i++) {
                    JsonObject result = results.get(i).getAsJsonObject();

                    JsonElement artworkUrl100 = result.get("artworkUrl100");
                    String artworkUrl = artworkUrl100.toString();
                    artworkUrl = artworkUrl.substring(1, artworkUrl100.toString().length() - 1);

                    imageUrls.add(artworkUrl);
                }

                distinctImageUrls = (ArrayList<String>) imageUrls.stream().distinct().collect(Collectors.toList());
                ArrayList<Image> imgArray = new ArrayList<Image>();
                displayedImageUrls = new ArrayList<String>();
                if (distinctImageUrls.size() > 21) {
                    for (int i = 0; i < images.length; i++) {
                        displayedImageUrls.add(distinctImageUrls.get(i));
                        Image imagesList = new Image(distinctImageUrls.get(i), 100, 100, false, false);
                        imgArray.add(imagesList);
                        progress.setProgress((i + 1) * 0.05);
                    }
                    for (int i = 0; i < images.length; i++) {
                        images[i].setImage(imgArray.get(i));
                    }
                    toggleButton.setText("Pause");
                    startPlaying(stage);
                } else {
                        Platform.runLater(() -> {
                            Alert a = new Alert(Alert.AlertType.ERROR, "Not enough results", ButtonType.OK);
                            a.setHeaderText("There's a small problem!");
                            a.setContentText("Your search does not have enough results. Please try another search.");
                            a.show();
                        });
                    }
            } catch (IllegalArgumentException | IOException e) {
                System.out.println("Query Failed.");
            } finally {
                updateButton.setDisable(false);
            }
        };
        Platform.runLater(() -> runNow(progressImages));
    }

    /**
     * Pauses the randomized images on the stage.
     * @param stage A reference to the window (stage) created by the system.
     */
    private void togglePlaying(Stage stage) {
        if (isPlaying) {
            isPlaying = false;
            timeline.pause();
            toggleButton.setText("Play");
        } else {
            isPlaying = true;
            timeline.play();
            toggleButton.setText("Pause");
        }
    }

    /**
     *
     * @param target
     */
    public static void runNow(Runnable target) {
        Thread t = new Thread(target);
        t.setDaemon(true);
        t.start();
    } // runNow

    private void startPlaying(Stage stage) {
        EventHandler<ActionEvent> handler = event -> {
            int randomIndex = (int) (Math.random() * 20);
            boolean isReplaced = false;
            for (int i = 0; i < distinctImageUrls.size() && !isReplaced; i++) {
                for (int j = 0; j < displayedImageUrls.size(); j++) {
                    if (distinctImageUrls.get(i).equals(displayedImageUrls.get(j))) {
                        break;
                    }
                    if (j == displayedImageUrls.size() - 1) {
                        displayedImageUrls.set(randomIndex, distinctImageUrls.get(i));
                        Image replace = new Image(distinctImageUrls.get(i));
                        images[randomIndex].setImage(replace);
                        isReplaced = true;
                    }
                }
            }
        };
        
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(2), handler);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(keyFrame);
        timeline.play();
        isPlaying = true;
    }

} // GalleryApp

