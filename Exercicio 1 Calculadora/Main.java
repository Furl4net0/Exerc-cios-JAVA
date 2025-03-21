import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);

        float a, b;


        System.out.print("Escolha a operação desejada: ");
        System.out.println("------------------------------");
        System.out.println("1 : Soma");
        System.out.println("2 : Subtração");
        System.out.println("3 : Divisão");
        System.out.println("4 : Multiplicação \n");
        int escolha = Leitor.nextInt();


        switch (escolha){
            case 1:

                System.out.println("Digite o primeiro valor a somar: ");
                a = Leitor.nextFloat();
                System.out.println("Digite o segundo valor a somar: ");
                b = Leitor.nextFloat();

                Calculadora.soma(a, b);

                System.out.println("Resultado: " + Calculadora.soma(a, b));


                break;

            case 2:

                System.out.println("Digite o primeiro valor a subtrair: ");
                a = Leitor.nextFloat();
                System.out.println("Digite o segundo valor a subtrair: ");
                b = Leitor.nextFloat();

                Calculadora.subtracao(a, b);

                System.out.println("Resultado: " + Calculadora.subtracao(a, b));

                break;

            case 3:
                System.out.println("Digite o dividêndo: ");
                a = Leitor.nextFloat();
                System.out.println("Digite o divisor: ");
                b = Leitor.nextFloat();

                Calculadora.divisao(a, b);

                System.out.println("Resultado: " + Calculadora.divisao(a, b));

                break;

            case 4:
                System.out.println("Digite o primeiro valor a multiplicar: ");
                a = Leitor.nextFloat();
                System.out.println("Digite o segundo valor a multiplicação: ");
                b = Leitor.nextFloat();

                Calculadora.multiplicacao(a, b);

                System.out.println("Resultado: " + Calculadora.multiplicacao(a, b));



                break;

        }


    }
}