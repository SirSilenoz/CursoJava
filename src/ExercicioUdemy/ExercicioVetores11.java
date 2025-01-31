//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.
package ExercicioUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Quantas pessoas serao digitadas? ");
        num = sc.nextInt();

        double[] altura = new double[num];
        char[] genero = new char[num];

        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturaMulheres = 0;
        int numHomens = 0;
        int numMulheres = 0;

        for (int i = 0; i < num; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }

        for (int i = 0; i < num; i++) {
            if (Character.toUpperCase(genero[i]) == 'M') {
                numHomens++;
            } else if (Character.toUpperCase(genero[i]) == 'F') {
                somaAlturaMulheres += altura[i];
                numMulheres++;
            }
        }

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        double mediaMulher = somaAlturaMulheres / numMulheres;

        System.out.printf("Media das alturas das mulheres = %.2f%n" , mediaMulher);
        System.out.println("Numero de homens = " + numHomens);

    }
}
