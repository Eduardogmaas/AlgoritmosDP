import java.util.Scanner;

public class AreaEquilatero{

    public static final Scanner TECLADO = new Scanner(System.in); // Criação do Scanner

    public static double lerValorReal(){    // Criação do Método que recebe entradas
        double valor;
        valor = TECLADO.nextDouble();

        return valor;
    }
  
    public static void imprimir(String texto){  // Criação do Método que imprime saídas
        System.out.println(texto);
    }

    public static double calcularEquilatero(double lado){ 
        double area;
    
        area = ((lado * lado) * Math.sqrt(3))/4 ;

        return area;
    }   
    
    public static void main(String[] args){     // Método Main
        double lado;
        double area;

        // Entrada
        imprimir("Informe o valor da base");
        lado = lerValorReal();
        
        
        // Processamento
        area = calcularEquilatero(lado);
        
        // Saída
        imprimir("A area do triangulo é: " + area);
    }
}
