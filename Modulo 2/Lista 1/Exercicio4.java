import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        char combustivel;
        double pagamento;
        int quantidadeLitros;
        double descontoCombustivel;
        Scanner sc = new Scanner(System.in);
        //Não ta pronto!!
        //Entrada
        System.out.println("Informe o tipo de combustível");
        combustivel = sc.next().charAt(0); 
        System.out.println("Informe a quantidade de combustível");       
        quantidadeLitros = sc.nextInt();
        sc.close();

        //Processamento
        switch (char) {
            case A: 
                pagamento = quantidadeLitros * 4.30;
                break;
        
            default:
                break;
        }
    }
}
