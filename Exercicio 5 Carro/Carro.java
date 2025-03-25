public class Carro {

    private String Modelo;
    private String Marca;
    private int Ano;
    private float VelocidadeAtual;
    private String Placa;


    public Carro(String Modelo, String Marca, int Ano, String Placa, float VelocidadeAtual){
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Ano = Ano;
        this.Placa = Placa;
        this.VelocidadeAtual = VelocidadeAtual;
    }

    public String MostrarPlaca(){
        return this.Placa;
    }

    public void CarrosInformacoes() {
        System.out.println("Modelo: " + Modelo);
        System.out.println("Marca: " + Marca);
        System.out.println("Ano: " + Ano);
        System.out.println("Placa: " + Placa);
        System.out.println("Velocidade Atual: " + VelocidadeAtual + " km/h\n");
    }

    public float VelocidadeAtual(){
        return this.VelocidadeAtual;
    }

    public void Acelerar(float Aceleracao) {
        if (Aceleracao > 0) {
            this.VelocidadeAtual += Aceleracao;
        } else {
            System.out.println("Velocidade inválida.");
        }
    }

    public void Freiar (float Freio) {
        if (Freio >= 0 && Freio <= this.VelocidadeAtual) {
            this.VelocidadeAtual -= Freio;
        } else {
            System.out.println("Freio inválido.");
        }
    }

}