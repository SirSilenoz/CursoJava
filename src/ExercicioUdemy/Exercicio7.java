//Faça um programa para ler as medidas dos lados de dois triângulos, X e Y (suponha que as medidas sejam válidas).
//Em seguida, mostre o valor das áreas dos dois triângulos e informe qual deles possui a maior área
//A fórmula para calcular a área de um triângulo a partir das medidas de seus lados
//a,𝑏,𝑐 é a seguinte (fórmula de Heron).

package ExercicioUdemy;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB +xC) / 2;
        double areaX = Math.sqrt(p * (p-xA) * (p-xB) * (p-xC));

        p = (yA + yB +yC) / 2;
        double areaY = Math.sqrt(p * (p-yA) * (p-yB) * (p-yC));

        System.out.printf("Triangle X area: %.4f%n",areaX);
        System.out.printf("Triangle Y area: %.4f%n",areaY);

        if (areaX > areaY){
            System.out.println("Larger area : X");
        }else{
            System.out.println("Larger area : Y");
        }

        sc.close();
    }
}
