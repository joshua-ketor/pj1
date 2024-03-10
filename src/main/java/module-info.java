module com.rotek.p1j {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rotek.p1j to javafx.fxml;
    exports com.rotek.p1j;
}