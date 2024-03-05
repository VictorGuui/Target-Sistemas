package Java;
import java.util.Scanner;

public class InverterString {
    public static String inverterString(String s) {
        char[] caracteres = s.toCharArray();
        int tamanho = caracteres.length;

        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - i - 1];
            caracteres[tamanho - i - 1] = temp;
        }

        return new String(caracteres);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma string para inverter: ");
            String stringOriginal = scanner.nextLine();

            String stringInvertida = inverterString(stringOriginal);

            System.out.println("String Original: " + stringOriginal);
            System.out.println("String Invertida: " + stringInvertida);
        }
    }
}
