
public class App {
    
    public static void main(String[] args) {
        
        //um prduto apenas
        Produto p1 = new Produto("Chocolate", 100);

        //uma caixa com 3 produtos
        Caixa c1 = new Caixa("Caixa Felicidade");
        c1.addItem(new Produto("Bom-Bom", 5));
        c1.addItem(new Produto("Cigarrinho Pan", 15));
        c1.addItem(new Produto("Barra Lindit", 60));
    
        p1.exibir();
        System.out.println("Valor: R$ " + p1.getValor());

        System.out.println();

        c1.exibir();
        System.out.println("Valor: R$ " + c1.getValor());

    }

}
