package pl.piotr_romanczak;


import javafx.application.Application;
import javafx.stage.Stage;
import pl.piotr_romanczak.controller.persistence.PersistenceAccess;
import pl.piotr_romanczak.controller.persistence.ValidAccount;
import pl.piotr_romanczak.controller.services.LoginService;
import pl.piotr_romanczak.model.EmailAccount;
import pl.piotr_romanczak.view.ViewFactory;

import java.util.ArrayList;
import java.util.List;

public class Launcher extends Application {

    private PersistenceAccess persistenceAccess = new PersistenceAccess();
    private EmailManager emailManager = new EmailManager();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ViewFactory viewFactory = new ViewFactory(emailManager);
        List<ValidAccount> validAccountList = persistenceAccess.loadFromPersistence();
        if (validAccountList.size() > 0) {
            viewFactory.showMainWindow();
            for (ValidAccount validAccount : validAccountList) {
                EmailAccount emailAccount = new EmailAccount(validAccount.getAddress(), validAccount.getPassword());
                LoginService loginService = new LoginService(emailAccount, emailManager);
                loginService.start();
            }
        } else {
            viewFactory.showLoginWindow();
        }
    }

    @Override
    public void stop() throws Exception {
        List<ValidAccount> validAccountList = new ArrayList<ValidAccount>();
        for (EmailAccount emailAccount : emailManager.getEmailAccounts()) {
            validAccountList.add(new ValidAccount(emailAccount.getAddress(), emailAccount.getPassword()));
        }
        persistenceAccess.saveToPersistence(validAccountList);
    }
}
