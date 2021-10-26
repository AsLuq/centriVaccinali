module com.studenti.uninsubria.centrivaccinali {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.studenti.uninsubria.centrivaccinali to javafx.fxml;
    exports com.studenti.uninsubria.centrivaccinali;
}