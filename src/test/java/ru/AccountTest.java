package ru;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expectedResponse;

    public AccountTest(String name, boolean expectedResponse) {
        this.name = name;
        this.expectedResponse = expectedResponse;
    }

    @Parameterized.Parameters
    public static Object[][] giveNameGetDecisionTest() {
        return new Object[][] {
                { "Мы", false},
                { "М Ы", true},
                { "Хорошее Имя", true},
                { "девятнадцаТ буКовоК", true},
                { "СлишкомМного Буковок", false},
                { "БезПробелов", false},
                { "Здесь Два Пробела", false},
                { " ПробелВначале", false},
                { "ПробелВконце ", false},
                { " Пробелы НачСеред", false},
                { "Пробелы СерКонец ", false},
                { "", false},
                { null, false}
        };
    }

    @Test
    public void checkNameToEmbossTest() {

        Account account = new Account(name);
        boolean actualResponse = account.checkNameToEmboss(name);

        assertEquals("Обработка имени работает некорректно", expectedResponse, actualResponse);
    }
}
