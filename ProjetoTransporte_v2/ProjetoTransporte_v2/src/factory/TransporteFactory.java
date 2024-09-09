package factory;

import modelo.Transporte;

public abstract class TransporteFactory {
    
    
    // método para gerar e retornar um transporte
    public Transporte gerarTransporte(int tipo) {
        Transporte transporte = null;

        transporte = criarTransporte();

        transporte.gerarNotaFiscal();
        transporte.gerarRota();
        transporte.entregar();

        return transporte;
    }

    // método para criar a instância da classe
    public abstract Transporte criarTransporte();

}
