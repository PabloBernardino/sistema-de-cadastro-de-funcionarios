import java.util.Scanner;
import java.util.Locale;

class SistemaDeCadastroDeFuncionarios {

    public static void SistemaDeCadastroDeFuncionarios(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));

        Scanner scanner = new Scanner(System.in);

        int opcao;

        String nomes[] = new String[100];
        int idades[] = new int[100];
        String cargos[] = new String[100];
        double salarios[] = new double[100];

        int contador = 0;

        do {

            System.out.println();
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar");
            System.out.println("4 - Atualizar");
            System.out.println("5 - Remover");
            System.out.println("0 - Sair");

            System.out.println();

            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println();
                    System.out.println("Cadastro de funcionário");
                    System.out.println();

                    for (contador = 0; contador < nomes.length; contador++) {

                        if (nomes[contador] == null) {

                            System.out.print("Digite o nome do funcionário: ");
                            nomes[contador] = scanner.nextLine();

                            System.out.print("Digite a idade do funcionário: ");
                            idades[contador] = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Digite o cargo do funcionário: ");
                            cargos[contador] = scanner.nextLine();

                            System.out.print("Digite o salário do funcionário: ");
                            salarios[contador] = scanner.nextDouble();
                            scanner.nextLine();

                            break;
                        }
                    }

                    break;

                case 2:

                    System.out.println();
                    System.out.println("Lista de funcionários");
                    System.out.println();

                    for (contador = 0; contador < nomes.length; contador++) {

                        if (nomes[contador] != null) {

                            System.out.println("Funcionário: " + nomes[contador]);
                            System.out.println("Idade: " + idades[contador]);
                            System.out.println("Cargo: " + cargos[contador]);
                            System.out.println("Salário: " + salarios[contador]);

                            System.out.println();

                        }else if (nomes[contador] == null && contador == 0) {

                            System.out.println("Nenhum funcionário cadastrado.");

                            break;
                        }
                    }

                    break;

                case 3:

                    System.out.print("Digite o nome do funcionário: ");
                    String nomeBusca = scanner.nextLine();

                    boolean encontrado = false;

                    for (contador = 0; contador < nomes.length; contador++) {

                        if (nomes[contador] != null && nomes[contador].equalsIgnoreCase(nomeBusca)) {

                            System.out.println();
                            System.out.println("Funcionário encontrado");

                            System.out.println("Nome: " + nomes[contador]);
                            System.out.println("Idade: " + idades[contador]);
                            System.out.println("Cargo: " + cargos[contador]);
                            System.out.println("Salário: " + salarios[contador]);

                            encontrado = true;

                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Funcionário não encontrado.");
                    }

                    break;

                case 4:

                    System.out.print("Digite o nome do funcionário: ");
                    String nomeAtualizar = scanner.nextLine();

                    boolean atualizado = false;

                    for (contador = 0; contador < nomes.length; contador++) {

                        if (nomes[contador] != null && nomes[contador].equalsIgnoreCase(nomeAtualizar)) {

                            System.out.println();
                            System.out.println("Funcionário encontrado");

                            System.out.print("Novo nome: ");
                            nomes[contador] = scanner.nextLine();

                            System.out.print("Nova idade: ");
                            idades[contador] = scanner.nextInt();
                            scanner.nextLine(); // Consumir a nova linha após ler a idade

                            System.out.print("Novo cargo: ");
                            cargos[contador] = scanner.nextLine();

                            System.out.print("Novo salário: ");
                            salarios[contador] = scanner.nextDouble();
                            scanner.nextLine(); // Consumir a nova linha após ler o salário

                            atualizado = true;

                            break;
                        }
                    }

                    if (!atualizado) {
                        System.out.println("Funcionário não encontrado.");
                    }

                    break;

                case 5:

                    System.out.print("Digite o nome do funcionário: ");
                    String nomeRemover = scanner.nextLine();

                    boolean removido = false;

                    for (contador = 0; contador < nomes.length; contador++) {

                        if (nomes[contador] != null && nomes[contador].equalsIgnoreCase(nomeRemover)) {

                            nomes[contador] = null;
                            idades[contador] = 0;
                            cargos[contador] = null;
                            salarios[contador] = 0;

                            removido = true;

                            System.out.println("Funcionário removido.");

                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("Funcionário não encontrado.");
                    }

                    break;

                case 0:

                    System.out.println("Saindo do sistema...");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}