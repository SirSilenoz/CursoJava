package ExercicioUdemy;
import java.util.Scanner;
public class CalculadoraEquação {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double A, B, C, x1, x2, delta;

        System.out.print("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        C = sc.nextDouble();

        delta = Math.pow(B,2) - 4 * A * C;

        if (delta>= 0) {
            x1 = (-B + Math.sqrt(delta)) / (2 * A);
            x2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);
        }else {
            System.out.println("A equação nao possui raízes reais");
        }
    }
}
