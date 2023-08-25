module com.example.ejercicio2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ejercicio2 to javafx.fxml;
    exports com.example.ejercicio2;
}