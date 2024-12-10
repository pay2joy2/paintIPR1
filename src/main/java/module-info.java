module com.paintipr1.paintipr1 {
    requires javafx.controls;
    requires javafx.fxml;
  requires java.desktop;

  opens com.paintipr1.paintipr1 to javafx.fxml;
    exports com.paintipr1.paintipr1;
}