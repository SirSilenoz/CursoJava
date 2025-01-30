//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
package ExercicioUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        double valorTotal = 0;
        System.out.print("Quantos elementos vai ter o vetor? ");
        num = sc.nextInt();

        double[] vetor = new double[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            valorTotal += vetor[i];
        }

        double media = valorTotal / vetor.length;
        System.out.println("Media do vetor = " + media);

        System.out.println("Elementos abaixo da media:");
        for (int i = 0; i < num; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }
    }
}
