package com.example.keyevent;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class KeyEvent extends Application {
    @Override
    public void start(Stage stage)  {
        stage.setTitle("Key event!"); // Le damos titulo al stage
        Pane pane = new Pane(); // creamos un contenedor
        Text texto = new Text(20,20,"A"); // creamon un Text y lo colocamos en la posicion 20,20 y lo inicializamos con una 'A'
        pane.getChildren().add(texto); // agregamos el text al contenedor

        texto.setOnKeyPressed(event -> { // creamos un evento si presionamos alguna flecha del teclado
            switch (event.getCode()) {
                case UP:
                    texto.setY(texto.getY() - 10); // lo sube
                    break;
                case DOWN:
                    texto.setY(texto.getY() + 10); // lo baja
                    break;
                case RIGHT:
                    texto.setX(texto.getX() + 10); // lo desplaza a la derecha
                    break;
                case LEFT:
                    texto.setX(texto.getX() - 10); // lo desplaza a la izquierda
                    break;
                default:
                    texto.setText(event.getText()); // lo deja tal y como esta
                    break;
            }
        });
        Scene scene = new Scene(pane,400,500); // le damos tamanio a la ventana
        stage.setScene(scene);
        stage.show();
        texto.requestFocus(); //colocamos el foco sobre el texto(obligatorio)
    }

    public static void main(String[] args) {
        launch();
    }
}
