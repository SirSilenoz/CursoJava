package ExercicioUdemy;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.Locale;
public class Exercicio3 {
    public static void main(String []args){
        Locale.setDefault(Locale.US);
        int A,B,C,D,dif;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor A:");
        A = sc.nextInt();
        System.out.println("Digite o valor B:");
        B = sc.nextInt();
        System.out.println("Digite o valor C:");
        C = sc.nextInt();
        System.out.println("Digite o valor D:");
        D = sc.nextInt();

        dif = (A * B) - (C * D);
        System.out.println("Diferenca = "+dif);




    }
}
