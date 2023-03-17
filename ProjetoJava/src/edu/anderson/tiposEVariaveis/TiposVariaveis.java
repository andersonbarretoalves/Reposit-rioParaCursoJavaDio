package edu.anderson.tiposEVariaveis;

public class TiposVariaveis {
    public static void main (String[] args) {

        short numeroCurto = 1;
        double numeroNormal = 1320;
        short numeroCurto2 = (short) numeroNormal; //Casting é usado para a conversão de tipos de variáves, no caso do "numeroNormal em short".
        int numero = 5;
        numero = 10;
        System.out.println(numero);
        final double VALOR_DE_PI = 3.14; //finel é usado para numero (Constante), onde não pode ser alterado. Declarado em Caixa Alta.
    }
    
}
