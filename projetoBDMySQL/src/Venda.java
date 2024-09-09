
public class Venda {

    private int id;
    private String vendedor;
    private double total;

    public Venda(int id, String vendedor, double total) {
        this.id = id;
        this.vendedor = vendedor;
        this.total = total;
    }

    public Venda(String vendedor, double total) {
        this.vendedor = vendedor;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public String getVendedor() {
        return vendedor;
    }

    public double getTotal() {
        return total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Venda [id=" + id + ", total=" + total + ", vendedor=" + vendedor + "]";
    }

}
