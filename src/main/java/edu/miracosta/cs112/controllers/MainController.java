package edu.miracosta.cs112.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class MainController {
    @FXML
    protected void onHelloButtonClick(ActionEvent actionEvent) {
        System.out.println("Hello World!");
    }
}