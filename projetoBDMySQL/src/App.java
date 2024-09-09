
public class App {
    public static void main(String[] args) throws Exception {
       
        VendaDAO dao = new VendaDAO();
        Venda venda = new Venda("Fernando", 1000);
        dao.inserir(venda);
        venda = new Venda("Selmini", 150);
        dao.inserir(venda);
        venda = new Venda("Flávio", 1);
        dao.inserir(venda);

    }

}
