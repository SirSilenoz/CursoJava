package ExercicioUdemy;

import java.util.Scanner;

public class ExercicioMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int line, columns;
        line = sc.nextInt();
        columns = sc.nextInt();

        int[][] matriz = new int[line][columns];

        //estrutura de repetição para adicionar os elementos na matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt(); //variável para verificar na matriz

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) { // verifica se o numero X existe na matriz
                    System.out.println("Position " + i +","+ j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]); //verifica se existe um número a esquerda
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]); //verifica se existe um número acima
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Right: " + matriz[i][j + 1]); //verifica se existe um número a direita
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Down: " + matriz[i+1][j]); //verifica se existe um número em baixo
                    }
                }
            }
        }
    }
}
