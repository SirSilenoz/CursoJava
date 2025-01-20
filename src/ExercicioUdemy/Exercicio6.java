package ExercicioUdemy;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio6 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A,B,C,triangulo,circulo,trapezio,quadrado,retangulo;

        System.out.println("A:");
        A = sc.nextDouble();
        System.out.println("B:");
        B = sc.nextDouble();
        System.out.println("C:");
        C = sc.nextDouble();

        triangulo = A * C / 2;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) * C / 2;
        quadrado = B * 4;
        retangulo = A * B;

        System.out.printf("TRIANGULO:%.3f%n ",triangulo);
        System.out.printf("CIRCULO:%.3f%n ",circulo);
        System.out.printf("TRAPEZIO:%.3f%n ",trapezio);
        System.out.printf("QUADRADO:%.3f%n ",quadrado);
        System.out.printf("RETANGULO:%.3f%n ",retangulo);


    }
}
