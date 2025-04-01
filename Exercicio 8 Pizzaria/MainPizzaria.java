import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPizzaria{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pizza> menuPizzas = new ArrayList<>();
        List<Pedido> pedidos = new ArrayList<>();

        menuPizzas.add(new Pizza("Marguerita", 30.0, List.of("Mussarela", "Molho de Tomate", "Manjericão"), "M"));
        menuPizzas.add(new Pizza("Calabresa", 35.0, List.of("Calabresa", "Mussarela", "Cebola"), "M"));
        menuPizzas.add(new Pizza("Quatro Queijos", 40.0, List.of("Mussarela", "Parmesão", "Gorgonzola", "Provolone"), "M"));

        while (true) {
            System.out.print("=================================================");
            System.out.println("\n1. Adicionar pedido");
            System.out.println("2. Gerenciamento de pedidos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida! Digite um número válido.");
                scanner.next();
                continue;
            }

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Escolha uma pizza:");
                for (int i = 0; i < menuPizzas.size(); i++) {
                    System.out.println((i + 1) + ". " + menuPizzas.get(i));
                }
                System.out.print("Digite o número da pizza: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida! Digite um número válido.");
                    scanner.next();
                    continue;
                }

                int escolha = scanner.nextInt() - 1;
                scanner.nextLine();

                if (escolha >= 0 && escolha < menuPizzas.size()) {
                    System.out.print("Escolha o tamanho (P, M, G): ");
                    String tamanho = scanner.nextLine().toUpperCase();
                    if (!tamanho.equals("P") && !tamanho.equals("M") && !tamanho.equals("G")) {
                        System.out.println("Tamanho inválido! Use P, M ou G.");
                        continue;
                    }

                    Pizza pizzaEscolhida = new Pizza(menuPizzas.get(escolha).getNome(),
                            menuPizzas.get(escolha).getPreco(),
                            menuPizzas.get(escolha).getIngredientes(),
                            tamanho);

                    System.out.print("Digite o endereço de entrega: ");
                    String endereco = scanner.nextLine();
                    pedidos.add(new Pedido(pizzaEscolhida, endereco));
                    System.out.println("Pedido adicionado com sucesso!");
                } else {
                    System.out.println("Escolha inválida.");
                }
            } else if (opcao == 2) {
                while (true) {
                    System.out.print("=================================================");
                    System.out.println("\n1. Acessar todos os pedidos");
                    System.out.println("2. Adicionar nova pizza");
                    System.out.println("3. Voltar");
                    System.out.print("Escolha uma opção: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Entrada inválida! Digite um número válido.");
                        scanner.next();
                        continue;
                    }

                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    if (escolha == 1) {
                        if (pedidos.isEmpty()) {
                            System.out.println("Nenhum pedido registrado.");
                        } else {
                            double totalPreco = 0;
                            System.out.println("Pedidos realizados:");
                            for (Pedido pedido : pedidos) {
                                System.out.println(pedido);
                                totalPreco += pedido.getPizza().getPreco();
                            }
                            System.out.println("Número total de pedidos: " + pedidos.size());
                            System.out.println("Preço médio dos pedidos: R$ " + (totalPreco / pedidos.size()));
                        }
                    } else if (escolha == 2) {
                        System.out.print("Digite o nome da nova pizza: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o preço da pizza: ");
                        double preco = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Digite os ingredientes separados por vírgula: ");
                        String[] ingredientesArray = scanner.nextLine().split(",");
                        List<String> ingredientes = new ArrayList<>();
                        for (String ing : ingredientesArray) {
                            ingredientes.add(ing.trim());
                        }
                        menuPizzas.add(new Pizza(nome, preco, ingredientes, "M"));
                        System.out.println("Nova pizza adicionada com sucesso!");
                    } else if (escolha == 3) {
                        break;
                    } else {
                        System.out.println("Opção inválida.");
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
