
public class Cliente {
    String nome;
    Conta conta;

    public Cliente(String nome) {
        this.nome = nome;
        conta = new Conta((int) (Math.random() * 9999)); //cast/conversão de tipo de int para double

    }

}

