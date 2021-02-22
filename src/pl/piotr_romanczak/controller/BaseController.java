package pl.piotr_romanczak.controller;

import pl.piotr_romanczak.EmailManager;
import pl.piotr_romanczak.view.ViewFactory;

public abstract class BaseController {
    public BaseController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        this.emailManager = emailManager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }

    private EmailManager emailManager;
    private ViewFactory viewFactory;
    private String fxmlName;
}
