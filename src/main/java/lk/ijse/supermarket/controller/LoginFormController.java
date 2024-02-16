package lk.ijse.supermarket.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.supermarket.db.CredentialDb;

public class LoginFormController {
    public TextField txtUserName;
    public TextField txtPassword;

    public void btnLoginOnAction(ActionEvent actionEvent) {
        String userName = txtUserName.getText();
        String pw = txtPassword.getText();

        if (CredentialDb.USER_NAME.equals(userName) && CredentialDb.PW.equals(pw)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Huree! credentials are matched!").show();

            txtUserName.setText("");
            txtPassword.setText("");
        } else {
            new Alert(Alert.AlertType.ERROR, "Ooops! credentials aren't matched!").show();
        }
    }
}
