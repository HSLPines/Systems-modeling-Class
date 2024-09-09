package Pagamento.Factory;
import Pagamento.Produto.Paypal;


public class PaypalFactory extends PagamentoFactory {
    @Override
    public void processarPagamento() {
        Paypal paypal = new Paypal();
        paypal.processarPagamento();
    }
}
