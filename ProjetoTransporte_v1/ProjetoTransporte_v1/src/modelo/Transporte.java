package modelo;

public abstract class Transporte {
    public abstract void entregar();

    public void gerarRota() {
        System.out.println("Rota gerada");
    }

    public void gerarNotaFiscal() {
        System.out.println("Nota fiscal gerada");
    }
}
