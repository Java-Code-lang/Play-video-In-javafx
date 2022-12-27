/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play_video;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.io.File;
import java.io.IOException;
import java.net.URI;
/**
 *
 * @author freec
 */
public class FXMLDocumentController implements Initializable {
    //-----------------
  
    
    
    
                                             // replace with location of your video file
     static File file = new File("C:\\Youtube_Tutorials\\src\\play_video\\Intro.mp4");

static URI p= file.toURI(); 

  static    Media m= new Media(p.toString());
    static   MediaPlayer mp= new MediaPlayer(m);
       
      @FXML
   public MediaView mv;

   
    
    
    
    
       
    
    //---------
   
    
   
   @FXML
   private Button skip;
   @FXML
   private Button play;
   
    @FXML
   private Button pause;
   
    @FXML
    private void Onpause(ActionEvent event) throws IOException {
    

         mp.pause();
   
    
      
    }
     @FXML
    private void Onplay(ActionEvent event) throws IOException {
    

         mp.play();
   
    
      
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
       
      
       mv.setFitHeight(720);
       mv.setFitWidth(1280);
        mv.setMediaPlayer(mp);
       mp.play();
       if(mp.getStatus()==MediaPlayer.Status.STOPPED){
              

   
          new  Stage().close();
 
       }
    }    
                               

    
}