package ExercicioUdemy;
import java.util.Scanner;
import java.util.Locale;
public class Exercicio4 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int employee_num,hours;
        double hourly_rate,salary;

        System.out.println("Number: ");
        employee_num = sc.nextInt();
        System.out.println("Worked hours: ");
        hours = sc.nextInt();
        System.out.println("Hourly rate: ");
        hourly_rate = sc.nextDouble();

        salary = hours * hourly_rate;

        System.out.println();
        System.out.println("Number = "+employee_num);
        System.out.printf("Salary = U$ %.2f",salary);

        sc.close();



    }
}
