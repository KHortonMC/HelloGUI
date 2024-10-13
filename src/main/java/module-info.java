module com.gametemplate.hellogui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gametemplate.hellogui to javafx.fxml;
    exports com.gametemplate.hellogui;
}