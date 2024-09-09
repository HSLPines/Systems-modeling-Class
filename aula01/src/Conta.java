
public class Conta {
        
    // atributos/propriedades/'variáveis de instância(ou de objeto)'
    int conta, saque, deposito;
    double saldo;

    public Conta(int conta) {
        this.conta = conta;
    }

    public void sacar(double saque) {
        saldo -= saque;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

}
