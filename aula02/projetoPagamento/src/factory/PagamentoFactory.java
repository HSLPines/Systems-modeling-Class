
package factory;

import modelo.Pagamento;

public abstract class PagamentoFactory {

    public abstract Pagamento gerarPagamento(int tipo){
        Pagamento pagamento = null;

        pagamento = criarPagamento();

        pagamento.processarPagamento();
        pagamento.negarPagamento();
        pagamento.pagar();

        return pagamento;
    }

    public abstract Pagamento criarPagamento();

}
