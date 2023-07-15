package com.example.javafx.viewflows;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class FlowPaneDemo extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Stage Title");
        FlowPane flowPane = new FlowPane(10, 10);  // Everything will be one after another
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 300, 200);
        stage.setScene(scene);

        // Add label to stack pane
        Label label = new Label();
        label.setText("Enter any text in below text field:");
        flowPane.getChildren().add(label);

        // Add text field where user can type
        TextField textField = new TextField();
        textField.setPromptText("Enter any text...");
        flowPane.getChildren().add(textField);

        // Add button to stack pane
        Button button = new Button();
        flowPane.getChildren().add(button);

        // Add functionality to button
        button.setText("Submit");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Submit clicked: " + textField.getText());
                label.setText("Submitted: " + textField.getText());
            }
        });

        // Start application
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}