import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private Button zerobutton;

    @FXML
    private Button perionButton;

    @FXML
    void getPeriodValue(ActionEvent event) {
    	System.out.println("Period Button Clicked");
    }

    @FXML
    void getZeroButtonValue(ActionEvent event) {
    	System.out.println("Zero Button Clicked");
    }

}
