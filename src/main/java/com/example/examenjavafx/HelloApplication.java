package com.example.examenjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        VBox raiz = new VBox();
        Label etqTexto1= new Label("To change a property for multiple objects, first select the checkbox to enable the change, and then type the change.");
        etqTexto1.wrapTextProperty();

        Label etqTexto2= new Label("User profile");

            HBox hbox1 = new HBox();
            CheckBox checkBox1 = new CheckBox("Profile path: ");
            TextField tf1 = new TextField("");
            hbox1.getChildren().addAll(checkBox1, tf1);
            hbox1.setSpacing(10);

            HBox hbox2 = new HBox();
            CheckBox checkBox2 = new CheckBox("Logon script:");
            TextField tf2 = new TextField("");
            hbox2.getChildren().addAll(checkBox2, tf2);
            hbox2.setSpacing(10);

        Label etqTexto3= new Label("Holder folder:  ");


            HBox hbox3 = new HBox();
                ToggleGroup grupo = new ToggleGroup();
                RadioButton rbutton1 = new RadioButton("Local path: ");
                rbutton1.setToggleGroup(grupo);
                rbutton1.setSelected(false);
            TextField tf3 = new TextField("");
            hbox3.getChildren().addAll(rbutton1, tf3);
            hbox3.setSpacing(10);

            HBox hbox4 = new HBox();
                RadioButton rbutton2 = new RadioButton("Local path: ");
                rbutton2.setToggleGroup(grupo);
            TextField tf4 = new TextField("");
                ComboBox<String> comboBox = new ComboBox<String> ();
                comboBox.getItems().add("C:");
                comboBox.getItems().add("D:");
                comboBox.getItems().add("E:");


            Label etqTexto4 = new Label("To: ");
            hbox4.getChildren().addAll(rbutton2, comboBox, etqTexto4, tf4);

        raiz.getChildren().addAll(etqTexto1, etqTexto2, hbox1, hbox2, etqTexto3, hbox3, hbox4);
        raiz.setPadding(new Insets(15, 45 ,45, 45));
        raiz.setSpacing(20);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(raiz, 550, 420);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}