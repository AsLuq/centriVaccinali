module com.studenti.uninsubria.centrivaccinali {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires postgresql;

    opens com.studenti.uninsubria.clientCV to javafx.fxml;
    exports com.studenti.uninsubria.clientCV;
    exports com.studenti.uninsubria.clientCV.controller;
    opens com.studenti.uninsubria.clientCV.controller to javafx.fxml;
}