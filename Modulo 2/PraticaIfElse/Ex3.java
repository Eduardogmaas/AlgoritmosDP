import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int numeroNatural;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número natural");
        numeroNatural = sc.nextInt();
        sc.close();

        if (numeroNatural % 2 == 0){
            numeroNatural = numeroNatural * 2;
        }else if(numeroNatural % 2 == 1){
            numeroNatural = numeroNatural * 3;
        }

        System.out.println(numeroNatural);
    }
}
