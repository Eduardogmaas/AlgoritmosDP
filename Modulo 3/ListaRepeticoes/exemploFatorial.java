import java.util.Scanner;

public class exemploFatorial {
    public static void main(String[] args) {
        int numero, somatorio;
        Scanner sc = new Scanner(System.in);

        //entrada
        System.out.println("Informe um número: ");
        // System.out.println("Inicio: ");
        numero = sc.nextInt();
        // System.out.println("Fim: ");
        // fim = sc.nextInt();

        //processamento
        somatorio = numero;
       

        do { 
            somatorio = somatorio * (numero -1);
            //somatorio++;
            numero--;
        } while (numero > 1);

        //saida
        System.out.println("O exponencial do número "+numero+" é "+somatorio);
    }
}