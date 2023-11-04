package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculadora extends Application {

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        VBox vb = new VBox();
        window.setTitle("Calculadora"); // Título de la ventana

        vb.getChildren().add(new Calculator()); // Agrega el contenido de la calculadora
        Scene sc = new Scene(vb, 270, 270); // Crea una escena con el VBox
        window.setScene(sc); // Establece la escena en la ventana
        window.show(); // Muestra la ventana
    }

}

