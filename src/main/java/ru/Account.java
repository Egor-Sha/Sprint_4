package ru;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public static boolean checkNameToEmboss(String name){

        if (name!=null && name.length()>=3 && name.length()<=19 &&
                name.contains(" ") && !name.replaceFirst(" ", "").contains(" ") ) {

            if (name.codePointAt(0) == 32 || name.codePointAt(name.length()-1) == 32) {
                System.out.println("Пробел должен быть между именем и фамилией");
                return false;
            }
            return true;

        } else {
            System.out.println("Неверный формат");
            return false;
        }

    }



}
