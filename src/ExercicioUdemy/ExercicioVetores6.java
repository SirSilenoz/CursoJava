//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.
package ExercicioUdemy;

import java.util.Scanner;

public class ExercicioVetores6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Quantos valores vai ter cada vetor? ");
        num = sc.nextInt();

        int[] vetorA = new int[num];
        int[] vetorB = new int[num];
        //loop adicionar elementos no vetorA
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < num; i++) {
            vetorA[i] = sc.nextInt();
        }
        //loop adicionar elementos no vetorB
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < num; i++) {
            vetorB[i] = sc.nextInt();
        }

        int[] vetorC = new int[num];
        //loop adicionar no vetorC[i] o resultado do vetorA[i] + vetorB[i]
        System.out.println("Vetor resultante:");
        for (int i = 0; i < num; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }


    }


}
