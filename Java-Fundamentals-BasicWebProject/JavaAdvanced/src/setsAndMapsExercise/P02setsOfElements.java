package setsAndMapsExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02setsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sizeOfFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int sizeOfSecondSet = Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int number = 1; number <= sizeOfFirstSet ; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            firstSet.add(value);
        }
        for (int number = 1; number <= sizeOfSecondSet; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            secondSet.add(value);
        }

        /*Set<Integer> duplicateSet = new LinkedHashSet<>();
        for (int number : firstSet) {
            if (secondSet.contains(number)) {
                duplicateSet.add(number);
            }
        }
        duplicateSet.forEach(e -> System.out.print(e + " "));*/
        firstSet.retainAll(secondSet); //премахва бсички елементи, които ги няма в 2рия сет
        firstSet.forEach(e -> System.out.print(e + " "));
    }
}
