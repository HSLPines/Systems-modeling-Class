
public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente = new Cliente("Selmini");

        System.out.println("Nome do cliente: " + cliente.nome);
        System.out.println("Número da conta: " + cliente.conta.conta);
        cliente.conta.depositar(2000000000);
        System.out.println("Saldo da conta: " + cliente.conta.saldo);


    }
}
