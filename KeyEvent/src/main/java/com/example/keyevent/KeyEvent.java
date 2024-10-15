package com.example.keyevent;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class KeyEvent extends Application {
    @Override
    public void start(Stage stage)  {
        stage.setTitle("Key event!");
        Pane pane = new Pane();
        Text texto = new Text(20,20,"A");
        pane.getChildren().add(texto);

        texto.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case UP:
                    texto.setY(texto.getY() - 10);
                    break;
                case DOWN:
                    texto.setY(texto.getY() + 10);
                    break;
                case RIGHT:
                    texto.setX(texto.getX() + 10);
                    break;
                case LEFT:
                    texto.setX(texto.getX() - 10);
                    break;
                default:
                    texto.setText(event.getText());
                    break;
            }
        });
        Scene scene = new Scene(pane,400,500);
        stage.setScene(scene);
        stage.show();
        texto.requestFocus();
    }

    public static void main(String[] args) {
        launch();
    }
}