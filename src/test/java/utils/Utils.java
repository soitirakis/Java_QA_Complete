package utils;

import java.util.*;
import java.time.LocalDate;

public class Utils {

    public static String generateRandomEmail() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder email = new StringBuilder();
        Random rnd = new Random();
        while (email.length() < 10) { // length of the random string
            int index = (int) (rnd.nextFloat() * characters.length());
            email.append(characters.charAt(index));
        }
        return email.toString() + "@example.com";
    }

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

    public static String generateRandomBirthDate() {
        Random rnd = new Random();
        int minDay = (int) LocalDate.of(1935, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2025, 1, 1).toEpochDay();
        long randomDay = minDay + rnd.nextInt(maxDay - minDay);

        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
        return randomBirthDate.toString();
    }

    public static String generateRandomPhone() {
        String characters = "0123456789";
        StringBuilder phone = new StringBuilder();
        Random rnd = new Random();
        while (phone.length() < 8) {
            int index = (int) (rnd.nextFloat() * characters.length());
            phone.append(characters.charAt(index));
        }
        return "07" + phone.toString();
    }

    public static String generateRandomCity() {
        String[] cities = {"Alba-Iulia", "Alexandria", "Arad", "Bacau", "Baia Mare", "Bistrita", "Botosani", "Brasov", "Braila",
                "Bucuresti", "Buzau", "Calarasi", "CLuj-Napoca", "Constanta", "Craiova", "Deva", "Drobeta-Turnu Severin", "Focasni",
                "Galati", "Giurgiu", "Iasi", "Miercurea Ciuc", "Oradea", "Piatra Neamt", "Pitesti", "Ploiesti", "Ramnicu Valcea",
                "Resita", "Satu Mare", "Sfantu Gheorghe", "Sibiu", "Slatina", "Slobozia", "Suceava", "Targoviste", "Targu Jiu",
                "Targu Mures", "Timisoara", "Tulcea", "Vaslui", "Zalau"};
        Random rnd = new Random();
        int index = (int) (rnd.nextFloat() * cities.length);
        String city = cities[index];
        return city;
    }

    public static Map generateCounties() {

        String[] counties = {"Alba", "Teleorman", "Arad", "Bacau", "Maramures", "Bistrita-Nasaud", "Botosani", "Brasov", "Braila", "Bucuresti",
                 "Buzau", "Calarasi", "Cluj", "Constanta", "Dolj", "Hunedoara", "Mehedinti", "Vrancea",
                "Galati", "Giurgiu", "Iasi", "Harghita", "Bihor", "Neamt", "Arges", "Prahova", "Valcea",
                "Caras-Severin", "Satu Mare", "Covasna", "Sibiu", "Olt", "Ialomita", "Suceava", "Dambovita", "Gorj",
                "Mures", "Timis", "Tulcea", "Vaslui", "Salaj"};

        String[] cities = {"Alba-Iulia", "Alexandria", "Arad", "Bacau", "Baia Mare", "Bistrita", "Botosani", "Brasov", "Braila",
                "Bucuresti", "Buzau", "Calarasi", "CLuj-Napoca", "Constanta", "Craiova", "Deva", "Drobeta-Turnu Severin", "Focasni",
                "Galati", "Giurgiu", "Iasi", "Miercurea Ciuc", "Oradea", "Piatra Neamt", "Pitesti", "Ploiesti", "Ramnicu Valcea",
                "Resita", "Satu Mare", "Sfantu Gheorghe", "Sibiu", "Slatina", "Slobozia", "Suceava", "Targoviste", "Targu Jiu",
                "Targu Mures", "Timisoara", "Tulcea", "Vaslui", "Zalau"};

       Map<String, String> provences = new LinkedHashMap<>();
       for (int i = 0; i < counties.length; i++) {
           provences.put(counties[i], cities[i]);
       }

       return provences;
    }

    public static String generateProvence(String city) {
        Map<String, String> counties = new LinkedHashMap<>();
        counties = generateCounties();

        for (String county : counties.keySet()) {
            if (counties.get(county).equals(city)){
                System.out.println(county);
                return county;
            }
        }
        return null;
    }
}
