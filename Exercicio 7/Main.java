import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Produto> Estoque = new ArrayList<>();
    private static Scanner Leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int Opcao;

        while (true) {

            System.out.println("\n--- Sistema do Mercado---");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Gerar Relatório De Estoque");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: ");

            Opcao = Leitor.nextInt();
            Leitor.nextLine();

            switch (Opcao) {
                case 1:

                    System.out.print("Digite o nome do produto: ");
                    String Nome = Leitor.nextLine();
                    System.out.print("Digite o código do produto: ");
                    String Codigo = Leitor.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    float Preco = Leitor.nextFloat();
                    System.out.print("Digite a quantidade em estoque: ");
                    int QuantidadeEstoque = Leitor.nextInt();

                    Produto NovoProduto = new Produto(Nome, Codigo, Preco, QuantidadeEstoque);
                    Estoque.add(NovoProduto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o código do produto para atualizar: ");
                    Codigo = Leitor.nextLine();
                    Produto AtualizarProduto = Produto.EncontrarProduto(Codigo, Estoque);

                    if (AtualizarProduto != null) {
                        System.out.print("Digite o novo nome do produto: ");
                        AtualizarProduto.NovoNome(Leitor.nextLine());
                        System.out.print("Digite o novo preço do produto: ");
                        AtualizarProduto.NovoPreco(Leitor.nextFloat());
                        System.out.print("Digite a nova quantidade em estoque: ");
                        AtualizarProduto.NovoQuantidadeEstoque(Leitor.nextInt());
                        System.out.println("Produto atualizado com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o código do produto para remover: ");
                    Codigo = Leitor.nextLine();
                    Produto RemoverProduto = Produto.EncontrarProduto(Codigo, Estoque);

                    if (RemoverProduto != null) {
                        Estoque.remove(RemoverProduto);
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    if (Estoque.isEmpty()) {
                        System.out.println("Estoque vazio.");
                    } else {
                        System.out.println("\n--- RELATÓRIO DE ESTOQUE ---");
                        float ValorTotalEstoque = 0;

                        for (int i = 0; i < Estoque.size(); i++) {
                            Produto P = Estoque.get(i);

                            System.out.println("\nProduto: " + P.MostrarNome());
                            System.out.println(" Código: " + P.MostrarCodigo());
                            System.out.println("Preço: " + P.MostrarPreco());
                            System.out.println("Quantidade em Estoque: " + P.MostrarQuantidadeEstoque() + "\n");
                            ValorTotalEstoque += P.CalcularValorTotal();
                        }

                        System.out.println("Valor total do estoque atual: " + ValorTotalEstoque);
                    }
                    break;

                case 5:

                    System.out.println("Fechando o sistema");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
