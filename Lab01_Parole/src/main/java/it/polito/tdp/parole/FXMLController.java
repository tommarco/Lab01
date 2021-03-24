package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

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
    private TextArea txtTime;


    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	
    	String s="";
    
    	String parola= txtParola.getText();
    	double	opPrimo= System.nanoTime();
    	elenco.addParola(parola);
    	
    		
    			
    		for(String p: elenco.getElenco()) {
    		
    				s+=p+"\n";
    				
    
    				
 	
    			
    		}
    		txtResult.setText(s);
    		
    		
    		txtTime.setText(Double.toString(opPrimo)+"\n");
    		
    	//txtResult.appendText(elenco.getElenco()+"\n");
    	
    	
    	
    	
    	
    
    	
    	
    	// TODO
    }
    @FXML
    void doDeleteWord(ActionEvent event) {
    	
    	String s="";
    
    String parola= txtResult.getSelectedText();
    double opSecondo= System.nanoTime();
    elenco.delete(parola);
    
    txtResult.clear();
	
	
	for(String p: elenco.getElenco()) {
	
			s+=p+"\n";
			

			

		
	}
	txtResult.setText(s);
	
	txtTime.setText(Double.toString(opSecondo));
	
	

    }

    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    	elenco.reset();
    	
    //	txtResult.appendText(Integer.toString(elenco.getElenco().size()));
    	
    	txtTime.clear();
    	
    	// TODO
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
