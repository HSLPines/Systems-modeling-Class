package factory;

import modelo.Transporte;
import modelo.TransporteMaritimo;

public class TransporteMaritimoFactory extends TransporteFactory {
    
    @Override
    public Transporte criarTransporte() {
        return new TransporteMaritimo();
    }

}
