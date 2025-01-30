//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero)
package ExercicioUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Quantos numeros voce vai digitar?");
        num = sc.nextInt();

        int[] vetor = new int[num];

        //loop adicionar elementos no array
        for (int i = 0; i < num; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        int maiorNum = 0;
        int posmaior = 0;

        //verificar se o número do vetor é maior que o número da variavel maiorNum
        for (int i = 0; i < num; i++) {
            if (vetor[i] > maiorNum) {
                maiorNum = vetor[i];
                posmaior = i;
            }
        }

        System.out.print("Maior Valor: " + maiorNum + "\n");
        System.out.println("Posicao do maior valor: " + posmaior);

    }

}

