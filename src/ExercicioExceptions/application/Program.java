package ExercicioExceptions.application;

import ExercicioExceptions.entities.Account;
import ExercicioExceptions.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initalBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        System.out.println();
        Account account = new Account(number, holder, initalBalance, withdrawLimit);
        System.out.print("Enter amount for withdraw: ");
        double withdrawAmount = sc.nextDouble();

        try {
            account.withdraw(withdrawAmount);
            System.out.print("New balance: " + account.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());

        }
        sc.close();
    }
}
