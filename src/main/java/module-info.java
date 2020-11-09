module com.grupojam.di_ud1_grupal1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.grupojam.di_ud1_grupal1 to javafx.fxml;
    exports com.grupojam.di_ud1_grupal1;
}
