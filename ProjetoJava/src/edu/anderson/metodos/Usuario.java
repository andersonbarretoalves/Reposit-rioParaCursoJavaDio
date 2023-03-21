package edu.anderson.metodos;

public class Usuario {
    public static void main (String[] args) throws Exception {
        SmartTv smarTv = new SmartTv();

        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.aumentarVolume();

        System.out.println("Volume atual: " + smarTv.volume);

        System.out.println("Canal: " + smarTv.canal);

        smarTv.mudarCanal(13);
        smarTv.diminuirCanal();
        smarTv.aumentarCanal(); 
                         
        //System.out.println("TV ligada: " + smarTv.ligada);       
                
        smarTv.ligar();
        System.out.println("Agora a TV está: " + smarTv.ligada + " Ligada!");

        smarTv.desligar();
        System.out.println("Agora a TV está: " + smarTv.ligada + " Desligada!");

        

    }
    
}
