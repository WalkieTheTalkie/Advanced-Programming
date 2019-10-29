package application;

import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HomePageController {
	@FXML
	private Button Continue;
	
	@FXML
	private TextField userName;
	
	@FXML
	private TextField Password;
	
	@FXML
	private RadioButton Volunteer;
	
	@FXML
	private RadioButton Employee;
	
	@FXML
	private RadioButton Admin;
	
	@FXML
	private Hyperlink newUser;
	
	@FXML
	public void initialize() {
		newUser.setOnAction((event)->{
			System.out.println("just display a new Scene Already ");
			Stage secondStage = new Stage();
			try {
				secondStage.setTitle("Aurora Food Pantry New User Page");
				AnchorPane root = FXMLLoader.load(getClass().getResource("NewUserPage.fxml"));
				Scene scene = new Scene(root,700,700);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				secondStage.setScene(scene);
				secondStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			
		}});
		
		Continue.setOnAction((event)->{
			if(Volunteer.isSelected()) {
				
			}else if(Employee.isSelected()) {
				
			}else if(Admin.isSelected()) {
				
			}else {
				System.out.println("You need to select a radio button.");
			}
		});
	}
	
}
