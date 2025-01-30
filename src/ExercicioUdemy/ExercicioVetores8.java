//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"
package ExercicioUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        int somaPares = 0;
        int quantidadePares = 0;
        System.out.print("Quantos elementos vai ter o vetor? ");
        num = sc.nextInt();

        int[] vetor = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {//verifica se o numero é par
                somaPares += vetor[i];
                quantidadePares++;
            }
        }

        if (quantidadePares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double media = (double) somaPares / quantidadePares;
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }
    }
}
