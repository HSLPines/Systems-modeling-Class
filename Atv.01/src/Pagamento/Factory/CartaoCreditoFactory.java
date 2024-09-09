package Pagamento.Factory;

import Pagamento.Produto.Cartao;



public class CartaoCreditoFactory extends PagamentoFactory {
    private String numero;
    private String nome;
    private String validade;
    private String cvv;

    public CartaoCreditoFactory(String numero, String nome, String validade, String cvv) {
        this.numero = numero;
        this.nome = nome;
        this.validade = validade;
        this.cvv = cvv;
    }

    public void processarPagamento() {
        Cartao cartao = new Cartao(numero, nome, validade, cvv);
        cartao.processarPagamento();
    }

    
    
}
