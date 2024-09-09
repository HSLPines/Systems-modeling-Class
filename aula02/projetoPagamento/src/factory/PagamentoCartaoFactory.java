
package factory;

import modelo.Pagamento;
import modelo.PagamentoCartao;

public class PagamentoCartaoFactory extends PagamentoFactory {

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoCartao();
    }

}
