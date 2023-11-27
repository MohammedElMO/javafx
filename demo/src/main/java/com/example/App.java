package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    // @Override
    // public void start(Stage stage) throws IOException {
    // scene = new Scene(Login, 640, 480);

    // }

    GridPane gridpane;
    BorderPane borderPane;
    HBox hBox;
    VBox vBox;
    TextField text;

    @Override
    public void start(Stage stage) throws Exception {
        // gridpane.add(new TextField(), 0, 0);
        
        vBox.add
        gridpane.addRow(1, new Button("7"), new Button("8"), new Button("9"), new Button("+"));
        gridpane.addRow(2, new Button("4"), new Button("5"), new Button("6"), new Button("-"));
        gridpane.addRow(3, new Button("1"), new Button("2"), new Button("3"), new Button("x"));
        gridpane.addRow(4, new Button("C"), new Button("0"), new Button("="), new Button("/"));
        scene = new Scene(gridpane, 640, 480);

        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void init() throws Exception {
        gridpane = new GridPane();
        borderPane = new BorderPane();
        text = new TextField();
        hBox = new HBox();
        vBox = new VBox();

    }

    public static void main(String[] args) {
        launch(args);
    }

}