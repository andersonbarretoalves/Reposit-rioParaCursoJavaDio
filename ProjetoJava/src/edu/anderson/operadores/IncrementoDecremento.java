package edu.anderson.operadores;

public class IncrementoDecremento {

    public static void main (String[] args) {
        int numero = 5;
        numero = numero + 1;
        System.out.println(numero);
        numero = 7;
        numero++;
        System.out.println(numero);
        System.out.println(++ numero);
        System.out.println(-- numero);
        //Alguns exempros de inclementos e declementos.

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);
        System.out.println(!variavel);
        //Forma de inverter variáveis do tipo boolean.
    }
    
}
