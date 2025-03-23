import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);

        ArrayList<ContaBancaria> Contas = new ArrayList<>();

        int Escolha = 0;

        while (Escolha != 6) {
            System.out.println("\nBem-vindo ao sistema bancário!");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar conta");
            System.out.println("2 - Mostrar contas");
            System.out.println("3 - Depositar");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Sacar");
            System.out.println("6 - Sair");

            Escolha = Leitor.nextInt();

            switch (Escolha) {
                case 1:
                    System.out.print("Número da conta: ");
                    int NumeroConta = Leitor.nextInt();
                    Leitor.nextLine();

                    System.out.print("Nome do titular: ");
                    String NomeTitular = Leitor.nextLine();

                    System.out.print("Saldo inicial: ");
                    float Saldo = Leitor.nextFloat();

                    ContaBancaria NovaConta = new ContaBancaria(NumeroConta, NomeTitular, Saldo);
                    Contas.add(NovaConta);

                    System.out.println("Conta registrada com sucesso!");
                    break;

                case 2:
                        System.out.println("\nLista de Contas:");
                    for (int i = 0; i < Contas.size(); i++) {
                        ContaBancaria Conta = Contas.get(i);
                        System.out.println("\nNumero da Conta : " + Conta.NumeroConta);
                        System.out.println("Titular: " + Conta.NomeTitular);
                        System.out.println("Saldo R$:" + Conta.Saldo);
                    }
                    break;

                case 3:
                    System.out.print("Informe o número da conta para depósito: ");
                    int NumeroDeposito = Leitor.nextInt();

                    for (int i = 0; i < Contas.size(); i++) {
                        ContaBancaria Conta = Contas.get(i);

                        if (Conta.NumeroConta == NumeroDeposito) {
                            System.out.print("Valor para depositar: ");
                            float ValorDeposito = Leitor.nextFloat();
                            Conta.Depositar(ValorDeposito);
                            System.out.println("Depósito realizado! Novo saldo: R$" + Conta.ConsultarSaldo());
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Informe o número da conta para consultar saldo: ");
                    int NumeroSaldo = Leitor.nextInt();

                    for (int i = 0; i < Contas.size(); i++) {
                        ContaBancaria Conta = Contas.get(i);
                        if (Conta.NumeroConta == NumeroSaldo) {
                            System.out.println("Saldo da conta " + NumeroSaldo + " é R$" + Conta.ConsultarSaldo());
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.print("Informe o número da conta para saque: ");
                    int NumeroSaque = Leitor.nextInt();

                    for (int i = 0; i < Contas.size(); i++) {
                        ContaBancaria Conta = Contas.get(i);
                        if (Conta.NumeroConta == NumeroSaque) {
                            System.out.print("Valor para sacar: ");
                            float ValorSaque = Leitor.nextFloat();
                            Conta.Sacar(ValorSaque);
                            System.out.println("Saque realizado! Novo saldo: R$" + Conta.ConsultarSaldo());
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

        Leitor.close();
    }
}
