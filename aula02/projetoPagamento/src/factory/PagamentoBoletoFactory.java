
package factory;

import modelo.Pagamento;
import modelo.PagamentoBoleto;

public class PagamentoBoletoFactory extends PagamentoFactory {

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoBoleto();
    }

}
