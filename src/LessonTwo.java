import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class LessonTwo extends Application{
	public static void main(String[] args) {
		launch(args);
		
	}

	// @overrride start

	public void start(Stage primaryStage) throws Exception{
		primaryStage.setTitle("JavaFX Lesson Two");
		Button button  = new Button("Click Here");
		Button btn = new Button("Login");
		Button btn2 = new Button("You Suck");
		button.setOnAction((ActionEvent event)->{

			System.out.println("Button was clicked");
		});

		btn.setOnAction((ActionEvent ev)->{
			System.out.println("This button was clicked");
		});

		btn2.setOnAction((ActionEvent event)->{
			System.out.println("Yay You suck !!!");
			button.setText("You Suck");
		});

		VBox layout = new VBox();
		Scene scene = new Scene(layout,500,500);
		layout.getChildren().add(button);
		layout.getChildren().add(btn);
		layout.getChildren().add(btn2);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	//@ override to handle button click

	public void handle(ActionEvent event){
		System.out.println("Button Two  was clicked");
	}
}
