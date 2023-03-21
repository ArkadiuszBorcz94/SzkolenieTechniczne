module pl.edu.wsiz.lab1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens pl.edu.wsiz.lab1 to javafx.fxml;
    exports pl.edu.wsiz.lab1;
}
