import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;


public class Extra {
	public void display(String title, String message, Stage win){
		Stage dialog = new Stage();
		dialog.setTitle(title);
		HBox layout = new HBox();
		Button btn = new Button(message);
		btn.setOnAction((ActionEvent event)->{
			win.show();
			dialog.hide();
		});
		layout.getChildren().add(btn);
		Scene scene = new Scene(layout,550,550);
		dialog.setScene(scene);
		dialog.show();
	}
}