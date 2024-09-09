
public abstract class Aluno{
    int ra;
    String nome;

    public Aluno(int ra, String nome){
        this.ra = ra;
        this.nome = nome;
    }

    public abstract double calcularMedia();

    @Override
    public String toString() {
        return "Aluno [R.A. = " + ra + ", Nome = " + nome + "]";
    }

    
}
