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
import javafx.scene.control.ToggleGroup;
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
	private ToggleGroup users;

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
		newUser.setOnAction((event) -> {
			Stage secondStage = new Stage();
			try {
				secondStage.setTitle("Aurora Food Pantry New Volunteer Page");
				AnchorPane root = FXMLLoader.load(getClass().getResource("New_Volunteer.fxml"));
				Scene scene = new Scene(root, 700, 700);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				secondStage.setScene(scene);
				secondStage.show();
			} catch (Exception e) {
				e.printStackTrace();

			}
		});

		Continue.setOnAction((event) -> {
			Stage thirdStage = (Stage) Continue.getScene().getWindow();
			if (Volunteer.isSelected()) {
				try {
					
					thirdStage.setTitle("Aurora Food Pantry Volunteer Page");
					BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Volunteer_Scene.fxml"));
					Scene scene = new Scene(root, 700, 700);
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					thirdStage.setScene(scene);
					thirdStage.show();
				} catch (Exception e) {
					e.printStackTrace();

				}
			} else if (Employee.isSelected()) {
				try {
					thirdStage.setTitle("Aurora Food Pantry Employee Page");
					AnchorPane root = FXMLLoader.load(getClass().getResource("Employee_Scene.fxml"));
					Scene scene = new Scene(root, 700, 700);
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					thirdStage.setScene(scene);
					thirdStage.show();
				} catch (Exception e) {
					e.printStackTrace();

				}
			} else if (Admin.isSelected()) {
				try {
					thirdStage.setTitle("Aurora Food Pantry Admin Page");
					BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
					Scene scene = new Scene(root, 700, 700);
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					thirdStage.setScene(scene);
					thirdStage.show();
				} catch (Exception e) {
					e.printStackTrace();

				}
			} else {
				System.out.println("You need to select a radio button.");
			}
		});
	}

}
