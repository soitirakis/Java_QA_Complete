package utils;

import java.util.Random;

public class RandomGenerator {

    public static String generateRandomName() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder name = new StringBuilder();
        Random rnd = new Random();
        while (name.length() < 10) {
            int index = (int) (rnd.nextFloat() * characters.length());
            name.append(characters.charAt(index));
        }
        return name.toString();
    }

    public static String generateRandomEmail() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder email = new StringBuilder();
        Random rnd = new Random();
        while (email.length() < 5) { // length of the random string
            int index = (int) (rnd.nextFloat() * characters.length());
            email.append(characters.charAt(index));
        }
        return email.toString().toLowerCase() + "@example.com";
    }
}
