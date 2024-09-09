import modelo.Transporte;
import modelo.TransporteAereo;
import modelo.TransporteMaritimo;
import modelo.TransporteTerrestre;

public class Cliente {

    // método para gerar e retornar um transporte
    public Transporte gerarTransporte(int tipo) {
        Transporte transporte = null;

        if(tipo == 1) {
            transporte = new TransporteTerrestre();
        }
        else if(tipo == 2) {
            transporte = new TransporteAereo();
        }
        else if(tipo == 3) {
            transporte = new TransporteMaritimo();
        }

        transporte.gerarNotaFiscal();
        transporte.gerarRota();
        transporte.entregar();

        return transporte;
    }

    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();

        System.out.println("### Gerando um transporte terrestre ###");
        Transporte transporte = cliente.gerarTransporte(1);
        System.out.println(transporte); 

        System.out.println();
        System.out.println("### Gerando um transporte aéreo ###");
        Transporte transporte2 = cliente.gerarTransporte(2);
        System.out.println(transporte2); 
        
        System.out.println();
        System.out.println("### Gerando um transporte marítimo ###");
        Transporte transporte3 = cliente.gerarTransporte(3);
        System.out.println(transporte3); 
    }
}
