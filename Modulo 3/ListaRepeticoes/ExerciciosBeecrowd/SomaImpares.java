// Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

// Entrada
// O arquivo de entrada contém dois valores inteiros.

// Saída
// O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {
        int x, y, menor, maior, soma, impares;
        Scanner sc = new Scanner(System.in);

        //Entrada
        
        x = sc.nextInt();
        
        y = sc.nextInt();
        sc.close();

        soma = 0;

        //Processamento
        if (x < y) {
            menor = x;
            maior = y;
        } else {
            menor = y;
            maior = x;
        }

        impares = menor + 1;

        while (impares < maior) {
            if (impares % 2 != 0) {
                soma = soma + impares;
            }
            impares++;
        }

        //Saída
        System.out.println(soma);
    }
}
