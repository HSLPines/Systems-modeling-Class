package Pagamento;

import java.util.Scanner;

import Pagamento.Factory.BoletoBancarioFactory;
import Pagamento.Factory.CartaoCreditoFactory;
import Pagamento.Factory.PagamentoFactory;
import Pagamento.Factory.PaypalFactory;



public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo de pagamento: ");
        System.out.println("1 - Boleto");
        System.out.println("2 - Cartão de crédito");
        System.out.println("3 - Paypal");

        int opcao = scanner.nextInt();
        PagamentoFactory pagamentoFactory;
        switch (opcao) {
            case 1:
                pagamentoFactory = new BoletoBancarioFactory();
                break;
            case 2:
                pagamentoFactory = new CartaoCreditoFactory(null, null, null, null);
                break;
            case 3:
                pagamentoFactory = new PaypalFactory();
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
        
        pagamentoFactory.processarPagamento();

        scanner.close();

    }
    
}