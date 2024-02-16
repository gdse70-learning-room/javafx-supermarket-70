package lk.ijse.supermarket.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.supermarket.db.CredentialDb;

import java.io.IOException;

public class LoginFormController {
    public TextField txtUserName;
    public TextField txtPassword;
    public AnchorPane rootNode;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        String userName = txtUserName.getText();
        String pw = txtPassword.getText();

        if (CredentialDb.USER_NAME.equals(userName) && CredentialDb.PW.equals(pw)) {
            AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/main_form.fxml"));

            Scene scene = new Scene(rootNode);

            Stage stage = (Stage) this.rootNode.getScene().getWindow();

            stage.setScene(scene);

            stage.setTitle("Main Form");
            stage.show();


        } else {
            new Alert(Alert.AlertType.ERROR, "Ooops! credentials aren't matched!").show();
        }
    }
}
