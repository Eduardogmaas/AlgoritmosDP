import java.util.Scanner;

class Funcionario {
    int id;
    String nome;
    String email;
    double salario;

    public Funcionario(int id, String nome, String email, double salario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Email: " + email + ", Salário: " + salario;
    }
}

public class ExercicioCrudFuncionarios {
    static Funcionario[] funcionarios = new Funcionario[10]; 
    static int count = 0; 

    // Método de adicionar 
    public static void adicionarFuncionario(Scanner sc) {
        System.out.println("Digite o ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o email: ");
        String email = sc.nextLine();

        System.out.println("Digite o salário: ");
        double salario = sc.nextDouble();

        funcionarios[count] = new Funcionario(id, nome, email, salario);
        count++;
        System.out.println("Funcionário adicionado com sucesso!\n");
    }

    // Método que lista
    public static void listarFuncionarios() {
        if (count == 0) {
            System.out.println("Nenhum funcionário cadastrado.\n");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(funcionarios[i]);
        }
        System.out.println();
    }

    // Método de buscar 
    public static void buscarPorNome(Scanner sc) {
        System.out.println("Digite o nome para buscar: ");
        String nomeBusca = sc.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (funcionarios[i].nome.equalsIgnoreCase(nomeBusca)) {
                System.out.println(funcionarios[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Funcionário não encontrado.\n");
        }
    }

    // Método que altera
    public static void alterarFuncionario(Scanner sc) {
        System.out.println("Digite o ID do funcionário para alterar: ");
        int idBusca = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (funcionarios[i].id == idBusca) {
                System.out.println("Novo nome: ");
                funcionarios[i].nome = sc.nextLine();

                System.out.println("Novo email: ");
                funcionarios[i].email = sc.nextLine();

                System.out.println("Novo salário: ");
                funcionarios[i].salario = sc.nextDouble();

                System.out.println("Funcionário alterado com sucesso!\n");
                return;
            }
        }
        System.out.println("Funcionário com ID " + idBusca + " não encontrado.\n");
    }

    // Método que deleta
    public static void deletarFuncionario(Scanner sc) {
        System.out.println("Digite o ID do funcionário para deletar: ");
        int idBusca = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (funcionarios[i].id == idBusca) {
                for (int j = i; j < count - 1; j++) {
                    funcionarios[j] = funcionarios[j + 1];
                }
                funcionarios[count - 1] = null; 
                count--;
                System.out.println("Funcionário deletado com sucesso!\n");
                return;
            }
        }
        System.out.println("Funcionário com ID " + idBusca + " não encontrado.\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== MENU FUNCIONÁRIOS =====");
            System.out.println("1 - Adicionar funcionário");
            System.out.println("2 - Listar funcionários");
            System.out.println("3 - Buscar por nome");
            System.out.println("4 - Alterar funcionário");
            System.out.println("5 - Deletar funcionário");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); 
            

            switch (opcao) {
                case 1:
                    adicionarFuncionario(sc);
                    break;
                case 2:
                    listarFuncionarios();
                    break;
                case 3:
                    buscarPorNome(sc);
                    break;
                case 4:
                    alterarFuncionario(sc);
                    break;
                case 5:
                    deletarFuncionario(sc);
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        } while (opcao != 0);

    }
}
