package stackQueueExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P02basicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  //бр. на елементите,ментите, които да добавя
        int s = scanner.nextInt();  //бр. на елементите, които да премахна
        int x = scanner.nextInt();  //число, което проверявам дали го има

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int count = 1; count <= n; count++) {
            stack.push(scanner.nextInt());  //добавяме към стека следващото цяло число от конзолата
        }
        for (int count = 1; count <= s ; count++) {
            stack.pop();   // премахваме от стека бр. елементи
        }
        if (stack.contains(x)) {
            System.out.println("true");
        } else {
            if (stack.isEmpty()) {
                System.out.println(0);   // ако стека е празен
            } else {
                System.out.println(Collections.min(stack));   //принтираме най-малкия елемент от стека
            }
        }
    }
}
