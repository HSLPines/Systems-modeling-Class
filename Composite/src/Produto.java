
public class Produto implements Item {

    private String nome;
    private double valor;

    public Produto(String nome, double valor) {

        this.nome = nome;
        this.valor = valor;
    
    }

    @Override
    public void exibir() {
        System.out.println("Produto: " + nome + " - R$ " + valor);
    }

    @Override
    public double getValor() {
        return this.valor;
    }
    
}
