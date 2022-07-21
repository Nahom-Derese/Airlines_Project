package Airlines_Project;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.print.PrintQuality;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Login_Controller {

    private Scene scene;
    private Parent root;
    private Stage stage;

    public void switchToUserPage(ActionEvent event) throws IOException{
        // Parent root = FXMLLoader.load(getClass().getResource("User_Page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private ImageView Choose_Admin;

    @FXML
    private ImageView Choose_User;

    @FXML
    private Button Login;

    @FXML
    private Button Sign_Up;

    @FXML
    private Button frgt;

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField uname_field;

    @FXML
    void Admin(MouseEvent event) {
        System.out.println("check");
    }

    @FXML
    void Forogot(ActionEvent event) {
        System.out.println("check");
    }

    @FXML
    void Login(ActionEvent event) throws IOException{
        
        String u_n = uname_field.getText();

        System.out.println(u_n);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("User_Page.fxml"));
        root = loader.load();

        UserPage_Controller Page = new UserPage_Controller();
        Page.changeName(u_n);
        System.out.println(Page.user_Name);

        try {
            switchToUserPage(event);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Sign_up_Scene(ActionEvent event) {
        System.out.println("check");
    }

    @FXML
    void User(MouseEvent event) {
        System.out.println("check");
    }
    
}
