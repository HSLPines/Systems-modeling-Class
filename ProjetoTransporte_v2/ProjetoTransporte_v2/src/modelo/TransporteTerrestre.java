package modelo;

public class TransporteTerrestre extends Transporte {

    @Override
    public void entregar() {
        System.out.println("Entrega feita por transporte terrestre");
    }
    
}
