package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class AplicacionController implements Initializable{

    @FXML
    private DatePicker dp1_id;

    @FXML
    private Label lbl1_id;

    @FXML
    private ComboBox<String> cb1_id;

    @FXML
    void consultar(ActionEvent event) {
    	 
    }

    @FXML
    void mostrar(ActionEvent event) {
    	lbl1_id.setText(dp1_id.getValue().toString());
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		cb1_id.getItems().add(0, "Madrid");
		cb1_id.getItems().add(1, "Sevilla");
		cb1_id.getItems().add(2, "Málaga");
		
		
		
	}

}