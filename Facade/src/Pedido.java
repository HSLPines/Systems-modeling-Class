
public class Pedido {

    private String produto;
    private int quantidade;
    private String cliente;
    private boolean pago;
    private String notaFiscal;

    public Pedido(String produto, int quantidade, String cliente) {

        this.produto = produto;
        this.quantidade = quantidade;
        this.cliente = cliente;

    }

}
