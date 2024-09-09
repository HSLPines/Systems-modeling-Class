package Pagamento.Produto;

public class Cartao {
    private String numero;
    private String nome;
    private String validade;
    private String cvv;

    public Cartao(String numero, String nome, String validade, String cvv) {
        this.numero = numero;
        this.nome = nome;
        this.validade = validade;
        this.cvv = cvv;
    }

    public String getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getValidade() {
        return validade;
    }

    public String getCvv() {
        return cvv;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void processarPagamento() {
        System.out.println("Pagando com cartão de credito...");
    }


}
