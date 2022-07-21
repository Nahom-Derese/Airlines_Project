package Airlines_Project;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class UserPage_Controller {

    private Scene scene;
    private Stage stage;
    
    @FXML
    private Button Logout;

    @FXML
    Label user_Name;

    @FXML
    void Logout(ActionEvent event) {
        try {
            switchToLogin(event);
        } catch (Exception e) {
            e.printStackTrace();}

        user_Name.setText("Nahom");
        System.out.println(user_Name.getText());
    }

    public void switchToLogin(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void changeName(String u) {
        System.out.println("triggerd");
        // user_Name.setText(u);
    }

}
