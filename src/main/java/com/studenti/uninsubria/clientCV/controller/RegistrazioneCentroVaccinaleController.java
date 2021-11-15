package com.studenti.uninsubria.clientCV.controller;

import com.studenti.uninsubria.clientCV.model.CentroVaccinaleModel;
import com.studenti.uninsubria.clientCV.model.TipologiaCentroVaccinaleModel;
import com.studenti.uninsubria.clientCV.utility.Utility;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class RegistrazioneCentroVaccinaleController implements Initializable {

    // <editor-fold desc="Attributi">

    public Button btnRegistra,btnAnnulla;
    public TextField txtFieldNome,txtFieldNumeroCivico,txtFieldComune,txtFieldProvincia,txtFieldCap;
    public Label lblCapNonValido,lblProvinciaNonValida,lblCivicoNonValido,lblCompilaTuttiICampi;
    public ComboBox<String> cBoxTipologia,cBoxQualificatore;
    public BorderPane bPaneRegistrazione;
    public Label lblNomeCentroVaccinale,lblRegistrazione,lblTipologia,lblCap,lblProvincia,lblComune,lblNumeroCivico,lblQualificatore;

    // </editor-fold>
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        String[] qualificatore = {
                "Via",
                "Viale",
                "Piazza",
                "Corso"};
        cBoxQualificatore.getItems().addAll(qualificatore);


        String[] tipologia = {
                TipologiaCentroVaccinaleModel.AZIENDALE.toString(),
                TipologiaCentroVaccinaleModel.HUB.toString(),
                TipologiaCentroVaccinaleModel.OSPEDALIERO.toString()
        };
        cBoxTipologia.getItems().addAll(tipologia);

    }

    public void registraCentroVaccinale() {

        Utility utility = new Utility();

        CentroVaccinaleModel centroVaccinaleModel = new CentroVaccinaleModel();
        centroVaccinaleModel.setNome(txtFieldNome.getText());
        centroVaccinaleModel.setVia(cBoxQualificatore.getSelectionModel().getSelectedItem());
        centroVaccinaleModel.setNumeroCivico(Integer.parseInt(txtFieldNumeroCivico.getText()));
        centroVaccinaleModel.setComune(txtFieldComune.getText());
        centroVaccinaleModel.setProvincia(txtFieldProvincia.getText());
        centroVaccinaleModel.setCap(txtFieldCap.getText());
        centroVaccinaleModel.setTipologiaCentroVaccinaleModel(TipologiaCentroVaccinaleModel.valueOf(cBoxTipologia.getSelectionModel().getSelectedItem()));

        centroVaccinaleModel.toString();

        if(!utility.isCapValid(lblCap.getText())){
            lblCapNonValido.setVisible(true);
        }

        if(!utility.isProvinciaValid(lblProvincia.getText())){
            lblProvinciaNonValida.setVisible(true);
        }

        if(!utility.isCivicoValid((lblNumeroCivico.getText()))){
            lblCivicoNonValido.setVisible(true);
        }

        if (centroVaccinaleModel.getNome().isBlank() || centroVaccinaleModel.getVia().isBlank() ||
                String.valueOf(centroVaccinaleModel.getNumeroCivico()).isBlank() || centroVaccinaleModel.getComune().isBlank() ||
                centroVaccinaleModel.getProvincia().isBlank() || centroVaccinaleModel.getCap().isBlank() ||
                centroVaccinaleModel.getTipologiaCentroVaccinaleModel().toString().isBlank()) {

            lblCompilaTuttiICampi.setVisible(true);

        }
    }

}
