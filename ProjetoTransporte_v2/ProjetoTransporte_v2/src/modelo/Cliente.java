package modelo;

import factory.TransporteAereoFactory;
import factory.TransporteMaritimoFactory;
import factory.TransporteTerrestreFactory;

public class Cliente {
    public static void main(String[] args) {
        
        TransporteTerrestreFactory terreste = new TransporteTerrestreFactory();
        TransporteAereoFactory aereo = new TransporteAereoFactory();
        TransporteMaritimoFactory maritimo = new TransporteMaritimoFactory();

        System.out.println("### Gerando um transporte terrestre ###");
        Transporte tt = terreste.gerarTransporte(1);
        System.out.println(tt); 

        System.out.println();
        System.out.println("### Gerando um transporte aéreo ###");
        Transporte ta = aereo.gerarTransporte(2);
        System.out.println(ta); 
        
        System.out.println();
        System.out.println("### Gerando um transporte marítimo ###");
        Transporte tm = maritimo.gerarTransporte(3);
        System.out.println(tm); 

    }
}
