import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class Lesson3 extends Application{
	public static void main(String[] args){
		launch(args);
	}


	public void start(Stage primaryStage){
		primaryStage.setTitle("JavaFX Lesson 3");
		VBox layout = new VBox();
		Scene scene = new Scene(layout, 450,450);
		Button button = new Button("Click Here");
		button.setOnAction((ActionEvent ev)->{
			button.setText("Yay!!");
		});

		layout.getChildren().add(button);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}