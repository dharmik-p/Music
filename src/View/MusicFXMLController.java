/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.imageio.ImageIO;

/**
 * FXML Controller class
 *
 * @author dharm
 */
public class MusicFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
   
    @FXML
    private TextField musicNameTf;

    @FXML
    private TextField albumTf;

    @FXML
    private ComboBox genreTf;
    @FXML
    private Label submitLabel;

    @FXML
    private DatePicker dateTf;
    @FXML
    private Button getfile;
    
    private File imageFile;
    
    @FXML
    private ImageView imageTf;

    
        @FXML
    public void saveMusicButton(ActionEvent event) throws IOException{
     getSubmission();
       StringBuilder x = new StringBuilder();
       
       
       x.append("\n" + musicNameTf.getText().toString()+ "\t");
       x.append("\n"+ albumTf.getText().toString()+ "\t");
       x.append("\n"+ dateTf.getValue().toString()+ "\t");
       x.append("\n"+ genreTf.getValue().toString()+ "\t");
       
       
       File file = new File("C:\\Users\\dharm\\Documents\\NetBeansProjects\\Music");
       FileWriter newFile = new FileWriter(file);
       newFile.write(x.toString());
       newFile.close();
        
    }
    public void getSubmission() {
        submitLabel.setText("Thanks");

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        genreTf.getItems().add("Rock");
        genreTf.getItems().add("Jazz");
        genreTf.getItems().add("Opera");
        genreTf.getItems().add("Pop");
        genreTf.getItems().add("Romantic");
        genreTf.setValue("Pop");
    
         try {
            imageFile = new File("./src/images/image.jpg");
            BufferedImage image = ImageIO.read(imageFile);
            Image images = SwingFXUtils.toFXImage(image, null);
            imageTf.setImage(images);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }    
    
}
