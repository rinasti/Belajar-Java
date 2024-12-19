package com.example.controller;

import com.example.dao.StudentDAO;
import com.example.model.Student;
import javafx.collections.FXCollections;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.time.LocalDate;
import javafx.geometry.Insets;

public class StudentController {

    private StudentDAO studentDAO = new StudentDAO();

    private TextField idField = new TextField();
    private TextField firstNameField = new TextField();
    private TextField lastNameField = new TextField();
    private TextField emailField = new TextField();
    private TextField phoneField = new TextField();
    private TextField classNameField = new TextField();
    private DatePicker dobPicker = new DatePicker();
    private ComboBox<String> genderComboBox = new ComboBox<>();
    private TextArea addressArea = new TextArea();

    private TableView<Student> studentTable = new TableView<>();

    public VBox getStudentManagementView() {

        VBox mainLayout = new VBox(10);

        GridPane formLayout = createFormLayout();

        HBox buttonLayout = createButtonLayout();

        setupStudentTable();

        mainLayout.getChildren().addAll(formLayout, buttonLayout, studentTable);

        refreshStudentTable();

        return mainLayout;
    }

    private GridPane createFormLayout() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        genderComboBox.getItems().addAll("Male", "Female", "Other");

        Label idLabel = new Label("ID:");
        Label firstNameLabel = new Label("First Name:");
        Label lastNameLabel = new Label("Last Name:");
        Label emailLabel = new Label("Email:");
        Label phoneLabel = new Label("Phone:");
        Label classNameLabel = new Label("Class:");
        Label dobLabel = new Label("Date of Birth:");
        Label genderLabel = new Label("Gender:");
        Label addressLabel = new Label("Address:");

        idField.setDisable(true);

        grid.add(idLabel, 0, 0);
        grid.add(idField, 1, 0);
        grid.add(firstNameLabel, 0, 1);
        grid.add(firstNameField, 1, 1);
        grid.add(lastNameLabel, 0, 2);
        grid.add(lastNameField, 1, 2);
        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);
        grid.add(phoneLabel, 0, 4);
        grid.add(phoneField, 1, 4);
        grid.add(classNameLabel, 0, 5);
        grid.add(classNameField, 1, 5);
        grid.add(dobLabel, 0, 6);
        grid.add(dobPicker, 1, 6);
        grid.add(genderLabel, 0, 7);
        grid.add(genderComboBox, 1, 7);
        grid.add(addressLabel, 0, 8);
        grid.add(addressArea, 1, 8);

        return grid;
    }

    private HBox createButtonLayout() {
        HBox buttonBox = new HBox(10);

        Button addButton = new Button("Add");
        Button updateButton = new Button("Update");
        Button deleteButton = new Button("Delete");
        Button clearButton = new Button("Clear");

        addButton.setOnAction(e -> addStudent());
        updateButton.setOnAction(e -> updateStudent());
        deleteButton.setOnAction(e -> deleteStudent());
        clearButton.setOnAction(e -> clearFields());

        buttonBox.getChildren().addAll(addButton, updateButton, deleteButton, clearButton);
        return buttonBox;
    }

    private void setupStudentTable() {

        TableColumn<Student, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Student, String> firstNameColumn = new TableColumn<>("First Name");
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn<Student, String> lastNameColumn = new TableColumn<>("Last Name");
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn<Student, String> emailColumn = new TableColumn<>("Email");
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        TableColumn<Student, String> phoneColumn = new TableColumn<>("Phone");
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));

        TableColumn<Student, String> classColumn = new TableColumn<>("Class");
        classColumn.setCellValueFactory(new PropertyValueFactory<>("className"));

        TableColumn<Student, LocalDate> dobColumn = new TableColumn<>("Date of Birth");
        dobColumn.setCellValueFactory(new PropertyValueFactory<>("dateOfBirth"));
        dobColumn.setPrefWidth(100);

        TableColumn<Student, String> genderColumn = new TableColumn<>("Gender");
        genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
        genderColumn.setPrefWidth(70);

        TableColumn<Student, String> addressColumn = new TableColumn<>("Address");
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        addressColumn.setPrefWidth(150);

        studentTable.getColumns().addAll(
                idColumn, firstNameColumn, lastNameColumn,
                emailColumn, phoneColumn, classColumn, dobColumn, genderColumn, addressColumn);

        studentTable.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, newSelection) -> {
                    if (newSelection != null) {
                        populateFields(newSelection);
                    }
                });
    }

    private void addStudent() {
        try {

            Student newStudent = new Student(
                    firstNameField.getText(),
                    lastNameField.getText(),
                    emailField.getText(),
                    phoneField.getText(),
                    classNameField.getText(),
                    dobPicker.getValue(),
                    genderComboBox.getValue(),
                    addressArea.getText());

            if (studentDAO.addStudent(newStudent)) {
                showAlert("Success", "Student added successfully!");
                refreshStudentTable();
                clearFields();
            } else {
                showAlert("Error", "Failed to add student.");
            }
        } catch (Exception e) {
            showAlert("Error", "Invalid input: " + e.getMessage());
        }
    }

    private void updateStudent() {
        try {

            if (idField.getText().isEmpty()) {
                showAlert("Error", "Please select a student to update.");
                return;
            }

            Student updatedStudent = new Student(
                    Integer.parseInt(idField.getText()),
                    firstNameField.getText(),
                    lastNameField.getText(),
                    emailField.getText(),
                    phoneField.getText(),
                    classNameField.getText(),
                    dobPicker.getValue(),
                    genderComboBox.getValue(),
                    addressArea.getText());

            if (studentDAO.updateStudent(updatedStudent)) {
                showAlert("Success", "Student updated successfully!");
                refreshStudentTable();
            } else {
                showAlert("Error", "Failed to update student.");
            }
        } catch (Exception e) {
            showAlert("Error", "Invalid input: " + e.getMessage());
        }
    }

    private void deleteStudent() {
        try {

            if (idField.getText().isEmpty()) {
                showAlert("Error", "Please select a student to delete.");
                return;
            }

            int studentId = Integer.parseInt(idField.getText());
            if (studentDAO.deleteStudent(studentId)) {
                showAlert("Success", "Student deleted successfully!");
                refreshStudentTable();
                clearFields();
            } else {
                showAlert("Error", "Failed to delete student.");
            }
        } catch (Exception e) {
            showAlert("Error", "Error deleting student: " + e.getMessage());
        }
    }

    private void clearFields() {
        idField.clear();
        firstNameField.clear();
        lastNameField.clear();
        emailField.clear();
        phoneField.clear();
        classNameField.clear();
        dobPicker.setValue(null);
        genderComboBox.setValue(null);
        addressArea.clear();
    }

    private void populateFields(Student student) {
        idField.setText(String.valueOf(student.getId()));
        firstNameField.setText(student.getFirstName());
        lastNameField.setText(student.getLastName());
        emailField.setText(student.getEmail());
        phoneField.setText(student.getPhoneNumber());
        classNameField.setText(student.getClassName());
        dobPicker.setValue(student.getDateOfBirth());
        genderComboBox.setValue(student.getGender());
        addressArea.setText(student.getAddress());
    }

    private void refreshStudentTable() {

        studentTable.setItems(FXCollections.observableArrayList(
                studentDAO.getAllStudents()));
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}