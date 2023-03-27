import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao Banco Dio!");

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);          

            System.out.println("Por favor digite o numero da Agência: ");
            String agencia = sc.next();

            System.out.println("Por favor digite o numero da Conta: ");
            int conta = sc.nextInt();

            System.out.println("Por favor digite o seu Primeiro Nome: ");
            String nome = sc.next();

            System.out.println("Por favor digite o seu sobrenome: ");
            String sobreNome = sc.next();

            System.out.println("Favor digitar o valor depositado: ");
            double saldo = sc.nextDouble();

            System.out.println("Bem vindo " + nome + " " + sobreNome + ", Sua conta foi criada com sucesso no Banco Dio!");
            System.out.println("Agência: " + agencia);
            System.out.println("Conta: " + conta);
            System.out.println("Seu saldo é de: " + saldo);

            sc.close();    
        
               
    }
}