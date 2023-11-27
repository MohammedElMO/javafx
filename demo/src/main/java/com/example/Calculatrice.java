package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Calculatrice extends Application {
    GridPane gridpane;
    BorderPane borderPane;
    HBox hBox;
    TextField text;

    @Override
    public void start(Stage arg0) throws Exception {
        gridpane.add(new TextField(), 0, 2);

        gridpane.addRow(1, new Button("7"), new Button("8"), new Button("9"), new Button("+"));
        gridpane.addRow(2, new Button("4"), new Button("5"), new Button("6"), new Button("-"));
        gridpane.addRow(3, new Button("1"), new Button("2"), new Button("3"), new Button("x"));
        gridpane.addRow(4, new Button("C"), new Button("0"), new Button("="), new Button("/"));

        
    }

    @Override
    public void init() throws Exception {
        gridpane = new GridPane();
        borderPane = new BorderPane();
        text = new TextField();
        hBox = new HBox();

    }

}
