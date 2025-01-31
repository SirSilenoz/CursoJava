//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).
package ExercicioUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Quantos alunos serao digitados? ");
        num = sc.nextInt();
        sc.nextLine();

        String[] name = new String[num];
        double[] nota1 = new double[num];
        double[] nota2 = new double[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("Digite nome,primeira e segunda nota do %do aluno:\n", i + 1);
            name[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("ALUNOS APROVADOS:");
        for (int i = 0; i < num; i++) {
            if ((nota1[i] + nota2[i]) / 2 >= 6) {
                System.out.println(name[i]);
            }
        }
    }
}
