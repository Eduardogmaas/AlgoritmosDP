import java.util.Scanner; 

public class AreaCirculo{

    public static final Scanner TECLADO = new Scanner(System.in); // Criação do Scanner

    public static double lerValorReal(){    // Criação do Método que recebe entradas
        double valor;
        valor = TECLADO.nextDouble();

        return valor;
    }
  
    public static void imprimir(String texto){  // Criação do Método que imprime saídas
        System.out.println(texto);
    }

    public static double calcularAreaCirculo(double raio){ // (pi*r)²
        double areaCirculo;
        final double PI = 3.1415;

        areaCirculo = PI * (raio * raio);

        return areaCirculo;
    }

    public static void main(String[] args){     // Método Main
        double raio; 
        double area;

        // Entrada
        imprimir("Informe o valor do raio");
        raio = lerValorReal();
        
        
        // Processamento
        area = calcularAreaCirculo(raio);
        
        // Saída
        imprimir("A area do Circulo é: " + area);
    }
}