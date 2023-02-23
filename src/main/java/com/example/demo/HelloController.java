package com.example.demo;

import com.entity.Championship;
import com.utils.Utils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
        Championship championship= Utils.initChampionship();
        welcomeText.setText(championship.affichagePoints().toString());
    }
}