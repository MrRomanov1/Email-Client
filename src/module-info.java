module EmailClient {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;

    opens pl.piotr_romanczak;
    opens pl.piotr_romanczak.view;
    opens pl.piotr_romanczak.controller;
    opens pl.piotr_romanczak.model;

}