package pl.edu.wsiz.lab1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    
    @FXML private TextField tekst_a;
    @FXML private TextField tekst_b;
    @FXML private TextField wynik;
    @FXML private TextField sub;
    @FXML private TextField div;
    @FXML private TextField tekst;
    @FXML private TextField znaki;
    @FXML private TextField slowa;
    @FXML private TextField multiplication;
       
    
   
    @FXML
    private void add() throws IOException {
     try{
     int a= Integer.parseInt( tekst_a.getText());
     int b= Integer.parseInt( tekst_b.getText()); 
     Integer c=a+b; 
     wynik.setText(c.toString());
     
     
     
     }catch(Exception e){
     wynik.setText("Popraw");
     }
    }
     @FXML 
     private void substraction() throws IOException {
     try{
     int a= Integer.parseInt( tekst_a.getText());
     int b= Integer.parseInt( tekst_b.getText()); 
     Integer c=a-b; 
     sub.setText(c.toString());
     
     }catch(Exception e){
     sub.setText("Popraw");
     } 
     
    }

     @FXML 
     private void divide() throws IOException {
     
     int a= Integer.parseInt( tekst_a.getText());
     int b= Integer.parseInt( tekst_b.getText()); 
    try{
     Integer c=b/a; 
     div.setText(c.toString());
    
    }catch(Exception e){
     div.setText("Popraw");
     } 
     }
     
     @FXML 
     private void multipl() throws IOException {
     try{
     int a= Integer.parseInt( tekst_a.getText());
     int b= Integer.parseInt( tekst_b.getText()); 
     Integer c=a*b; 
     multiplication.setText(c.toString());
     
     }catch(Exception e){
     multiplication.setText("Popraw");
     } 
     }
     
     @FXML 
     private void ileZnakow() throws IOException {
     try{
       String t=tekst.getText(); 
       int charCounter=t.length();
       int wordCounter=t.split(" ").length;
       
       
       znaki.setText(Integer.toString(charCounter));
       slowa.setText(Integer.toString(wordCounter));
       
         
     }catch(Exception e){
     multiplication.setText("Popraw");
     }
     }
     
     
     
     
     
     
     
    }   

    
