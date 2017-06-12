import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;


public class VersionController implements Initializable {

    @FXML
    private Label messageLabel;

    @FXML
    private Label detailsLabel;

    @FXML
    private HBox actionParent;

    @FXML
    private Button actionButton;

    @FXML
    private Button cancelButton;

    @FXML
    private HBox okParent;

    @FXML
    private Button okButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }

    @FXML
    void handleCancelAction(ActionEvent event) {
        System.out.println("Handle Cancel Button Action ");
        cancelButton.getScene().getWindow().hide();
    }

    @FXML
    void handleOkButton(ActionEvent event) {
        okButton.getScene().getWindow().hide();
    }



}
