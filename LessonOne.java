import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LessonOne extends Application{


	public static void main(String[] args) {
		launch(args); 		// Initialize JavaFX
		
	}

	// @override
	public void start(Stage primaryStage) throws Exception{
		System.out.println("JavaFX application Started....");
		primaryStage.setTitle("JavaFX LessonOne");
		Button button = new Button("Click Me");

		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}