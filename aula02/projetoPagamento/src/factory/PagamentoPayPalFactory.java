
package factory;

import modelo.Pagamento;
import modelo.PagamentoPayPal;

public class PagamentoPayPalFactory extends PagamentoFactory {

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPayPal();
    }

}
