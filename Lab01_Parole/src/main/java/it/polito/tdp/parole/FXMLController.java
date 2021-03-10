package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class FXMLController {
	
	Parole elenco = new Parole();
	double add = 0.0;
	double rem = 0.0;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private Button btnCancella;
    
    @FXML
    private Label txtTempoAdd;
    
    @FXML
    private Label txtTempoRem;
    
    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	elenco.addParola(txtParola.getText());
    	txtResult.setText(elenco.toString());
    	txtParola.setText("");
    	add += System.nanoTime()/1000000000;
    	txtTempoAdd.setText("Tempo add: " + add/elenco.size() + "s");
    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	txtResult.setText("");
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	elenco.cancella(txtResult.getSelectedText());
    	txtResult.setText(elenco.toString());
    	rem += System.nanoTime()/1000000000;
    	txtTempoRem.setText("\nTempo rem: " + rem/elenco.size() + "s");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
