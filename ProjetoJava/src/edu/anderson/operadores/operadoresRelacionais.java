package edu.anderson.operadores;

public class operadoresRelacionais {

    public static void main (String[] args) {

        String nomeUm = "Anderson";
        String nomeDois = new String("Anderson");
        System.out.println(nomeUm.equals(nomeDois));
        //Para objetos devemos usar o equals.

        int numero1 = 1;
        int numero2 = 2;

        
        if (numero1 < numero2) {
            System.out.println("A nossa Condção pe verdadeira");
        }

        boolean simNao = numero1 == numero2;
        System.out.println("Numero 1 é igual ao Numero 2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero 1 é diferente do Numero 2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero 1 é Maior que Numero 2? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("Numero 1 é Menor que Numero 2? " + simNao);

        simNao = numero1 >= numero2;

        System.out.println("Numero 1 é Maior que Numero 2? " + simNao);

    }
    
}
