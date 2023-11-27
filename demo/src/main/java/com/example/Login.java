package com.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

    private VBox header;
    private HBox footer;
    private GridPane table;
    private HBox page;
    private TextField input;
    private PasswordField password;
    private TextField username;
    private Button loginBtn;
    private Button cancel;
    private Text title;

    @Override
    public void init() throws Exception {
        header = new VBox();
        footer = new HBox();
        page = new HBox();
        input = new TextField();
        password = new PasswordField();
        username = new TextField("utilisateur");
        cancel = new Button("vider");
        loginBtn = new Button("valider");
        title = new Text("Autentification");
        table = new GridPane();
    }

    @Override
    public void start(Stage arg) throws Exception {
        arg.setTitle("authentifier votre user!");
        title.setFont(new Font("Arial", 20));
        header.getChildren().add(title);
        footer.setAlignment(Pos.BASELINE_RIGHT);

        // table.
        // footer.getChildren().add();
        
        page.getChildren().addAll(footer);
        page.getChildren().addAll(header);
    }

}
