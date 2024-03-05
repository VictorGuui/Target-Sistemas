package Java;

import java.util.Scanner;

public class VerificaFibonacci {
    public static boolean verificaFibonacci(int numero) {
        int a = 0, b = 1;

        while (b <= numero) {
            if (b == numero) {
                return true;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }

        return false;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
            int numeroInformado = scanner.nextInt();

            if (verificaFibonacci(numeroInformado)) {
                System.out.println(numeroInformado + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(numeroInformado + " não pertence à sequência de Fibonacci.");
            }
        }
    }
}
