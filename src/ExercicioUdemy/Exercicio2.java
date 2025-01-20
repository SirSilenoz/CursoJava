package ExercicioUdemy;
import java.util.Scanner;
import java.util.Locale;
public class Exercicio2 {
    public static void main(String []args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio;

        System.out.println("Digite o raio: ");
        raio = sc.nextDouble();
        double area = 3.14159 * Math.pow(raio,2);
        System.out.printf("A área é: %.4f",area);

    }
}
