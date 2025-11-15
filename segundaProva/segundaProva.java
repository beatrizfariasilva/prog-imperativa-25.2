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

    public static double calcularIMC(Pessoa p){
        double IMC = p.peso/(p.altura*p.altura);
        return IMC;
    }

    public static void imprimirPessoas(Pessoa[] v, int qtd){
        for (int i=0; i<qtd; i++){
            System.out.printf("\nDADOS DA PESSOA %d\n", i+1);
            System.out.printf("NOME: %s\n", v[i].nome);
            System.out.printf("IDADE: %d\n", v[i].idade);
            System.out.printf("PESO: %f\n", v[i].peso);
            System.out.printf("ALTURA: %f\n", v[i].altura);
            System.out.printf("IMC: %f", calcularIMC(v[i]));
            System.out.println();
        }
    }

    public static int maisVelhaMagreza(Pessoa[] v, int qtd){
        int indiceAlvo=-1;
        int idadeAlvo=0;

        for (int i=0; i<qtd; i++){
            if (calcularIMC(v[i])<18.5 && v[i].idade>idadeAlvo){
                indiceAlvo=i;
                idadeAlvo=v[i].idade;
            }
        }
        return indiceAlvo;
    }

    public static void insertionSortPorNome (Pessoa[] v, int qtd){
        int j;
        Pessoa aux;
        for (int i=1; i<qtd; i++){
            aux=v[i];
            j=i-1;
            while(j>=0 && aux.nome.compareTo(v[j].nome)<0){
                v[j+1]=v[j];
                j--;
            }
            v[j+1]=aux;
        }
    }


    public static void imprimirUmaPessoa(Pessoa p){
        System.out.print("\nDADOS DA PESSOA\n");
        System.out.printf("NOME: %s\n", p.nome);
        System.out.printf("IDADE: %d\n", p.idade);
        System.out.printf("PESO: %f\n", p.peso);
        System.out.printf("ALTURA: %f\n", p.altura);
        System.out.printf("IMC: %f", calcularIMC(p));
    }

    //a função que criei retira o mais novo da lista e retorna os dados da pessoa que ficou no seu lugar do vetor depois de ser retirada
    public static Pessoa retirarMaisNovo(Pessoa [] v, int qtd){
        int idadeAlvo=99999; 
        int indiceAlvo=0;

        for (int i=0; i<qtd; i++){
            if (v[i].idade<idadeAlvo){
                idadeAlvo=v[i].idade;
                indiceAlvo=i;
            }
        }

        for (int j=indiceAlvo+1; j<v.length; j++){
            v[j-1]=v[j];
        } qtd--;
        return v[indiceAlvo];
    }




    public static void main (String []args){
        Pessoa [] lista=new Pessoa[3];
        int qtd=0;
        System.out.println("Quantas pessoas você deseja cadastrar? (Não serão aceitos mais de 3 cadastros)");
        int desejaCadastrar = input.nextInt();
        String buffer2=input.nextLine();
    
        for (int i=0; i<desejaCadastrar; i++){
            qtd=cadastrarPessoa(lista, qtd);
        }

        imprimirPessoas(lista, qtd);

        System.out.printf("Em que posição está o/a senhor(a) com magreza?\n%d", maisVelhaMagreza(lista, qtd));

        insertionSortPorNome(lista, qtd);
        imprimirPessoas(lista, qtd);

        imprimirUmaPessoa(retirarMaisNovo(lista, qtd));

    }


}