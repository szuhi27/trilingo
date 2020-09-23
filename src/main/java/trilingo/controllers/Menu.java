package trilingo.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;




public class Menu {

    @FXML
    public VBox languagesVB, difficultiesVB;
    @FXML
    public Pane gameP;
    @FXML
    public ImageView questionIV;

    private String language, difficulty;


    @FXML
    public void initialize() {

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
