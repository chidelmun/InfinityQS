import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.fxml.FXMLLoader;



public class Lesson6 extends Application{
	public static void main(String[] args){
		launch(args);

	}

	public void start(Stage window) throws Exception {
		 Parent view = FXMLLoader.load(getClass().getResource("home.fxml"));
		window.setTitle("JavaFX Lesson Six");
		Scene scene = new Scene(view, 500,500);
		window.setScene(scene);



	}
}