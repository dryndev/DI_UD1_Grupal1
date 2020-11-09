package com.grupojam.di_ud1_grupal1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class PrimaryController {

    @FXML
    private TextField txt_nombre;
    @FXML
    private Button btn_saludar;
    @FXML
    private Text saludo;

    @FXML
    private void saludar(ActionEvent event) {
        String nombre = txt_nombre.getText();
        if (nombre.isBlank()) {
            saludo.setText("¡No has escrito un nombre!");
        } else {
            saludo.setText("Bienvenido de nuevo, " + nombre + "!");
        }
    }

    @FXML
    private void onEnter(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER)) {
            btn_saludar.fire();
        }
    }
}
