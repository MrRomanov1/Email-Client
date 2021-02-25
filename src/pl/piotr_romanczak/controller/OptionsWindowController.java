package pl.piotr_romanczak.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import pl.piotr_romanczak.EmailManager;
import pl.piotr_romanczak.view.ViewFactory;

public class OptionsWindowController extends BaseController {

    public OptionsWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    private Slider fontSizePicker;

    @FXML
    private ChoiceBox<?> themePicker;


    @FXML
    void ApplyButtonAction() {

    }

    @FXML
    void CancelButtonAction() {

    }

}
