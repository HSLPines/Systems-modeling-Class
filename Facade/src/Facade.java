
/*Classe Facade: crie a classe PedidoFacade, que deve simplificar a interação com o sistema. O 
cliente deve poder realizar pedidos e cancelá-los através dessa classe. */

public class Facade {
    
    private Estoque estoque;
    private Pagamento pagamento;
    private NotaFiscal notaFiscal;

    public Facade() {

        this.estoque = new Estoque();
        this.pagamento = new Pagamento();
        this.notaFiscal = new NotaFiscal();

    }

    public void realizarPedido(Pedido pedido) {

        if (this.estoque.temProduto(pedido.getProduto(), pedido.getQuantidade())) {

            this.estoque.retirarProduto(pedido.getProduto(), pedido.getQuantidade());
            this.pagamento.efetuarPagamento(pedido.getCliente());
            this.notaFiscal.emitirNotaFiscal(pedido.getCliente());
            pedido.setPago(true);
            pedido.setNotaFiscal(this.notaFiscal.getNotaFiscal());

        } else {
            System.out.println("Produto não disponível no estoque.");
        }

    }

    public void cancelarPedido(Pedido pedido) {

        if (pedido.isPago()) {

            this.estoque.devolverProduto(pedido.getProduto(), pedido.getQuantidade());
            this.pagamento.estornarPagamento(pedido.getCliente());
            this.notaFiscal.cancelarNotaFiscal(pedido.getNotaFiscal());
            pedido.setPago(false);
            pedido.setNotaFiscal(null);

        } else {
            System.out.println("Pedido não foi pago.");
        }

    }

}
