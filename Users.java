import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.event.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;

public class Users  implements Initializable{

    @FXML
    private ListView<String> userslist;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	String[] users = {
    		"Ntabe Junior",
    		"Um Nyobe",
    		"Nyah Check",
    		"Isaac Kamga",
    		"Acho Arnold",
    		"Kwibang Jephte",
    		"Nappy Thiery",
    		"Fogue Fabrice",
    		"Nyonse Nyami Billy",
    		"Otto Akama"
    	};
        System.out.println("View is now loaded!");
        for (int i=0; i< users.length;i++ ) {
        	userslist.getItems().add(users[i]);	
        } 
    }


    @FXML
    void handleItemclick(ActionEvent event) throws Exception {
    	 System.out.println("clicked on  this Item" );
    }
    


}