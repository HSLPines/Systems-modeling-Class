
public class AlunoPG extends Aluno{

    double prova; // atributos específicos da classe AlunoPG
    double trabalho;
    //media ponderada 60% prova + 40% trabalho

    public AlunoPG(int ra, String nome, double prova, double trabalho){
        super(ra, nome); // chamada para o construtor da Superclasse
        this.prova = prova;
        this.trabalho = trabalho;
    }
    
    public double calcularMedia(){
        return (prova * 0.6) + (trabalho * 0.4);
    }

    @Override
    public String toString() {
        return "Aluno Pós Graduação [" + super.toString() + " Prova = " + prova + ", Trabalho = " + trabalho + "]";
    } 

}
