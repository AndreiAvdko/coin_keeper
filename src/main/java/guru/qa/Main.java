package guru.qa;

import guru.qa.db.AccountRepository;
import guru.qa.db.implementation.PostgresAccountRepository;
import guru.qa.entity.AccountEntity;
import guru.qa.service.Application;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        new Application().run();
    }
}