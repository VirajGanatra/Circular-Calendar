package com.example.ia_application.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class loginController {
    @FXML
    private final Label welcomeText;

    public loginController() {
        welcomeText = new Label("Welcome to the login screen!");
    }

    public loginController(Label welcomeText) {
        this.welcomeText = welcomeText;
    }

    @FXML
    protected void onLoginButtonClick() {
        welcomeText.setText("testing");
    }

    @FXML
    protected void onRegisterButtonClick() {
        welcomeText.setText("testing");
    }
}