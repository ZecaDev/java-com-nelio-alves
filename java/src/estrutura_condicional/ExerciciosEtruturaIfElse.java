package estrutura_condicional;

import java.util.Scanner;

public class ExerciciosEtruturaIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Exercício 1

        int num = sc.nextInt();

        if (num >= 0 ) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }


        // Exercício 2

        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        // Exercício 3

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (B > A) {
            if (B % A == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else {
            if (A % B == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }
    }
}
