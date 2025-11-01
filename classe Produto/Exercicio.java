import java.util.Scanner;

class Produto{
    String titulo;
    String descricao;
    double precoUnitario;
    int qtdEstoque;
};

public class Exercicio {
    public static Scanner input=new Scanner(System.in);
    public static void impressao(Produto x){
        System.out.println("Nome do produto: "+x.titulo);
        System.out.println("Descrição do produto: "+x.descricao);
        System.out.printf("Preço do produto: %.2f\n",x.precoUnitario);
        System.out.println("Quantidade em estoque: "+x.qtdEstoque);
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
    }

   public static void main(String[] args) {
        Produto produto1=new Produto();
        Produto produto2=new Produto();

        System.out.println("---------------Digitação dos dados do produto 1---------------");
        scanneando(produto1);

        System.out.println("---------------Digitação dos dados do produto 2---------------");
        scanneando(produto2);

        System.out.println("---------------Impressão dos dados dos produtos---------------");
        impressao(produto1);
        System.out.println("\n\n");
        impressao(produto2);
   }




}
