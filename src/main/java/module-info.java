module com.example.sep1 {
  requires javafx.controls;
  requires javafx.fxml;

  opens com.example.sep1 to javafx.fxml;
  exports com.example.sep1;
  exports com.example.sep1.view;
  opens com.example.sep1.view to javafx.fxml;
}