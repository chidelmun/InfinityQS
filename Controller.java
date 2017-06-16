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
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.application.Platform;


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

    @FXML
    private Stage window;

     @FXML
    private MenuItem newentry;



    @FXML
    void getSoftwareVersion(ActionEvent event) throws Exception {
    	window = new Stage();
    	System.out.println("v1.0.0.9 Beta");
    	Parent root = FXMLLoader.load(getClass().getResource("version.fxml"));
        window.setTitle("InfinityQS v1.0.0.9 Beta");
        window.setScene(new Scene(root, 502, 135));
        window.setResizable(false);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }


    @FXML
    void addNewEmployee(ActionEvent event)  throws Exception{
    	System.out.println("Adding New Employee..");
    	System.out.println("Connecting to Database");
    	Stage window = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("new_entry.fxml"));
    	window.setTitle("Add New Employee");
    	window.setResizable(false);
    	window.setScene(new Scene(root,640,400));
    	window.show();
    }

    

    @FXML
    void quitApp(ActionEvent event) {
    	System.out.println("Quit Button Clicked");
    	 Platform.exit();
    }





}