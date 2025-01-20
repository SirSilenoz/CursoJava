package ExercicioUdemy;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Digite o primeiro valor: ");
        x = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        y = sc.nextInt();

        System.out.println("SOMA = " + (x+y));
    }
}
