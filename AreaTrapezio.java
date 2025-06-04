import java.util.Scanner; 


public class AreaTrapezio {

    public static final Scanner TECLADO = new Scanner(System.in);

    public static double lerValorReal(){    // Criação do Método que recebe entradas
        double valor;
        valor = TECLADO.nextDouble();

        return valor;
    }
  
    public static void imprimir(String texto){  // Criação do Método que imprime saídas
        System.out.println(texto);
    }

    public static double calcularTrapezio(double baseMaior, double baseMenor, double altura){ 
        double area;
    
        area = ((baseMaior + baseMenor) * altura)/2;

        return area;
    }

    public static void main(String[] args){     // Método Main
        double baseMaior;
        double baseMenor;
        double altura; 
        double area;

        // Entrada
        imprimir("Informe o valor da base maior");
        baseMaior = lerValorReal();
        imprimir("Informe o valor da base menor");
        baseMenor = lerValorReal();
        imprimir("Informe o valor da altura");
        altura = lerValorReal();
        
        // Processamento
        area = calcularTrapezio(baseMaior, baseMenor, altura);
        
        // Saída
        imprimir("A area do Trapézio é: " + area);
    }


}