package src.Section10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesteS10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alice");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco");

        System.out.println(list.size());

        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("-----------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        System.out.println("-----------------------");
        List<String> result = list.stream().filter(str -> str.charAt(0) == 'A').toList();
        for (String str : result) {
            System.out.println(str);
        }

        System.out.println("-----------------------");
        String name = list.stream().filter(str -> str.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

        System.out.println("-----------------------");
        list.remove(1);
        list.remove("Ana");
        list.removeIf(str -> str.charAt(0) == 'M');
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        for (String str : list) {
            System.out.println(str);
        }
    }
}
