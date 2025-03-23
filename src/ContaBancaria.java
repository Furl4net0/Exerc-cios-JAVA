public class ContaBancaria {
    int NumeroConta;
    String NomeTitular;
    float Saldo;


    public ContaBancaria(int NumeroConta, String NomeTitular, float Saldo) {
        this.NumeroConta = NumeroConta;
        this.NomeTitular = NomeTitular;
        this.Saldo = Saldo;
    }


    public float ConsultarSaldo() {
        return this.Saldo;
    }


    public void Depositar(float Valor) {
        if (Valor > 0) {
            this.Saldo += Valor;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }


    public void Sacar(float Valor) {
        if (Valor > 0 && Valor <= this.Saldo) {
            this.Saldo -= Valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }
}
