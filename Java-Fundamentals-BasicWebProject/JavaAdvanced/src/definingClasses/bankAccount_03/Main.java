package definingClasses.bankAccount_03;

import javax.xml.stream.util.StreamReaderDelegate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final String END_COMMAND = "End";
    private static final String CREATE = "Create";

    private static final String DEPOSIT = "Deposit";

    private static final String SET_INTERESTS = "SetInterest";

    private static final String GET_INTEREST = "GetInterest";

    private static Map<Integer, BankAccount> accounts;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        accounts = new HashMap<>();

        while (!END_COMMAND.equals(input)) {
            String[] inputParts = input.split("\\s+");
            String command = inputParts[0];

            String result = "";
            switch (command) {
                case CREATE:
                    result = createBankAccount();
                break;
                case DEPOSIT:
                    result = depositInAccount(inputParts);
                    break;
                case SET_INTERESTS:
                    result = setInterest(inputParts);
                    break;
                case GET_INTEREST:
                    result = getInterest(inputParts);
                    break;
            }

            if (!result.isEmpty()) {
                System.out.println(result);
            }

            input = scanner.nextLine();
        }
    }

    private static String getInterest(String[] inputParts) {
        int id = Integer.parseInt(inputParts[1]);
        int years = Integer.parseInt(inputParts[2]);

        BankAccount bankAccount = accounts.get(id);

        if (bankAccount == null) {
            return "Account does not exist";
        }
        double interest = bankAccount.getInterest(years);

        return String.format("%.2f", interest);
    }

    private static String setInterest(String[] inputParts) {
        double interest = Double.parseDouble(inputParts[1]);

        BankAccount.setInterestRate(interest);

        return "";
    }

    private static String depositInAccount(String[] inputParts) {
        int accountId = Integer.parseInt(inputParts[1]);
        double amount = Double.parseDouble(inputParts[2]);

        BankAccount bankAccount = accounts.get(accountId);

        if (bankAccount == null) {
            return "Account does not exist";
        }
        bankAccount.deposit(amount);
        return String.format("Deposited %d to ID%d", (int) amount, accountId);
    }

    private static String createBankAccount() {
        BankAccount bankAccount = new BankAccount();
        int id = bankAccount.getId();

        accounts.put(id, bankAccount);
        return String.format("Account ID%d created", id);
    }
}
