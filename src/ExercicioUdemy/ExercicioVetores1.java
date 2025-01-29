//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
package ExercicioUdemy;

import java.util.Scanner;

public class ExercicioVetores1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int num = sc.nextInt();

        int[] vetor = new int[num];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }
        sc.close();
    }
}
