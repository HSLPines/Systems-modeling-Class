package factory;

import modelo.Transporte;
import modelo.TransporteTerrestre;

public class TransporteTerrestreFactory extends TransporteFactory {

    @Override
    public Transporte criarTransporte() {
        return new TransporteTerrestre();
    }
    
}
