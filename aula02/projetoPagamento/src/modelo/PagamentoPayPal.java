
package modelo;

public class PagamentoPayPal extends Pagamento {
    
    @Override
    public void pagar() {
        System.out.println("Pagamento PayPal efetuado");
    }
}
