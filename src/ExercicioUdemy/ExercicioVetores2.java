//Faça um programa que leia N números reais e armazene-os em um vetor.
// Em seguida:
// - Imprimir todos os elementos do vetor
// - Mostrar na tela a soma e a média dos elementos do vetor
package ExercicioUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int num = sc.nextInt();

        double[] vetor = new double[num];
        double sum = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            sum += vetor[i];

        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.2f ", vetor[i]);
        }
        System.out.println();

        System.out.printf("%.2f", sum);
        System.out.printf("MEDIA = %.2f", sum / vetor.length);

        sc.close();
    }
}