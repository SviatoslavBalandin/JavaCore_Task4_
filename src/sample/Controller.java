package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextArea idMainTextArea;

    @FXML
    public TextField idTextField;

    public void btnSend() {
        pushTextToMainArea();
    }

    @FXML
    public void onEnter(ActionEvent event) {
        pushTextToMainArea();
    }

    private void pushTextToMainArea () {
        idMainTextArea.appendText(idTextField.getText() + "\n");
        idTextField.clear();
    }
}
