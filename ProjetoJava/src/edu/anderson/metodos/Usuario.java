package edu.anderson.metodos;

public class Usuario {
    public static void main (String[] args) throws Exception {
        SmartTv smarTv = new SmartTv();
        System.out.println("TV ligada " + smarTv.ligada);
        System.out.println("Canal " + smarTv.canal);
        System.out.println("Volume " + smarTv.volume);
    }
    
}
