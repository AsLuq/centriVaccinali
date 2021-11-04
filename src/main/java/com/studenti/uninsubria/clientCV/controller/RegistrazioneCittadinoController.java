package com.studenti.uninsubria.clientCV.controller;

import com.studenti.uninsubria.clientCV.CentriVaccinali;
import com.studenti.uninsubria.clientCV.model.CittadinoVaccinatoModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.InputMethodEvent;

import java.util.logging.Handler;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrazioneCittadinoController {

    public Button btnRegistrati, btnAnnulla;
    public TextField txtNome, txtCognome, txtCodiceFiscale, txtEmail, txtUsername, txtIDvaccinazione;
    public PasswordField txtPassword;
    public Label lblEmailError;
    public Label lblCFerror;

    private CittadinoVaccinatoModel cittadinoVaccinatoModel;

    public void registraCittadino(){

        cittadinoVaccinatoModel = new CittadinoVaccinatoModel();
        cittadinoVaccinatoModel.setNome(txtNome.getText());
        cittadinoVaccinatoModel.setCognome(txtCognome.getText());
        cittadinoVaccinatoModel.setCf(txtCodiceFiscale.getText());
        cittadinoVaccinatoModel.setMail(txtEmail.getText());
        cittadinoVaccinatoModel.setPassword(txtPassword.getText());

        String IDvaccinazione = txtIDvaccinazione.getText();
        cittadinoVaccinatoModel.toString();

        if (cittadinoVaccinatoModel.getNome().isBlank() ||
                cittadinoVaccinatoModel.getCognome().isBlank() ||
                cittadinoVaccinatoModel.getCf().isBlank() ||
                cittadinoVaccinatoModel.getMail().isBlank() ||
                IDvaccinazione.isBlank() ||
                cittadinoVaccinatoModel.getPassword().isBlank()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Errore durante la fase di registrazione");
            alert.setContentText("Compilare tutti i campi per effettuare la registrazione.");
            alert.showAndWait();
        }
    }

    public boolean checkEmail (String email){
        String  EMAIL_PATTERN = ("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean checkCF(String cf){
        String CF_PATTERN = ("^(?:[A-Z][AEIOU][AEIOUX]|[B-DF-HJ-NP-TV-Z]{2}[A-Z]){2}(?:[\\dLMNP-V]{2}(?:[A-EHLMPR-T](?:[04LQ][1-9MNP-V]" +
                "|[15MR][\\dLMNP-V]|[26NS][0-8LMNP-U])|[DHPS][37PT][0L]|[ACELMRT][37PT][01LM]|[AC-EHLMPR-T][26NS][9V])|(?:[02468LNQSU][048LQU]|" +
                "[13579MPRTV][26NS])B[26NS][9V])(?:[A-MZ][1-9MNP-V][\\dLMNP-V]{2}|[A-M][0L](?:[1-9MNP-V][\\dLMNP-V]|[0L][1-9MNP-V]))[A-Z]+$");
        Pattern pattern = Pattern.compile(CF_PATTERN);
        Matcher matcher = pattern.matcher(cf);
        return matcher.matches();
    }

    public void EmailTextChanged(InputMethodEvent inputMethodEvent) {
           if(!checkEmail(cittadinoVaccinatoModel.getMail())) { lblEmailError.setVisible(true); }
    }

    public void CfTextChanged(InputMethodEvent inputMethodEvent) {
           if(!checkCF(cittadinoVaccinatoModel.getCf())) { lblCFerror.setVisible(true); }
    }
}
