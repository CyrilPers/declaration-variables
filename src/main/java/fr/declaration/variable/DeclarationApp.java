package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        byte myBite = 11;
        short myShort = 1111;
        int myInt = 1111111;
        long myLong = 11111L;
        float myFloat = 1.11F;
        double myDouble = 1.22D;
        char myChar = 'A';
        boolean myBoolean = true;
        String myString = "Abc";
        String randomString = "Voici le résultat d’un calcul : 1+5=6";

        System.out.println(myBite);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myString);
        System.out.println(randomString);
        String[] parts = randomString.split(":");
        System.out.println(parts[0] + ':');
        System.out.println(parts[1]);

    }
}
