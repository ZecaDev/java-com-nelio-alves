package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class TesteEntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

//        String x;
//        x = sc.next();
//        System.out.println("Voce digitou o valor: " + x);

//        int x;
//        x = sc.nextInt();
//        System.out.println("Voce Digitou o valor: " + x);

//        double x;
//        x = sc.nextDouble();
//        System.out.println("Voce Digitou o valor: " + x);

        char x;
        x = sc.next().charAt(0);
        System.out.println("Voce Digitou o valor: " + x);


        sc.close();

    }
}
