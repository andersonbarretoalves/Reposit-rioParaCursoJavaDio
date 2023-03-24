import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

        int A, B, PROD;

        System.out.println("Digite o Valor de A: ");
        A = sc.nextInt();
        System.out.println("Digite o Valor de B: ");
        B = sc.nextInt();


        PROD = A * B;

        System.out.println("PROD = " + PROD);

        }
        
    }
    
}