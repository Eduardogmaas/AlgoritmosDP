package ListaAreas;
import java.util.Scanner;

public class AreaTriangulo{

    public static final Scanner TECLADO = new Scanner(System.in); // Criação do Scanner

    public static double lerValorReal(){    // Criação do Método que recebe entradas
        double valor;
        valor = TECLADO.nextDouble();

        return valor;
    }
  
    public static void imprimir(String texto){  // Criação do Método que imprime saídas
        System.out.println(texto);
    }

    public static double calcularAreaTriangulo(double base, double altura){ 
        double area;
    
        area = (base * altura) / 2;

        return area;
    }

    public static double calcularAreaCirculo(double raio){ // (pi*r)²
        double areaCirculo;
        final double PI = 3.1415;

        areaCirculo = PI * (raio * raio);

        return areaCirculo;
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
        area = calcularAreaTriangulo(base, altura);
        
        // Saída
        imprimir("A area do triangulo é: " + area);
    }
}

/* 
1- Nome da Classe sempre com primeira letra maiscúla
2- Nome do Arquivo é o mesmo nome da Classe
3- Nomenclatura com CamelCase
4- Todos os programas deverão ter divisão clara entre ENTRADA, PROCESSAMENTO e SAÍDA
5- O Main deve ser mais simples possível  
*/