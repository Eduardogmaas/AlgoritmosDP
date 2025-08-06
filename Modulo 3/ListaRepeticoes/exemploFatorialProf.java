import java.util.Scanner;

public class exemploFatorialProf {
    public static void main(String[] args) {
        int numero, somatorio, cont;
        Scanner sc = new Scanner(System.in);

        //entrada
        System.out.println("Informe um número: ");
        // System.out.println("Inicio: ");
        numero = sc.nextInt();
        // System.out.println("Fim: ");
        // fim = sc.nextInt();
        sc.close();
        //processamento
        somatorio = numero;
        cont = numero - 1;
        
       

        do { 
            somatorio = somatorio * cont;
            //somatorio++;
            cont--;
        } while (cont > 1);

        //saida
        System.out.println("O exponencial do número "+numero+" é "+somatorio);
    }
}