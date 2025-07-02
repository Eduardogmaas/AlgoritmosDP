import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        //Entrada
        System.out.println("Informe um número");
        numero = sc.nextInt();
        sc.close();

        //Processamento e saída
        if (numero % 2 == 0){
            System.out.println("Este número é par\n" + numero);
        }else if(numero % 2 == 1){
            System.out.println("Este número é impar\n" + numero);
        }

    }
}    
