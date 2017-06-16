import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.event.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Users  implements Initializable{

    @FXML
    private ListView<String> userslist;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
        for (int i=0; i<10 ;i++ ) {
        	userslist.getItems().add("Dario");	
        }
    }


}