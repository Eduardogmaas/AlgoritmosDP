import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        int numeroUm, numeroDois, somaTotal;
        Scanner sc = new Scanner(System.in);

        //Entrada
        System.out.println("Informe um número");
        numeroUm = sc.nextInt();
        System.out.println("Informe o segundo número");
        numeroDois = sc.nextInt();
        sc.close();

        somaTotal = 0;

        //Processamento
        while(numeroUm <= numeroDois){
            somaTotal = somaTotal + numeroUm;
            numeroUm++;
        }
        
        //Saída
        System.out.println("A soma ficou: " + somaTotal);
    }
}
