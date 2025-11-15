import java.util.Scanner;

class Pessoa{
    String nome;
    int idade;
    double peso, altura;
}


public class segundaProva{
    public static Scanner input = new Scanner (System.in);
    public static int buscaSequencial (Pessoa[]v, int qtd, String x){
        for (int i=0; i<qtd; i++){
            if (x.equals(v[i].nome)){
                return i;
            }
        }
        return -1;
    }




    public static int cadastrarPessoa(Pessoa[] v, int qtd){
        if (qtd>=v.length){
            return qtd;
        } else{
            v[qtd]=new Pessoa();
            System.out.println("Digite o nome da pessoa a cadastrar");
            String nomeTeste=input.nextLine();
            while(buscaSequencial(v, qtd, nomeTeste)!=-1){
                System.out.println("Nome já cadastrado. Digite novamente.");
                nomeTeste=input.nextLine();
            } v[qtd].nome=nomeTeste;
            System.out.println("Digite a idade da pessoa a cadastrar");
            v[qtd].idade=input.nextInt();
            System.out.println("Digite a peso da pessoa a cadastrar");
            v[qtd].peso=input.nextDouble();
            System.out.println("Digite a altura da pessoa a cadastrar");
            v[qtd].altura=input.nextDouble();

            String buffer=input.nextLine();
        }
        return qtd+1;
    }

    public static void main (String []args){
        Pessoa [] lista=new Pessoa[5];
        
        
        


    }


}
