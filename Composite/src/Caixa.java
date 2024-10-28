
import java.util.ArrayList;
import java.util.List;

public class Caixa implements Item {

    private String nome;
    private List<Item> lista;

    public Caixa(String nome) {

        this.nome = nome;
        lista = new ArrayList<Item>();
    
    }

    public void addItem(Item item) {
        lista.add(item);
    }

    public void removeItem(Item item) {
        lista.remove(item);
    }

    @Override
    public void exibir() {

        System.out.println("Caixa: " + nome);
        for (Item item : lista) {
            item.exibir();
        }

        /*lista.forEach(item -> {
            item.exibir();
        });*/

    }

    @Override
    public double getValor() {
        return lista.stream().mapToDouble(Item::getValor).sum();
    }

}
