import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        char letra;
        Scanner sc = new Scanner(System.in);

        //Entrada
        System.out.println("Informe uma letra");
        letra = sc.next();
        sc.close();

        //Processamento
        if ( letra == 'A' || letra == 'a' || letra == 'E' || letra == 'e' || letra == 'I' || letra == 'i' || letra == 'O' || letra == 'o' || letra == 'U' || letra == 'u') {
            System.out.println("A letra informada é uma vogal");
        } else {System.out.println("A letra informada é uma consoante");
                } 
    }
}
