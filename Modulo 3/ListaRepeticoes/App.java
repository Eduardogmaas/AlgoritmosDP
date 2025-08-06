// import java.util.Scanner;
// //este é o exercicio dois da lista de repetição. Exemplo dado pela professora!
// public class App {
//     public static void main(String[] args) {
//         int inicio, fim, somatorio, cont;
//         Scanner sc = new Scanner(System.in);

//         //entrada
//         System.out.println("Informe os valores de inicio e fim de um intervalo numérico: ");
//         System.out.println("Inicio: ");
//         inicio = sc.nextInt();
//         System.out.println("Fim: ");
//         fim = sc.nextInt();

//         //processamento
//         somatorio = 0;
//         cont = inicio;

//         do { 
//             somatorio = somatorio + cont;
//             //somatorio++;
//             cont++;
//         } while (cont < fim + 1);

//         //saida
//         System.out.println("O somatorio números do intervalo de "+inicio+" a "+fim+" é igual a "+somatorio);
//     }
// }

//exemplo com intervalos abertos
import java.util.Scanner;
//este é o exercicio dois da lista de repetição. Exemplo dado pela professora!
public class App {
    public static void main(String[] args) {
        int inicio, fim, somatorio, cont;
        Scanner sc = new Scanner(System.in);

        //entrada
        System.out.println("Informe os valores de inicio e fim de um intervalo numérico: ");
        System.out.println("Inicio: ");
        inicio = sc.nextInt();
        System.out.println("Fim: ");
        fim = sc.nextInt();

        //processamento
        somatorio = 0;
       

        do { 
            somatorio = somatorio + inicio;
            //somatorio++;
            inicio++;
        } while (inicio <= fim);

        //saida
        System.out.println("O somatorio do intervalo do números é "+somatorio);
    }
}