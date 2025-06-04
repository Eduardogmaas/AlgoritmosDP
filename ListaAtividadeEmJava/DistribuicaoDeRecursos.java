package ListaAtividadeEmJava;
import java.util.Scanner;

public class DistribuicaoDeRecursos {
    public static final Scanner TECLADO = new Scanner(System.in);

    public static double lerValorReal(){    // Criação do Método que recebe entradas
        double valor;
        valor = TECLADO.nextDouble();

        return valor;
    }
  
    public static void imprimir(String texto){  // Criação do Método que imprime saídas
        System.out.println(texto);
    }

    public static void imprimirResultados(double valorLiquido, double diferenca, double porcentagemRecebida){
        System.out.printf("%.2f\n", valorLiquido);
        System.out.printf("%.2f\n", diferenca);
        System.out.printf("%.2f%%\n", porcentagemRecebida);
    }

    public static void main(String[] args){     // Método Main
        double valorBruto; //valor recebido
        double valorIdeal; //valor bruto divido por três sem taxas
        double diff; //diferença entre valorIdeal e valorLiquido
        double taxaAdm; //valor descontado pela adm
        double taxaImposto; //valor de imposto
        double taxaLiquidaRecebida; //porcentagem de cada sócio
        double valorTotalSemImposto; // valor descontado a porcentagem de adm
        double valorSemImposto; // valor de cada sócio sem imposto
        double valorLiquido; // valor para cada sócio com imposto

        // Entrada
        imprimir("Informe o valor de entrada");
        valorBruto = lerValorReal();
        
        
        // Processamento
        valorIdeal = valorBruto / 3; // valor ideal que cada sócio receberia sem taxas
        taxaAdm = (valorBruto * 6) / 100; //valor de adm
        valorTotalSemImposto = valorBruto - taxaAdm; //valor resultante após adm
        valorSemImposto = valorTotalSemImposto / 3; //valor para cada sócio sem imposto
        taxaImposto = (valorSemImposto * 15) / 100; //imposto que cada sócio vai pagar
        valorLiquido = valorSemImposto - taxaImposto; // valor para cada sócio descontado o imposto
        taxaLiquidaRecebida = (valorLiquido / valorBruto) * 100; // porcentagem que cada sócio ficou ao final
        diff = valorIdeal - valorLiquido; // diferença do valor ideal pro valor liquido



        
        
        // Saída
        imprimirResultados(valorLiquido, diff, taxaLiquidaRecebida);
        // imprimir("A diferença foi de: " + diff);
        // imprimir("A porcentagem recebida foi de: " + taxaLiquidaRecebida);
        // imprimir("O valor após adm: " + valorTotalSemImposto);
        // imprimir("O valor para cada sócio sem imposto: " + valorSemImposto);
        // imprimir("O imposto que cada sócio pagou foi : " + taxaImposto);
        // imprimir("A porcentagem adm foi de: " + taxaAdm);
        // imprimir("O valor ideal para cada sócio é: " + valorIdeal);
        
    }
}
