package lk.ijse.supermarket.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    @FXML
    private AnchorPane root;
    @FXML
    private AnchorPane centerNode;

    public void initialize() throws IOException {
        System.out.println("Main Window just loaded!");
        loadDashboardForm();
    }

    private void loadDashboardForm() throws IOException {
        AnchorPane dashboardPane = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

        this.centerNode.getChildren().clear();
        this.centerNode.getChildren().add(dashboardPane);
    }

    @FXML
    void btnCustomerOnAction(ActionEvent event) throws IOException {
        AnchorPane customerPane = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        this.centerNode.getChildren().clear();
        this.centerNode.getChildren().add(customerPane);
    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) throws IOException {
        loadDashboardForm();
    }

    @FXML
    void btnItemOnAction(ActionEvent event) throws IOException {
        AnchorPane itemPane = FXMLLoader.load(this.getClass().getResource("/view/item_form.fxml"));

        Scene scene = new Scene(itemPane);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Item Form");

        stage.show();
    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) this.root.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login Form");
        stage.centerOnScreen();
    }
}
