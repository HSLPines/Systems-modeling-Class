package Pagamento.Factory;

import Pagamento.Produto.Boleto;

public class BoletoBancarioFactory extends PagamentoFactory {
    @Override
    public void processarPagamento() {
        Boleto boleto = new Boleto();
        boleto.processarPagamento();
    }
}
