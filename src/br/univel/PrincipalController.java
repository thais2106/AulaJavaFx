package br.univel;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrincipalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txfCodigo;

    @FXML
    private TextField txfNome;

    @FXML
    private Button btnSalvar;

    @FXML
    void salvar(ActionEvent event) {
    	String codigo = txfCodigo.getText();
    	String nome = txfNome.getText();
    	
    	System.out.println(codigo + "\t" + nome);
    }

    @FXML
    void initialize() {
        assert txfCodigo != null : "fx:id=\"txfCodigo\" was not injected: check your FXML file 'Principal.fxml'.";
        assert txfNome != null : "fx:id=\"txfNome\" was not injected: check your FXML file 'Principal.fxml'.";
        assert btnSalvar != null : "fx:id=\"btnSalvar\" was not injected: check your FXML file 'Principal.fxml'.";

    }
}
