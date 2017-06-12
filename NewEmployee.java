import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.event.*;
import java.net.URL;
import java.util.ResourceBundle;

public class NewEmployee implements Initializable {

    @FXML
    private TextField firstName;

    @FXML
    private Button saveButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }

    @FXML
    void saveEmployee(ActionEvent event) {
    	saveButton.getScene().getWindow().hide();
    }

}
