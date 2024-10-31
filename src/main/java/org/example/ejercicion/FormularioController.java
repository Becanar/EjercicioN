package org.example.ejercicion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Controlador para el formulario que permite agregar personas.
 * Maneja las acciones de los botones y los campos de entrada de texto.
 */
public class FormularioController {

    @FXML
    private Button btCancelar;

    @FXML
    private Button btGuardar;

    @FXML
    private Label lblAparte;

    @FXML
    private Label lblAparte1;

    @FXML
    private Label lblAparte2;

    @FXML
    private Label lblAparte3;

    @FXML
    private Label lblTitulo;

    @FXML
    private HBox panelAparte;

    @FXML
    private HBox panelAparte1;

    @FXML
    private HBox panelAparte2;

    @FXML
    private HBox panelAparte3;

    @FXML
    private HBox panelBotones;

    @FXML
    private VBox rootPane;

    @FXML
    private TextField txtAparte;

    @FXML
    private TextField txtAparte1;

    @FXML
    private TextField txtAparte2;

    @FXML
    private TextField txtAparte3;

    /**
     * Acción ejecutada al hacer clic en el botón de cancelar.
     * Cierra la ventana del formulario actual.
     *
     * @param event el evento de acción disparado al presionar el botón cancelar
     */
    @FXML
    void cancelar(ActionEvent event) {
        // Cierra la ventana
        Stage stage = (Stage) btCancelar.getScene().getWindow();
        stage.close();
    }

    /**
     * Acción ejecutada al hacer clic en el botón de guardar.
     * Muestra una notificación indicando que la persona fue guardada correctamente y limpia todos los campos de texto.
     *
     * @param event el evento de acción disparado al presionar el botón guardar
     */
    @FXML
    void guardar(ActionEvent event) {
        // Muestra el mensaje de confirmación
        mostrarVentanaOK();

        // Limpia todos los campos de texto
        txtAparte.clear();
        txtAparte1.clear();
        txtAparte2.clear();
        txtAparte3.clear();
    }

    /**
     * Muestra una ventana de alerta con un mensaje de confirmación de que la persona ha sido guardada correctamente.
     * Esta alerta es modal y requiere interacción del usuario antes de cerrarse.
     */
    private void mostrarVentanaOK() {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.initOwner(btGuardar.getScene().getWindow());
        alerta.setHeaderText(null);
        alerta.setTitle("Info");
        alerta.setContentText("Persona guardada correctamente.");
        alerta.showAndWait();
    }
}
