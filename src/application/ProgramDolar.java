//Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
//uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
//que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
// para ser responsável pelos cálculos.

package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class ProgramDolar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollar_price = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        double dollar_quantity = sc.nextDouble();
        double result = CurrencyConverter.DollarToReal(dollar_price,dollar_quantity);
        System.out.printf("Amount to be paid in reais = %.2f%n",result);



    }
}
