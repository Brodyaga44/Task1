package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label Ans;
    @FXML
    private Label Result;
    @FXML
    private TextField BodyMass;
    @FXML
    private TextField BodyHeight;

    @FXML
    protected void onHelloButtonClick() {
        Ans.setText("Welcome to JavaFX Application!");
    }

    public void onCount(ActionEvent actionEvent) {
        final BMI bmi = new BMI(Float.valueOf(BodyHeight.getText()),Float.valueOf(BodyMass.getText()));
        Ans.setText(String.valueOf(bmi.calculate()));
        if (bmi.diagnosis()) {
            Result.setText("Вывод: Ваш ИМТ в норме");
            Result.setStyle("-fx-text-fill: green;");

        }
        else {
           Result.setText("Вывод:  Ваш ИМТ вне нормы");
            Result.setStyle("-fx-text-fill: red;");
        }

    }
}