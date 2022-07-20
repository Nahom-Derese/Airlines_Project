package Airlines_Project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Login_Controller {

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
    void Login(ActionEvent event) {
        System.out.println("check");
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
