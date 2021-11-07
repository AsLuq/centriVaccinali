package com.studenti.uninsubria.clientCV.controller;

import com.studenti.uninsubria.clientCV.model.CittadinoVaccinatoModel;
import javafx.scene.control.*;
import com.studenti.uninsubria.clientCV.utility.Utility;

public class RegistrazioneCittadinoController {

    public Button btnRegistrati, btnAnnulla;
    public TextField txtNome, txtCognome, txtCodiceFiscale, txtEmail, txtUsername, txtIDvaccinazione;
    public PasswordField txtPassword;
    public Label lblEmailError;
    public Label lblCFerror;

    private CittadinoVaccinatoModel cittadinoVaccinatoModel;

    public void registraCittadino(){
        Utility utility = new Utility();

        cittadinoVaccinatoModel = new CittadinoVaccinatoModel();
        cittadinoVaccinatoModel.setNome(txtNome.getText());
        cittadinoVaccinatoModel.setCognome(txtCognome.getText());
        cittadinoVaccinatoModel.setCf(txtCodiceFiscale.getText());
        cittadinoVaccinatoModel.setMail(txtEmail.getText());
        cittadinoVaccinatoModel.setPassword(txtPassword.getText());

        String IDvaccinazione = txtIDvaccinazione.getText();
        cittadinoVaccinatoModel.toString();

        if(!utility.isCFValid(txtCodiceFiscale.getText())){
            lblCFerror.setText("Codice fiscale non valido");
            lblCFerror.setVisible(true);
        }
        else
            lblCFerror.setVisible(false);

        if(!utility.isEmailValid(txtEmail.getText())) {
            lblEmailError.setText("Email non valida");
            lblEmailError.setVisible(true);
        }
        else
            lblEmailError.setVisible(false);

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



}
