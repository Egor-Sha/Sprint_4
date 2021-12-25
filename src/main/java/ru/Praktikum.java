package ru;

import com.github.javafaker.Faker;
import java.util.Locale;

public class Praktikum {

    public static void main(String[] args) {

        Faker faker = new Faker(Locale.forLanguageTag("ru"));
        String fullName = faker.name().firstName()+" "+faker.name().lastName();

        Account account = new Account(fullName);
        boolean result = account.checkNameToEmboss(fullName);
        System.out.println(fullName + " напечатать " + (result ? "можно" : "нельзя"));
    }
}