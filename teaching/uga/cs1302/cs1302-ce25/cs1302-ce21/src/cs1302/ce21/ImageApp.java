package cs1302.ce21;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;

/**
 * A basic JavaFX 8 program which takes a user specified URL and loads it
 * into an {@code ImageView}.
 *
 */
public class ImageApp extends Application {

    Stage stage;
    Scene scene;

    /**
     * The entry point for our image viewer application.
     *
     * @param stage A reference to the stage object (window) created by the system.
     */ 
    public void start(Stage stage) {
        this.stage = stage;

        TabPane container = new TabPane();

        for (int i = 0; i < 4; i++) {
            Tab currentTab = new Tab("Image Loader #" + (i + 1));
            currentTab.setContent(new ImageLoader());
            container.getTabs().add(currentTab);
        }

        scene = new Scene(container);

        // Set up the stage and set it to be visible
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("1302 Image Viewer!");
        stage.sizeToScene();
        stage.show();
        
    } // start
    
} // ImageApp

