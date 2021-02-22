package pl.piotr_romanczak.view;

import pl.piotr_romanczak.EmailManager;

public class ViewFactory {
    private EmailManager emailManager;

    public ViewFactory(EmailManager emailManager) {
        this.emailManager = emailManager;
    }

    public void showLoginWindow () {
        System.out.println("show login window");
    }
}
