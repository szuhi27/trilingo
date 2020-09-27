package trilingo.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


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
        numberOfQuestionsAvailable = 0;
        answ1 = new String[999];
        answ2 = new String[999];
        answ3 = new String[999];
        answ4 = new String[999];
        correctAnsw = new String[999];
        int i = 0;
        FileReader fr;
        BufferedReader reader = null;
        try {
            fr = new FileReader("qaa.txt");
            reader = new BufferedReader(fr);
            String currentLine = reader.readLine();

            int[] ra = new int[]{2, 3, 4, 5};
            while (currentLine != null) {
                String[] resultDetail = currentLine.split(",");
                if (resultDetail[0].equals(language) && resultDetail[1].equals(chosenDiff)) {
                    shuffleArray(ra);
                    answ1[i] = resultDetail[ra[0]];
                    answ2[i] = resultDetail[ra[1]];
                    answ3[i] = resultDetail[ra[2]];
                    answ4[i] = resultDetail[ra[3]];
                    correctAnsw[i++] = resultDetail[6];
                    ++numberOfQuestionsAvailable;
                }
                currentLine = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("Nem létezik a kérdések fájlja!");
        } catch (IOException e) {
            System.err.println("IO kivétel!");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void shuffleArray(int[] ar) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

}
