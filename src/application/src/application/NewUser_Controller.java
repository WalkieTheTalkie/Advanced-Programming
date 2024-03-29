package application;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class NewUser_Controller {
	
	@FXML ToggleGroup options;

	@FXML
	private RadioButton Employee;

	@FXML
	private RadioButton Volunteer;

	@FXML
	private TextField Username;

	@FXML
	private TextField Password;

	@FXML
	private TextField Minitial;

	@FXML
	private TextField Fname;

	@FXML
	private TextField Lname;

	@FXML
	private TextField Email;

	@FXML
	private TextField Phone;

	@FXML
	private TextField Gender;

	@FXML
	private TextField Address;

	@FXML
	private TextField BirthDate;

	@FXML
	private TextField EmergencyContact;

	@FXML
	private Button AddUser;

	public void initialize() {
		AddUser.setOnAction((event) -> {
			EmployeeClass e = new EmployeeClass();
			Volunteer v = new Volunteer();
			int sent = 0;

			if (Employee.isSelected()) {
				sent = 1;
				e.setFirstName(Fname.getText());
				e.setLastName(Lname.getText());
				e.setMiddleInitial(Minitial.getText());
				e.setBirthDate(BirthDate.getText());
				e.setGender(Gender.getText());
				e.setEmail(Email.getText());
				e.setEmergencyContact(EmergencyContact.getText());
				e.setPhone(Phone.getText());
				e.setEmployeeUser(Username.getText());
				e.setEmployeePass(Password.getText());
				e.setAddress(Address.getText());
				
				System.out.println(e.toString());
				
				DBEmployee emp = new DBEmployee(e);
				
			}else if (Volunteer.isSelected()) {
				sent = 2;
				v.setFirstName(Fname.getText());
				v.setLastName(Lname.getText());
				v.setMiddleInitial(Minitial.getText());
				v.setBirthDate(BirthDate.getText());
				v.setGender(Gender.getText());
				v.setEmail(Email.getText());
				v.setEmergencyContact(EmergencyContact.getText());
				v.setPhone(Phone.getText());
				v.setAddress(Address.getText());
				v.setUserName(Username.getText());
				v.setPassword(Password.getText());
				v.setCourtOrdered(false);
				
				System.out.println(v.toString());
				
				DBVolunteer volun = new DBVolunteer(v);
			}
		});
	}

}
