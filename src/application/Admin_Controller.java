package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Admin_Controller {
	
	@FXML
	private TextArea typeHere;
	
	@FXML
	private RadioButton Employee;
	
	@FXML
	private RadioButton Admin;
	
	@FXML
	private RadioButton Volunteer;
	
	@FXML 
	private TextField searchField;
	
	@FXML
	private Button searchButton;
}
