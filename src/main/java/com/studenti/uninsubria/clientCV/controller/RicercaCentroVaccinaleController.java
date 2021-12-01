package com.studenti.uninsubria.clientCV.controller;

import com.studenti.uninsubria.clientCV.model.TipologiaCentroVaccinaleModel;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class RicercaCentroVaccinaleController implements Initializable {

    // <editor-fold desc="Attributi">

    public Label lblNomeMancante,lblComuneOTipologiaMancanti;
    public Button btnMostraRisultati;
    public TextField txtFieldNome,txtFieldComune;
    public ComboBox<String> cBoxTipologia;
    public CheckBox checkBoxNome,checkBoxComuneETipologia;
    public ListView<String> listViewCentriVaccinali;

    // </editor-fold>

    public void ricercaCentriVaccinali() {
        if (checkBoxNome.isSelected()) {
            String nome = txtFieldNome.getText();

            if(nome.isBlank()){
                lblNomeMancante.setVisible(true);
                return;
            }

            //ricerca per nome con comandi SQL (aspettare collegamento a DB)
            String query = "SELECT * FROM centrivaccinali WHERE nome LIKE '%" + nome.toLowerCase() + "%'";

        } else if(checkBoxComuneETipologia.isSelected()){
            String comune = txtFieldComune.getText();
            String tipologia = cBoxTipologia.getValue();

            if(comune.isBlank() || tipologia == null){
                lblComuneOTipologiaMancanti.setVisible(true);
            }

            //ricerca per comune o tipologia con comandi SQL (aspettare collegamento a DB)

            String query = "SELECT * FROM centrivaccinali WHERE comune LIKE '%"+ comune +"%' AND tipologia='"+ tipologia +"'";
        }
    }

    public void popolazioneView(){
        // popolazione con comandi SQL (aspettare collegamento DB)
        String query = "SELECT * FROM centrivaccinali";
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        String[] tipologia = {
                TipologiaCentroVaccinaleModel.AZIENDALE.toString(),
                TipologiaCentroVaccinaleModel.HUB.toString(),
                TipologiaCentroVaccinaleModel.OSPEDALIERO.toString()
        };
        cBoxTipologia.getItems().addAll(tipologia);

    }
}
