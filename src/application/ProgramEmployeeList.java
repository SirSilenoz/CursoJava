package application;

import entities.EmployeeList;

import java.awt.dnd.DragSourceAdapter;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployeeList {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EmployeeList> list = new ArrayList<>();

        int num;
        System.out.print("How many employees will be registered? ");
        num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println();
            System.out.println("Employee #" + i + 1);

            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken.Try again: ");
                id = sc.nextInt();

            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new EmployeeList(id, name, salary));

        }
        System.out.println();
        System.out.println("Enter the employee id that will have salary increase");
        int id = sc.nextInt();
        EmployeeList employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (EmployeeList emp : list) {
            System.out.println(emp);
        }


    }

    private static boolean hasId(List<EmployeeList> list, int id) {
        EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
