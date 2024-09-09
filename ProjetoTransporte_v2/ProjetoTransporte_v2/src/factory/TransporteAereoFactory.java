package factory;

import modelo.Transporte;
import modelo.TransporteAereo;

public class TransporteAereoFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new TransporteAereo();
    }
}
