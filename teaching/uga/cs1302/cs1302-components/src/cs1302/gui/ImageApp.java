package cs1302.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

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

        ImageLoader imgLoader1 = new ImageLoader();
        ImageLoader imgLoader2 = new ImageLoader();

        HBox container = new HBox();
        container.setSpacing(10);
        container.getChildren().addAll(imgLoader1, imgLoader2);

        scene = new Scene(container);

        // Set up the stage and set it to be visible
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("1302 Image Viewer!");
        stage.sizeToScene();
        stage.show();
        
    } // start
    
} // ImageApp

