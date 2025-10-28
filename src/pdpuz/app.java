package pdpuz;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> dictionary = new HashMap<>();

        dictionary.put("kitob", Arrays.asList("book", "volume"));
        dictionary.put("uy", Arrays.asList("house", "home"));
        dictionary.put("bola", Arrays.asList("child", "kid", "boy"));
        dictionary.put("dost", Arrays.asList("friend", "buddy", "mate"));
        dictionary.put("maktab", Arrays.asList("school", "academy"));

        System.out.println("=== Lug'atdagi so'zlar ===");
        for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nSo'z kiriting (uzbekcha yoki inglizcha): ");
        String word = scanner.nextLine().toLowerCase();

        findTranslation(dictionary, word);
    }

    public static void findTranslation(Map<String, List<String>> dict, String word) {
        boolean found = false;

        if (dict.containsKey(word)) {
            System.out.println("Tarjimalari: " + dict.get(word));
            found = true;
        } else {

            for (Map.Entry<String, List<String>> entry : dict.entrySet()) {
                if (entry.getValue().contains(word)) {
                    System.out.println(word + " -> " + entry.getKey());
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("So'z topilmadi 😕");
        }
    }
}
