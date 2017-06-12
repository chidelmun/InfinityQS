import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;

public class Controller implements Initializable {

	  private MenuItem quitbutton;

    //@Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }

    void quitApplicationAction(ActionEvent event) {
    	System.out.println("Quit Button Clicked");
    }



}