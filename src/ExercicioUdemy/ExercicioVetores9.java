//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha
package ExercicioUdemy;

import java.util.Scanner;

public class ExercicioVetores9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Quantas pessoas voce vai digitar? ");
        num = sc.nextInt();
        sc.nextLine();

        String[] name = new String[num];
        int[] idade = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("Dados da %da pessoa\n", i + 1);
            System.out.print("Nome: ");
            name[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();
        }

        int maisVelho = 0;
        int posMaior = 0;
        for (int i = 0; i < num; i++) {
            if (idade[i] > maisVelho) {
                maisVelho = idade[i];
                posMaior = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + name[posMaior]);


    }
}