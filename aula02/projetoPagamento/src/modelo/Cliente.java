
package modelo;

import factory.PagamentoFactory;
import factory.PagamentoBoletoFactory;
import factory.PagamentoCartaoFactory;

public class Cliente {

    public static void main(String[] args) {
       
        PagamentoBoletoFactory boleto = new PagamentoBoletoFactory();
        PagamentoCartaoFactory cartao = new PagamentoCartaoFactory();
        PagamentoPayPalFactory paypal = new PagamentoPayPalFactory();


    }

}