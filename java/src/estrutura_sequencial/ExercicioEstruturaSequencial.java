package estrutura_sequencial;

import java.util.Scanner;

public class ExercicioEstruturaSequencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;


        // Exercício 1

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("SOMA = " + (n1 + n2));

        // Exercício 2

        double raio = sc.nextDouble();

        System.out.println("Area = " + (pi * Math.pow(raio, 2)));

        // Exercício 3

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        System.out.println("Diferença = " + (A * B - C * D));

        // Exercício 4

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorPorHora = sc.nextDouble();

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", horasTrabalhadas * valorPorHora);

        // Exercício 5

        int peca1 = sc.nextInt();
        int numeoroPeca1 = sc.nextInt();
        double valorUnitario1 = sc.nextDouble();

        int peca2 = sc.nextInt();
        int numeoroPeca2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        double totalPeca1 = numeoroPeca1 * valorUnitario1;
        double totalPeca2 = numeoroPeca2 * valorUnitario2;

        System.out.printf("Valor a pagar R$ %.2f", (totalPeca1 + totalPeca2));

        // Exercício 6

        double A2 = sc.nextDouble();
        double B2 = sc.nextDouble();
        double C2 = sc.nextDouble();

        System.out.println("TRIANGULO: " + ((A2 * C2) / 2));
        System.out.println("CIRCULO: " + (pi * Math.pow(C2, 2)));
        System.out.println("TRAPEZIO: " + (((A2 + B2) * C2)) / 2);
        System.out.println("QUADRADO: " + (Math.pow(B2, 2)));
        System.out.println("RETANGULO: " + (A2 * B2));






    }
}
