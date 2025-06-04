import java.util.Scanner; 


public class AreaLosango {

    public static final Scanner TECLADO = new Scanner(System.in);

    public static double lerValorReal(){    // Criação do Método que recebe entradas
        double valor;
        valor = TECLADO.nextDouble();

        return valor;
    }
  
    public static void imprimir(String texto){  // Criação do Método que imprime saídas
        System.out.println(texto);
    }

    public static double calcularLosango(double diagonalMaior, double diagonalMenor){ 
        double area;
    
        area = (diagonalMaior * diagonalMenor)/2;

        return area;
    }

    public static void main(String[] args){     // Método Main
        double diagonalMaior;
        double diagonalMenor; 
        double area;

        // Entrada
        imprimir("Informe o valor da diagonal maior");
        diagonalMaior = lerValorReal();
        imprimir("Informe o valor da diagonal menor");
        diagonalMenor = lerValorReal();
        
        // Processamento
        area = calcularLosango(diagonalMaior, diagonalMenor);
        
        // Saída
        imprimir("A area do Losango é: " + area);
    }


}
