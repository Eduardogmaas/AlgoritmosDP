import java.util.Scanner;

public class ExemploManipulacaoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();
        sc.close();

        // Processamento e Saída
        System.out.println("Em maiúsculas: " + frase.toUpperCase());
        System.out.println("Em minúsculas: " + frase.toLowerCase());
        System.out.println("Número de caracteres: " + frase.length());

        
        if (frase.length() >= 3) {
            System.out.println("Três primeiros caracteres: " + frase.substring(0, 3));
        } else {
            System.out.println("A frase tem menos de 3 caracteres!");
        }
    }
}
