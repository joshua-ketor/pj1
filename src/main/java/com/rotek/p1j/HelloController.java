package com.rotek.p1j;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button btnCopy;

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblDisplay;

    @FXML
    private Label lblLogin;

    @FXML
    private TextArea txtArea;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void onCopy(ActionEvent event) {
        // copy text from txtArea to lblDisplay
        lblDisplay.setText(txtArea.getText());
        // reset the text of txtArea to nothing
        txtArea.setText("");
    }

    @FXML
    void onClear(ActionEvent event) {
        // clear the text of both username and password
        txtUsername.setText("");
        txtPassword.setText("");
    }

    @FXML
    void onLogin(ActionEvent event) {
        // username: admin
        // password: 1234
        if (txtUsername.getText().equals("admin") && txtPassword.getText().equals("1234")) {
            lblLogin.setText("Login Successful");
            // set color of lblLogin to green
            lblLogin.setStyle("-fx-text-fill: green");
        } else {
            lblLogin.setText("Login Failed.\nRetry again");
            lblLogin.setStyle("-fx-text-fill: red");

            // run the onClear method
            onClear(event);
        }

    }

}
