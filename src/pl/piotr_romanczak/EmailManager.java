package pl.piotr_romanczak;

import javafx.scene.control.TreeItem;
import pl.piotr_romanczak.controller.services.FetchFoldersService;
import pl.piotr_romanczak.model.EmailAccount;
import pl.piotr_romanczak.model.EmailTreeItem;

public class EmailManager {
    //Folder handling
    private EmailTreeItem<String> foldersRoot = new EmailTreeItem<String>("");

    public TreeItem<String> getFoldersRoot() {
        return foldersRoot;
    }

    public void addEmailAccount(EmailAccount emailAccount) {
        EmailTreeItem<String> treeItem = new EmailTreeItem<>(emailAccount.getAddress());
        FetchFoldersService fetchFoldersService = new FetchFoldersService(emailAccount.getStore(), treeItem);
        fetchFoldersService.start();
        foldersRoot.getChildren().add(treeItem);
    }
}
