package cs1302.gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.Priority;

public class ImageLoader extends VBox {

    /** A default image which loads when the application starts */
    private static final String DEFAULT_IMG =
        "http://cobweb.cs.uga.edu/~mec/cs1302/gui/default.png";

    /** Default height and width for Images */
    private static final int DEF_HEIGHT = 500;
    private static final int DEF_WIDTH = 500;

    /** The container for the url textfield and the load image button */
    HBox urlLayer;
    TextField urlField;
    Button loadImage;

    /** The container for the loaded image */
    ImageView imgView;

    public ImageLoader() {
        super();
        urlLayer = new HBox(10);
        urlField = new TextField("https://");
        loadImage = new Button("Load");
    
        // Adding the textfield and load image button the the containing hbox
        urlLayer.getChildren().addAll(urlField, loadImage);

        // Sets the textfield to grow, as necessary, to fill the hbox
        HBox.setHgrow(urlField, Priority.ALWAYS);

        // Load the default image with the default dimensions
        Image img = new Image(DEFAULT_IMG, DEF_HEIGHT, DEF_WIDTH, false, false);

        // Add the image to its container and preserve the aspect ratio if resized
        imgView = new ImageView(img);
        imgView.setPreserveRatio(true);

        // EventHandler for our button using a fancy method reference.
        //EventHandler<ActionEvent> loadImgHandler = this::loadImage;
        loadImage.setOnAction(this::loadImage);

        this.getChildren().addAll(urlLayer, imgView);
    }

    /**
     * Students will provide javadoc comments here.
     *
     * @param e source event
     */ 
    private void loadImage(ActionEvent e) {

        try {
            Image newImg = new Image(urlField.getText(), DEF_HEIGHT, DEF_WIDTH, false, false);
            imgView.setImage(newImg);
        } catch(IllegalArgumentException iae) {
            System.out.println("The supplied URL is invalid");
        } // try
        
    }
}