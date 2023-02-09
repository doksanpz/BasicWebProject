package functionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07findTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

//        1. начин
//        Consumer<List<Integer>> printLastIndex = list -> {
//            int minElement = Collections.min(list);
//            System.out.println(list.lastIndexOf(minElement));
//        };
//
//        printLastIndex.accept(numbers);

//        2. начин
        Function<List<Integer>, Integer> getLastIndex = list -> list.lastIndexOf(Collections.min(list));

        System.out.println(getLastIndex.apply(numbers));
    }
}
