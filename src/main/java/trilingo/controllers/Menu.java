package trilingo.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;




public class Menu {

    @FXML
    public Pane gameP, languagesP, difficultiesP;
    @FXML
    public ImageView questionIV, bcgIV, resultIV, answ1IV, answ2IV, answ3IV, answ4IV, engIV, russIV, finnIV,
            easyIV, mediumIV, proIV, menuIV, muteIV, exitIV;
    @FXML
    public Button answ1B, answ2B, answ3B, answ4B;
    @FXML
    public Text resultT;
    @FXML
    public StackPane resultSP;

    private String language, chosenDiff;
    private String[] answ1, answ2, answ3, answ4, correctAnsw, images;
    private int[] previousQuestions;

    private int numberOfQuestionsAsked, questionNumber, numberOfQuestionsAvailable = 0, goodAnswers;
    MediaPlayer a;
    private boolean music=true;

    @FXML
    public void initialize() {
        LoadImages();
        music();
    }


    public void Game(){
        LoadData();
        SetVariables();
    }

    private void SetVariables() {
        previousQuestions = new int[numberOfQuestionsAvailable];
        for(int i = 0; i< numberOfQuestionsAvailable; i++){
            previousQuestions[i] = -1;
        }
        numberOfQuestionsAsked = 0;
    }

    private void LoadData(){
        
    }

}
