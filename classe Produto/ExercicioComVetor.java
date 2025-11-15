import java.util.Scanner;

class Produto{
    String titulo;
    String descricao;
    double precoUnitario;
    int qtdEstoque;
};

public class ExercicioComVetor {
    public static Scanner input=new Scanner(System.in);
    public static void impressao(Produto x){
        System.out.println("Nome do produto: "+x.titulo);
        System.out.println("Descrição do produto: "+x.descricao);
        System.out.printf("Preço do produto: %.2f\n",x.precoUnitario);
        System.out.println("Quantidade em estoque: "+x.qtdEstoque);
        System.out.println("\n");
    }

    public static void scanneando(Produto x){
        System.out.println("Digite o nome do produto desejado");
        x.titulo=input.nextLine();
        System.out.println("Descreva o produto desejado");
        x.descricao=input.nextLine();
        System.out.println("Digite o preço do produto desejado");
        x.precoUnitario=input.nextDouble();
        System.out.println("Digite a quantidade em estoque do produto desejado");
        x.qtdEstoque=input.nextInt();
        String buff=input.nextLine();
        System.out.println("\n");
    }

   public static void main(String[] args) {

        Produto[] produtos=new Produto[5];

        for (int i=0; i<produtos.length; i++){
            produtos[i]=new Produto();
        }

        System.out.println("---------------Preenchimento do vetor do produtos---------------");
        for (int i=0; i<produtos.length; i++){
            scanneando(produtos[i]);
        }
    

        System.out.println("---------------Impressão do vetor de produtos---------------");
        for (int i=0; i<produtos.length; i++){
            impressao(produtos[i]);
        }
        
   }




}
