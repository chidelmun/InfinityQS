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
import java.util.*;

public class Users  implements Initializable{

    @FXML
    private ListView<String> userslist;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArrayList<String> scripts = new ArrayList<String>();
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/mailapp","root","root");  
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from users");  
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
            scripts.add(rs.getString(3));
            con.close();  
            }catch(Exception e){
                System.out.println(e);
            }
           // for (int i=0;i<scripts.size() ;++i ) {
           //     System.out.println("Printing item : " + scripts.get(i));
           // }
            System.out.println("View is now loaded!");
        for (int i=0; i< scripts.size();i++ ) {
        	userslist.getItems().add(scripts.get(i));	
        } 
    }


    @FXML
    void handleItemclick(ActionEvent event) throws Exception {
    	 System.out.println("clicked on  this Item" );
    }
    


}