package com.example.javafx.viewflows;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class StackPaneDemo extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Stage Title");
        StackPane stackPane = new StackPane();  // Everything will be stacked on top of each other
        Scene scene = new Scene(stackPane, 500, 500);
        stage.setScene(scene);

        // Add button to stack pane
        Button button = new Button();
        stackPane.getChildren().add(button);

        // Add label to stack pane
        Label label = new Label();
        label.setText("This is label text!");
        stackPane.getChildren().add(label);

        // Add functionality to button
        button.setText("Click Me");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Button clicked!");
            }
        });

        // Start application
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}