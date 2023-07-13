package com.example.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Stage Title");
        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane, 500, 500);
        stage.setScene(scene);

        // Add button to stack pane
        Button button = new Button();
        stackPane.getChildren().add(button);

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