
public class AlunoG extends Aluno{

    double prova1; // atributos específicos da classe AlunoG
    double prova2;
    //media aritmética

    public AlunoG(int ra, String nome, double prova1, double prova2){
        super(ra, nome); // chamada para o construtor da Superclasse
        this.prova1 = prova1;
        this.prova2 = prova2;
    }

    public double calcularMedia(){
        return (prova1 + prova2) / 2;
    }

    @Override
    public String toString() {
        return "Aluno Graduação [" + super.toString() + " Prova 1 = " + prova1 + ", Prova 2 = " + prova2 + "]";
    }


}
