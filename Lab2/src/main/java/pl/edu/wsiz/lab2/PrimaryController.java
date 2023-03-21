package pl.edu.wsiz.lab2;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PrimaryController {

    
    @FXML private Label LabelTxt;
    @FXML private RadioButton niebieski;
    @FXML private RadioButton ziel;
    @FXML private RadioButton Radio_1;
    @FXML private RadioButton Radio_2;
    @FXML private RadioButton Radio_3;
    @FXML private ImageView obrazek;
    @FXML private RadioButton home;
    @FXML private RadioButton calendar;
    @FXML private RadioButton contacts;
    
    
    
    
   @FXML
   private void kolor_nieb(){
   LabelTxt.setTextFill(Color.BLUE);
   };

   @FXML
   private void kolor_ziel(){
   LabelTxt.setTextFill(Color.GREEN);
   }
    
   @FXML
   private void kolor_czerw(){
   LabelTxt.setTextFill(Color.RED);
   }
   
   @FXML
     private void numer_1(){
   LabelTxt.setText("1");
   }
  
   @FXML
   private void numer_2(){
   LabelTxt.setText("2");
   }
  
   @FXML
   private void numer_3(){
   LabelTxt.setText("3");
   }
   
   @FXML
   private void showCalendar(){
   
   obrazek.setImage(new Image(getClass().getResourceAsStream("Calendar.jpg")));
   
   }
    @FXML
    private void showHome(){
   
   obrazek.setImage(new Image(getClass().getResourceAsStream("Home.jpg")));
   
   }
    @FXML
      private void showContacts(){
   
   obrazek.setImage(new Image(getClass().getResourceAsStream("Contacts.jpg")));
   
   }  
   
      
   @FXML
private void closeApp(){

Platform.exit();
}   
      
      
    
    }



    













