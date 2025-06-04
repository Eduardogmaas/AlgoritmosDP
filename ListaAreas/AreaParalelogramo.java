package ListaAreas;
import java.util.Scanner; 


public class AreaParalelogramo {

    public static final Scanner TECLADO = new Scanner(System.in);

    public static double lerValorReal(){    // Criação do Método que recebe entradas
        double valor;
        valor = TECLADO.nextDouble();

        return valor;
    }
  
    public static void imprimir(String texto){  // Criação do Método que imprime saídas
        System.out.println(texto);
    }

    public static double calcularParalelogramo(double base, double altura){ 
        double area;
    
        area = base * altura;

        return area;
    }

    public static void main(String[] args){     // Método Main
        double base;
        double altura; 
        double area;

        // Entrada
        imprimir("Informe o valor da base");
        base = lerValorReal();
        imprimir("Informe o valor da altura");
        altura = lerValorReal();
        
        // Processamento
        area = calcularParalelogramo(base, altura);
        
        // Saída
        imprimir("A area do Paralelogramo é: " + area);
    }


}
