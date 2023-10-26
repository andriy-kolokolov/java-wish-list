package bonus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Scanner(System.in)
                .nextLine()
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .forEach(System.out::println);
    }
}
