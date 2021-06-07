package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Ejer1Probar {

    @FXML
    private DatePicker dt1_id;
    
    @FXML
    private Label lbl1_id;
    
    @FXML
    private ComboBox<?> combo1_id;

    @FXML
    void mostrar(ActionEvent event) {
    	LocalDate date = dt1_id.getValue();
    	final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MMMM uuuu", Locale.ENGLISH);
    	String fecha = dtf.format(date);
    	lbl1_id.setText(fecha);
    	
    	
    }
    
    
    
    
    
    

}