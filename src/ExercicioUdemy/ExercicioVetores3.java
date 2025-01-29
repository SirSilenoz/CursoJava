//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.
package ExercicioUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, numMenores = 0;
        double alturaTotal = 0, alturaMedia, percentualMenores;

        System.out.print("Quantas pessoas serao digitadas? ");
        num = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[num];
        int[] idade = new int[num];
        double[] altura = new double[num];

        //loop adicionar pessoa no array
        for (int i = 0; i < num; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
            sc.nextLine();
        }
        //loop para conseguir o valor total e a quantidade de menores de 16 anos
        for (int i = 0; i < num; i++) {
            if (idade[i] < 16) {
                numMenores++;
            }
            alturaTotal += altura[i];
        }
        //calculando altura media e a porcentagem de menores de 16 anos
        alturaMedia = alturaTotal / num;
        percentualMenores = ((double) numMenores / num) * 100;

        System.out.printf("Altura média: %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", percentualMenores);

        if (numMenores > 0) {
            System.out.println("Nome das pessoas com menos de 16 anos:");
            for (int i = 0; i < num; i++) {
                if (idade[i] < 16) {
                    System.out.printf("%s\n", nome[i]);
                }
            }
        } else {
            System.out.println("Nao ha menores de 16 anos");
        }
        sc.close();
    }
}