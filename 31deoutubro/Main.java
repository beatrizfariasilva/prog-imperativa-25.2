import java.util.Scanner;

public class Main {
    public static void impressao(Aluno x){
        System.out.println("Nome: " + x.nome);
        System.out.println("Idade: " + x.idade);
        System.out.printf("Nota 1: %.1f", x.nota1);
        System.out.printf("\nNota 2: %.1f\n", x.nota2);
    }

    public static double calcularMediaPonderada(Aluno x, double peso1, double peso2){
        return (x.nota1*peso1 + x.nota2*peso2)/(peso1+peso2);
    }

    public static void preechimento(Aluno x){
        System.out.println("Digite o nome do aluno a ser cadastrado: ");
        x.nome=input.nextLine();
        System.out.println("Digite a idade do aluno a ser cadastrado: ");
        x.idade=input.nextInt();
        System.out.println("Digite a primeira nota do aluno: ");
        x.nota1=input.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        x.nota2=input.nextDouble();
    }

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            Aluno aluno1=new Aluno();
            aluno1.nome="João";
            aluno1.idade=20;
            aluno1.nota1=8.5;
            aluno1.nota2=9.0;

            impressao(aluno1);
            double MediaPonderada1=calcularMediaPonderada(aluno1, 6, 4);
            System.out.println("A média ponderada do aluno é: "+MediaPonderada1);

            Aluno aluno2=new Aluno();
            preechimento(aluno2);
            impressao(aluno2);
            double MediaPonderada2=calcularMediaPonderada(aluno2, 6, 4);
            System.out.println("A média ponderada do aluno é: "+MediaPonderada2);

        }

}






