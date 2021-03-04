package pl.piotr_romanczak.controller;

import pl.piotr_romanczak.EmailManager;
import pl.piotr_romanczak.view.ViewFactory;

public abstract class BaseController {
    public EmailManager emailManager;
    protected ViewFactory viewFactory;
    private String fxmlName;

    public BaseController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        this.emailManager = emailManager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }

    public String getFxmlName() {
        return fxmlName;
    }
}
