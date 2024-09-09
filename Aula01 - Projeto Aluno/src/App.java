import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        AlunoG ag = new AlunoG(1, "Selmini", 2, 3.5);
        AlunoPG apg = new AlunoPG(2, "Flávio", 10, 10);

        Aluno a1 = new AlunoG(3, "Sandmann", 1, 5);
        Aluno a2 = new AlunoPG(100, "Fernando", 6.5, 2);

        Scanner sc = new Scanner(System.in);

        Aluno[] aluno = new Aluno[4];
        aluno[0] = ag;
        aluno[1] = apg;
        aluno[2] = a1;
        aluno[3] = a2;

        for (int i = 0; i < aluno.length; i++) {
            System.out.println();
            System.out.println(aluno[i]);
            System.out.println("Média: " + aluno[i].calcularMedia());
            System.out.println();
        }

        sc.close();

    }

}
