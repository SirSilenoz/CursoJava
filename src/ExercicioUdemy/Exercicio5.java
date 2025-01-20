package ExercicioUdemy;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod1,cod2,und1,und2;
        double valor1,valor2;

        System.out.println("Codigo da 1º peça:");
        cod1 = sc.nextInt();
        System.out.println("Número de peças:");
        und1 = sc.nextInt();
        System.out.println("Valor únitário:");
        valor1 = sc.nextDouble();

        System.out.println("Codigo da 2º peça:");
        cod2 = sc.nextInt();
        System.out.println("Número de peças:");
        und2 = sc.nextInt();
        System.out.println("Valor únitário:");
        valor2 = sc.nextDouble();

        double total = (valor1 * und1) + (valor2 * und2);
        System.out.println();
        System.out.printf("VALOR A PAGAR:R$%.2f " , total);



    }
}
