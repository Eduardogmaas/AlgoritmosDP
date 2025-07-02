import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int primeiroValor;
        int segundoValor;
        int terceiroValor;
        int maiorValor;
        int medioValor;
        int menorValor;
        int somaValores;
        Scanner sc = new Scanner(System.in);

        //Entrada
        System.out.println("Informe o primeiro valor");
        primeiroValor = sc.nextInt();
        System.out.println("Informe o segundo valor");
        segundoValor = sc.nextInt();
        System.out.println("Informe o terceiro valor");
        terceiroValor = sc.nextInt();
        sc.close();

        //Processamento
        maiorValor = primeiroValor;
        medioValor = primeiroValor;
        menorValor = primeiroValor;

        if (segundoValor > maiorValor) { 
            maiorValor = segundoValor;
        } else {
            medioValor = segundoValor;
        }
        
        if (terceiroValor > maiorValor){
            maiorValor = terceiroValor;
        } else {
            if (terceiroValor > medioValor){
                medioValor = terceiroValor;    
            }
            else if (terceiroValor < medioValor){
                menorValor = terceiroValor;    
            }
        }

        if ((segundoValor < maiorValor) && (segundoValor < medioValor ) ) {
                menorValor = segundoValor;         
        } else {
            if ((terceiroValor < maiorValor) && (terceiroValor < medioValor ) ) {
                menorValor = terceiroValor; 
            }
        }    
        //ainda n deu 100% quando se insere números em ordem crescente, começando pelo menor até o maior, ele não altera o médio valor
        somaValores = maiorValor + medioValor;
        //Saída
        System.out.println("maior valor" + maiorValor);
        System.out.println("médio valor" + medioValor);
        System.out.println("menor valor" + menorValor);
        System.out.println("A soma dos maiores valores foi de" + somaValores);
    }    
}
