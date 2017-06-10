import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.fxml.FXMLLoader;

public class HomeController {

    //@FXML
    private Label label1 ;
    //@FXML
    private Label label2 ;

    // called by the FXML loader after the labels declared above are injected:
    public void initialize() {

        // do initialization and configuration work...

        // trivial example, could also be done directly in the fxml:
        label1.setText("Foo");
        label2.setText("Bar");
    }
}