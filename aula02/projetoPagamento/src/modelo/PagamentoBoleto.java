
package modelo;

public class PagamentoBoleto extends Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagamento via boleto");
    }

}