import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        ArrayList<Livro> listaLivros = new ArrayList<>();

        int Escolha = 0;
        while (Escolha != 3) {
            System.out.println("====================================================================");
            System.out.println("Bem vindo! Você gostaria de registrar um livro ou acessar um livro?");
            System.out.println("1 : Registro de Livro.");
            System.out.println("2 : Ver livros registrados.");
            System.out.println("3 : Sair \n");
            Escolha = Leitor.nextInt();
            Leitor.nextLine();

            if (Escolha == 1) {
                System.out.print("Quantos livros você quer registrar?  ");
                int numLivros = Leitor.nextInt();
                Leitor.nextLine();

                for (int i = 0; i < numLivros; i++) {
                    System.out.println("\n Livro " + (i + 1) + ":");
                    System.out.print("Título: ");
                    String titulo = Leitor.nextLine();
                    System.out.print("Autor: ");
                    String autor = Leitor.nextLine();
                    System.out.print("Ano de publicação: ");
                    int ano = Leitor.nextInt();
                    Leitor.nextLine();

                    Livro livro = new Livro(titulo, autor, ano);
                    listaLivros.add(livro);
                    System.out.println("Livro Registrado!");
                }
            } else if (Escolha == 2) {
                if (listaLivros.isEmpty()) {
                    System.out.println("Não há livros registrados");
                } else {
                    System.out.println("Livros Registrados: ");
                    for (int i = 0; i < listaLivros.size(); i++) {
                        System.out.println("Livro " + (i + 1) + ":");
                        listaLivros.get(i).exibirInfo();
                    }
                }
            }
        }
        Leitor.close();
    }
}