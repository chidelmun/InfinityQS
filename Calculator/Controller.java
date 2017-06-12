import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.event.*;

public class Controller {

    @FXML
    private Button zerobutton;

    @FXML
    private Button perionButton;

    @FXML
    private Label result;

    @FXML
    void getPeriodValue(ActionEvent event) {
    	System.out.println("Period Button Clicked");
    	result.setText(zerobutton.getText());
    }

    @FXML
    void getZeroButtonValue(ActionEvent event) {
    	System.out.println("Zero Button Clicked");
    	System.out.println(result.getText());
    	result.setText("Clicked");
    }

}
