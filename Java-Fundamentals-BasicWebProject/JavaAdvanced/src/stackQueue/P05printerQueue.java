package stackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05printerQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String currentInput = scanner.nextLine();

        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        while (!currentInput.equals("print")) {

            if (currentInput.equals("cancel")) {
                if (printerQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printerQueue.poll());
                }
            } else {
                printerQueue.offer(currentInput);
            }
            currentInput = scanner.nextLine();
        }

        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
