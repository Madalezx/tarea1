module com.example.ejercicio3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ejercicio3 to javafx.fxml;
    exports com.example.ejercicio3;
}