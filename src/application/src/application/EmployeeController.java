package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class EmployeeController {
	@FXML
	private ToggleGroup options;
	
	@FXML
	private RadioButton viewProfile;

	@FXML
	private RadioButton editProfile;

	@FXML
	private RadioButton viewWorkHours;

	@FXML
	private RadioButton logWorkHours;

	@FXML
	private TextArea area;

	@FXML
	private Button selected;

	@FXML
	private Button submit;

	public void initialize() {
		selected.setOnAction((event) -> {
			EmployeeClass e = new EmployeeClass("firstName", "middleInitial", "lastName", "email", "phone", "gender",
					"address", "birthDate", "emergencyContact");
			e.setEmployeeID(1000); 
			e.setWorkinHours(6); 
			e.setEmployeeUser("employeeUser"); 
			e.setEmployeePass("employeePass");
			
			if(viewProfile.isSelected()){
				area.appendText(e.toString());
				area.appendText("\n\n ------------- \n\n");
			}else if(editProfile.isSelected()) {
				
			}else if(viewWorkHours.isSelected()) {
				
			}else if(logWorkHours.isSelected()) {
				
			}else {
				System.out.println("This is not working");
			}
			
		});
	}

}
