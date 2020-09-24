package trilingo.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
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

    public void ChooseLanguage(ActionEvent event){
        language = ((Button)event.getSource()).getText();
        System.out.println(language);
        languagesVB.setVisible(false);
        difficultiesVB.setVisible(true);
    }

    public void ChooseDifficulty(ActionEvent event){
        difficulty = ((Button)event.getSource()).getText();
        System.out.println(difficulty);
        difficultiesVB.setVisible(false);
        gameP.setVisible(true);
        game();
    }

    public void game(){
        //Ide kerül majd a körök cseréje stb.
        questionIV.setImage(new Image(getClass().getResource("/images/bcgs/ph.png").toExternalForm()));


    }

}
