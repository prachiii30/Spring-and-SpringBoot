module com.example.manevdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.manevdemo to javafx.fxml;
    exports com.example.manevdemo;
}