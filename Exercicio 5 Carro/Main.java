import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);

        ArrayList<Carro> ListaCarros = new ArrayList<>();

        int Escolha = 0;

        while(Escolha != 5){

            System.out.println("\n=====================================");
            System.out.println("Bem vindo ao sistema de carros do evento!\n");
            System.out.println("Escolha uma opção: ");
            System.out.println("1: Registrar Carro.");
            System.out.println("2: Mostrar Carros.");
            System.out.println("3: Acelerar um carro.");
            System.out.println("4: Freiar um carro.");
            System.out.println("5: Sair.");
            System.out.print("==========================================\n");

            Escolha = Leitor.nextInt();

            switch(Escolha){

                case 1:
                    System.out.print("Modelo: ");
                    Leitor.nextLine();
                    String Modelo = Leitor.nextLine();

                    System.out.print("Marca: ");
                    String Marca = Leitor.nextLine();

                    System.out.print("Ano de lançamento: ");
                    int Ano = Leitor.nextInt();
                    Leitor.nextLine();

                    System.out.print("Placa: ");
                    String Placa = Leitor.nextLine();

                    System.out.print("Velocidade Atual: Km/h ");
                    float VelocidadeAtual = Leitor.nextFloat();

                    Carro NovoCarro = new Carro (Modelo, Marca, Ano, Placa, VelocidadeAtual);
                    ListaCarros.add(NovoCarro);

                    System.out.print("Carro registrado com sucesso!\n");
                    break;

                case 2:
                    System.out.print("Lista de Carros:\n");
                    for (int i = 0; i < ListaCarros.size();i++){
                        Carro Carro = ListaCarros.get(i);
                        Carro.CarrosInformacoes();

                    }
                    break;

                case 3:
                    System.out.print("Digite o a placa do Carro que deseja acelerar: ");
                    String AcelerarPlaca = Leitor.nextLine();

                    for (int i = 0; i < ListaCarros.size(); i++) {
                        Carro Carro = ListaCarros.get(i);

                        if(Carro.MostrarPlaca() == AcelerarPlaca){
                            System.out.print("Valor da aceleração: ");
                            float ValorAceleracao = Leitor.nextFloat();
                            Carro.Acelerar(ValorAceleracao);
                            System.out.println("Aceleração concluida! Nova velocidade: Km/h" + Carro.VelocidadeAtual());
                        }
                    }
                    break;

                case 4:
                    System.out.print("Digite a placa do Carro que deseja freiar:");
                    String FreiarPlaca = Leitor.nextLine();

                    for(int i = 0; i < ListaCarros.size(); i++){
                        Carro Carro = ListaCarros.get(i);

                        if(Carro.MostrarPlaca() == FreiarPlaca){
                            System.out.print("Valor da Frenagem: ");
                            float ValorFreio = Leitor.nextFloat();
                            Carro.Freiar(ValorFreio);
                            System.out.println("Frenagem concluida! Nova velocidade: Km/h: " + Carro.VelocidadeAtual());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }


        }
    } }