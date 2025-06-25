import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);
        
        //Entrada
        System.out.println("Digite a idade");
        idade = sc.nextInt();
        sc.close();

        //Processamento
        if (idade >= 18){
            System.out.println("Pode fazer carteira de habilitação");   //Saída
        }if (idade < 18){
                System.out.println("Não pode fazer carteira de habilitação"); //Saída
        }
    }
}