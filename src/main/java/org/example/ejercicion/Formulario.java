package org.example.ejercicion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/**
 * La clase principal de la aplicación JavaFX que carga e inicia la interfaz de usuario.
 * <p>
 * La clase `Formulario` extiende `Application` e inicia el archivo FXML para construir
 * la interfaz gráfica de usuario. Configura la ventana principal con un título y la
 * deshabilita para evitar su redimensionamiento.
 * </p>
 */
public class Formulario extends Application {
    /**
     * Método de entrada principal que inicia la aplicación JavaFX.
     *
     * @param stage la ventana principal de la aplicación JavaFX.
     * @throws IOException si no se puede cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Formulario.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setResizable(false);
        stage.setTitle("FORMULARIO");
        stage.setScene(scene);
        stage.show();
    }
    /**
     * Método principal de ejecución de la aplicación.
     * <p>
     * Llama al método {@code launch()} que inicia la aplicación JavaFX.
     * </p>
     *
     * @param args argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        launch();
    }
}