package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WorkHourController {
	@FXML
	private ImageView view;
	
	@FXML
	private Button submit;
	
	@FXML
	private TextField text;
	
	@FXML
	public void initialize() {
		Image i = new Image("image.jpg");
		view.setImage(i);
		
		submit.setOnAction((event) -> {
			
		});
	}
	
}
