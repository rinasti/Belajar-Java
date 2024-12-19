package com.example.controller;

import com.example.App;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class LoginController {

    private App app;

    public LoginController(App app) {
        this.app = app;
    }

    public Scene getLoginScene() {

        VBox mainLayout = new VBox(15);
        mainLayout.setPadding(new Insets(20));
        mainLayout.setAlignment(Pos.CENTER);

        Text title = new Text("BEN");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        title.setStyle("-fx-fill: green;");

        Text subtitle = new Text("Sign in to access your account");
        subtitle.setFont(Font.font("Arial", 16));
        subtitle.setStyle("-fx-fill: #666;");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        ColumnConstraints column1 = new ColumnConstraints();
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setHgrow(Priority.ALWAYS);
        grid.getColumnConstraints().addAll(column1, column2);

        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
        usernameField.setMaxWidth(Double.MAX_VALUE);
        grid.add(usernameLabel, 0, 0);
        grid.add(usernameField, 1, 0);

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        passwordField.setMaxWidth(Double.MAX_VALUE);
        grid.add(passwordLabel, 0, 1);
        grid.add(passwordField, 1, 1);

        Button submitButton = new Button("Submit");
        submitButton.setMaxWidth(Double.MAX_VALUE);
        submitButton.setStyle("-fx-background-color: green; -fx-text-fill: white; -fx-font-size: 14px;");
        GridPane.setMargin(submitButton, new Insets(10, 0, 0, 0));
        grid.add(submitButton, 0, 2, 2, 1);
        submitButton.setOnAction(e -> app.showStudentManagementPage());

        mainLayout.getChildren().addAll(title, subtitle, grid);

        return new Scene(mainLayout, 400, 350);
    }
}
