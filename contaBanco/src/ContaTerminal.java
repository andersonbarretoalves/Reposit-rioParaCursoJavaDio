import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        System.out.println("Bem vindo ao Banco Dio!");

        try (Scanner sc = new Scanner(System.in)) {          

            System.out.println("Por favor digite o numero da Agência: ");
            String agencia = sc.next();

            System.out.println("Por favor digite o numero da Conta: ");
            int conta = sc.nextInt();

            System.out.println("Por favor digite o seu nome Completo: ");
            String nomeCliente = sc.nextLine();

            System.out.println("Favor digitar o valor depositado: ");
            double saldo = sc.nextDouble();

            System.out.println("Bem vindo " + nomeCliente + "Sua conta foi criada com sucesso no Banco Dio!");
            System.out.println("Agência: " + agencia);
            System.out.println("Conta: " + conta);
            System.out.println("Seu saldo é de: " + saldo);
        }  
               
    }
}