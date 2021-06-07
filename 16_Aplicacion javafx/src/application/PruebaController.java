package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class PruebaController {

    @FXML
    private Button btn1_id;

    @FXML
    private CheckBox cb1_id;

    @FXML
    private Label lbl1_id;
    
    @FXML
    private ComboBox<?> cbl1_id;
    
    @FXML
    void mostrar(ActionEvent event) {
    	lbl1_id.setText("Boton pulsar");
    	cb1_id.setSelected(true);

    }

}