module com.example.ia_application {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.sql;
    requires MaterialFX;
    requires org.xerial.sqlitejdbc;
    requires eu.hansolo.fx.charts;
    requires org.jetbrains.annotations;

    opens com.example.ia_application to javafx.fxml;
    exports com.example.ia_application.controllers;
    opens com.example.ia_application.controllers to javafx.fxml;
    exports com.example.ia_application;
    exports com.example.ia_application.app;
}