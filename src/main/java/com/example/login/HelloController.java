package com.example.login;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class HelloController {
    @FXML
    private PasswordField passText;
    @FXML
    private Label displayText;

    String p;
    Log L = new Log();
    @FXML
    protected void onSubmit() {
        p = passText.getText();
        displayText.setText(p);
        passText.clear();
        Log.AppendToLog(p);
    }
}