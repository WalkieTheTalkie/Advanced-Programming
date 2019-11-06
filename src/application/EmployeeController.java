package application;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

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
	private Button logOut;

	public void initialize() throws Exception {
		selected.setOnAction((event) -> {
			EmployeeTable q = new EmployeeTable();
			EmployeeClass e = new EmployeeClass();
			e = q.getEmployeeByID(1);


			if (viewProfile.isSelected()) {
				area.appendText(e.toString());
				area.appendText("\n\n ------------- \n\n");
			} else if (editProfile.isSelected()) {
				
				//following code is not fixed but should function as a popup box that should let you edit the employee.
				
				/* new EventHandler<ActionEvent>() {
			            @Override
			            public void handle(ActionEvent event) {
			                final Stage dialog = new Stage();
			                dialog.initModality(Modality.APPLICATION_MODAL);             
			                VBox dialogVbox = new VBox(20);
			                dialogVbox.getChildren().add(new Text("This is a Dialog"));
			                Scene dialogScene = new Scene(dialogVbox, 300, 200);
			                dialog.setScene(dialogScene);
			                dialog.show();
			            }
			         };*/
				area.appendText("\n\n ------------- \n\n");
			} else if (viewWorkHours.isSelected()) {
				String hours = "Working Hours:" + e.getWorkinHours();
				area.appendText(hours);
				area.appendText("\n\n ------------- \n\n");
			} else if (logWorkHours.isSelected()) {
				int hours = Integer.parseInt(area.getText()) + e.getWorkinHours();
				e.setWorkinHours(hours);
				area.appendText("\n\nWorkin hours changed to: " + e.getWorkinHours());
				area.appendText("\n\n ------------- \n\n");
			} else {
				System.out.println("This is not working");
			}

		});
		logOut.setOnAction((event) -> {
			Stage thirdStage = (Stage) logOut.getScene().getWindow();
			thirdStage.setTitle("Aurora Food Pantry Employee Page");
			BorderPane root;
			try {
				root = (BorderPane) FXMLLoader.load(getClass().getResource("HomePage.fxml"));
				Scene scene = new Scene(root, 700, 700);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				thirdStage.setScene(scene);
				thirdStage.show();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

		});
	}
}