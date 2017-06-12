import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;


public class Controller implements Initializable {


	@FXML
    private MenuItem version;

    @FXML
	private MenuItem quitbutton;


    @FXML
    private Font x1;

    @FXML
    private Color x2;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

    @FXML
    void getSoftwareVersion(ActionEvent event) throws Exception {
    	Stage window = new Stage();
    	System.out.println("v1.0.0.9 Beta");
    	Parent root = FXMLLoader.load(getClass().getResource("version.fxml"));
        window.setTitle("InfinityQS v1.0.0.9 Beta");
        window.setScene(new Scene(root, 502, 135));
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }

    @FXML
    void quitApplicationAction(ActionEvent event) {
    	System.out.println("Quit Button Clicked");
    }






}