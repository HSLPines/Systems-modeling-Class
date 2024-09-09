
package modelo;

public abstract class Pagamento{
    public abstract void pagar();
    
    public abstract void processarPagamento(){
        System.out.println("Pagamento processado");
    }
    public abstract void negarPagamento(){
        System.out.println("Pagamento negado");
    }

}
