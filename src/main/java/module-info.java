module com.example.examenjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examenjavafx to javafx.fxml;
    exports com.example.examenjavafx;
}