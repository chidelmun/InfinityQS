import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class Lesson5 extends Application{
	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage window){
		String title = "JavaFX DialogBox";
		window.setTitle(title);
		HBox layout = new HBox();
		Button button = new Button("Click Me");
		button.setOnAction((ActionEvent event)->{
			Extra dialog = new Extra();
			dialog.display(title, "Welcome to new Dashboard", window);
			window.hide();
		});
		layout.getChildren().add(button);
		Scene scene = new Scene(layout,850,850);
		window.setScene(scene);
		window.show();
	}
}