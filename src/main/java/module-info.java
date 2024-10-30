module org.example.ejercicion {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ejercicion to javafx.fxml;
    exports org.example.ejercicion;
}