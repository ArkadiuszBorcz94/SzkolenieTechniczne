module pl.edu.wsiz.lab2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens pl.edu.wsiz.lab2 to javafx.fxml;
    exports pl.edu.wsiz.lab2;
}
