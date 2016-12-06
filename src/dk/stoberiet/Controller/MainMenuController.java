package dk.stoberiet.Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SplitMenuButton;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by fede0004@stud.kea.dk on 05-12-2016.
 */
public class MainMenuController {
	public Button bookRoom;

	public Button room;

	public void handleBookRoom() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("../View/BookRoom.fxml"));
		Stage stage = (Stage) this.bookRoom.getScene().getWindow();
		stage.setScene(new Scene(root, 600, 400));
		stage.show();
	}

	public void handleRooms() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("../View/Rooms.fxml"));
		Stage stage = (Stage) this.room.getScene().getWindow();
		stage.setScene(new Scene(root, 600, 400));
		stage.show();
	}
}