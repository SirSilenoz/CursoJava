//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
package ExercicioUdemy;

import java.util.Scanner;

public class ExercicioVetores4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int paresQuantidade = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        num = sc.nextInt();
        sc.nextLine();

        int[] numeros = new int[num];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                paresQuantidade++;
            }
        }
        int[] pares = new int[paresQuantidade];
        int index = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[index] = numeros[i];
                index++;
            }
        }

        System.out.println("NUMEROS PARES:");

        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + pares.length);
    }
}