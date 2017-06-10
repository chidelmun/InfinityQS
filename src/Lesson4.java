import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Lesson4 extends Application{
	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage primaryStage){

		primaryStage.setTitle("JavaFX Lesson Four !!!");

		VBox layout1 = new VBox();
		StackPane layout2 = new StackPane();
		Button btn = new Button("Click Me");
		Button button = new Button("Switch View");
		Label label = new Label("Welcome to Scene");

		layout1.getChildren().add(btn);
		layout2.getChildren().add(button);
		layout1.getChildren().add(label);
		Scene scene1 = new Scene(layout1,450,500);
		Scene scene2 = new Scene(layout2, 800,800);

		btn.setOnAction((ActionEvent ev)->{
			primaryStage.setScene(scene2);
		});

		button.setOnAction((ActionEvent ev)->{
			primaryStage.setScene(scene1);
		});

		
		primaryStage.setScene(scene1);
		primaryStage.show();

	}
}