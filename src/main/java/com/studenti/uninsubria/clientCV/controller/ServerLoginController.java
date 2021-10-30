package com.studenti.uninsubria.clientCV.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * @author luqmanasghar
 */
public class ServerLoginController {
    public Label lblUsername;
    public TextField txtPassword;
    public Label lblPassword;
    public TextField txtUsername;
    public Label lblHeader;
    public Button btnLogin;
    public Button btnAnnulla;
    public Label lblErrore;

    public void LoginMouseClicked(MouseEvent mouseEvent) {

        String username = txtUsername.getText().trim();
        String password = txtPassword.getText().trim();

        // NEl CASO DI ERRORE
        lblErrore.setVisible(true);
    }
}
