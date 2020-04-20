import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/** 
 * Represents a basic image viewer app.
 */
public class ImageApp extends Application {

    // Basic Structure of Application
    protected VBox mainPane = new VBox();
    protected HBox urlPane = new HBox();
    protected ImageView imagePane = new ImageView("resources/default.png"); 
    protected HBox optionsPane = new HBox();

    // scene => mainPane
    protected Scene scene = new Scene(mainPane);

    // urlPane => url, loadButton
    protected TextField url = new TextField("http://"); 
    protected Button loadButton = new Button("Load");

    // imagePane
    protected double originalHeight = imagePane.getFitHeight();

    // optionsPane => ac
    protected Button zoomInButton = new Button();
    protected Button zoomOutButton = new Button();
    protected Button actualSizeButton = new Button();

    @Override
    public void start(Stage stage) {
        // Sets up urlPane
        url.setPrefWidth(250);
        url.setMaxWidth(Double.MAX_VALUE);
        loadButton.setOnAction(e -> loadImage(stage));

        HBox.setHgrow(url, Priority.ALWAYS);
        HBox.setHgrow(loadButton, Priority.ALWAYS);
        urlPane.setSpacing(10);

        // Sets up imagePane
        imagePane.setPreserveRatio(true);

        // Sets up optionsPane frontEnd
        zoomInButton.setGraphic(new ImageView("resources/zoom-in-50.png"));
        zoomOutButton.setGraphic(new ImageView("resources/zoom-out-50.png"));
        actualSizeButton.setGraphic(new ImageView("resources/actual-size-50.png"));
        
        zoomInButton.setMaxWidth(Double.MAX_VALUE);
        zoomOutButton.setMaxWidth(Double.MAX_VALUE);
        actualSizeButton.setMaxWidth(Double.MAX_VALUE);
        
        HBox.setHgrow(actualSizeButton, Priority.ALWAYS);
        HBox.setHgrow(zoomInButton, Priority.ALWAYS);
        HBox.setHgrow(zoomOutButton, Priority.ALWAYS);
        optionsPane.setSpacing(5);

        // Sets up optionsPane Buttons backEnd
        zoomInButton.setOnAction(e -> zoom(+30, stage));
        zoomOutButton.setOnAction(e -> zoom(-30, stage));
        actualSizeButton.setOnAction(e -> zoom(0, stage));
        
        // Populates scene
        urlPane.getChildren().addAll(url, loadButton);
        optionsPane.getChildren().addAll(zoomInButton, zoomOutButton, actualSizeButton);
        mainPane.getChildren().addAll(urlPane, imagePane, optionsPane);   

        // Loads and shows Stage - Adds Title
        stage.setScene(scene);
        stage.setTitle("cs1302 Image App!");
        stage.sizeToScene();
        stage.setResizable(false);
        stage.show();
    } 

    private void loadImage(Stage stage) {
        String urlString = url.getText();
        System.out.println(urlString);
            
        try {
            String loadedUrl = url.getText();
            Image loadedImage = new Image(loadedUrl);
            imagePane.setImage(loadedImage);
            originalHeight = loadedImage.getHeight();
            imagePane.setFitHeight(originalHeight);
            stage.sizeToScene();
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }

    private void zoom(double zoomAmount, Stage stage) {
        if (zoomAmount > 0) {
            if (imagePane.getFitHeight() + zoomAmount > (2.0 * originalHeight)) {
                zoomInButton.setDisable(true);
                zoomOutButton.setDisable(false);
            } else {
                imagePane.setFitHeight(imagePane.getFitHeight() + zoomAmount);
                zoomOutButton.setDisable(false);
                stage.sizeToScene();
            }
        } else if (zoomAmount < 0) {
            if (imagePane.getFitHeight() + zoomAmount <= 0.0) {
                zoomOutButton.setDisable(true);
                zoomInButton.setDisable(false);
            } else {
                imagePane.setFitHeight(imagePane.getFitHeight() + zoomAmount);
                zoomInButton.setDisable(false);
                stage.sizeToScene();
            }
        } else {
            zoomInButton.setDisable(false);
            zoomOutButton.setDisable(false);
            imagePane.setFitHeight(originalHeight);
            stage.sizeToScene();
        }
    }
}

