package com.example.javafxapp2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea windowChat;
    @FXML
    private TextField writeWindow;

    public void clickSendButton(ActionEvent actionEvent) {

       final String window = writeWindow.getText();
       if (window.isBlank()){
           return;
       }

        String text = String.format("user: %s", window);
        windowChat.appendText(text + "\n");
        writeWindow.clear();
        writeWindow.requestFocus();
    }

}