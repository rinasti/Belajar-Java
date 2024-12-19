package com.example;

import com.example.controller.LoginController;
import com.example.controller.StudentController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        showLoginPage();
        primaryStage.setTitle("Student Management System");
        primaryStage.show();
    }

    private void showLoginPage() {
        LoginController loginController = new LoginController(this);
        Scene loginScene = loginController.getLoginScene();
        primaryStage.setScene(loginScene);
    }

    public void showStudentManagementPage() {
        StudentController studentController = new StudentController();
        Scene studentScene = new Scene(studentController.getStudentManagementView(), 850, 600);
        primaryStage.setScene(studentScene);
    }
}
