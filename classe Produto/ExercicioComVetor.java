import java.util.Scanner;

class Produto{
    String nome;
    String descricao;
    String categoria;
    double precoUnitario;
    int qtdEstoque;
    int qtdMinima;
};

public class ExercicioComVetor {
    public static Scanner input=new Scanner(System.in);
    public static void listarProdutos(Produto []x, int tam){
        for (int i=0; i<tam; i++){
            System.out.printf("---------------Produto %d---------------\n", i+1);
            System.out.println("Nome do produto: "+x[i].nome);
            System.out.println("Descrição do produto: "+x[i].descricao);
            System.out.println("Categoria do produto: "+x[i].categoria);
            System.out.printf("Preço do produto: %.2f\n",x[i].precoUnitario);
            System.out.println("Quantidade em estoque: "+x[i].qtdEstoque);
            System.out.println("Quantidade mínima em estoque: "+x[i].qtdMinima);
            System.out.println("\n");
        }
    }

    public static void scanneando(Produto x){
        System.out.println("Digite o nome do produto desejado");
        x.nome=input.nextLine();
        System.out.println("Descreva o produto desejado");
        x.descricao=input.nextLine();
        System.out.println("Indique a categoria do produto desejado");
        x.categoria=input.nextLine();
        System.out.println("Digite o preço do produto desejado");
        x.precoUnitario=input.nextDouble();
        System.out.println("Digite a quantidade em estoque do produto desejado");
        x.qtdEstoque=input.nextInt();
        System.out.println("Digite a quantidade mínima do produto em estoque");
        x.qtdMinima=input.nextInt();
        String buff=input.nextLine();
    }

    public static int buscaSequencialCategoria (Produto[]v, int tam, String x){
        for (int i=0; i<tam; i++){
            if (x.equals(v[i].categoria)){
                return i;
            }
        }
        return -1;
    }

    public static int buscaSequencialNome (Produto[]v, int tam, String x){
        for (int i=0; i<tam; i++){
            if (x.equals(v[i].nome)){
                return i;
            }
        }
        return -1;
    }

    public static int cadastrarProduto(Produto[] v, int tam){
        if (tam>=v.length){
            System.out.println("Não é mais possível cadastrar produtos.");
            return tam;
        } else{
            v[tam]=new Produto();
            scanneando(v[tam]);
            System.out.println("Produto cadastrado.");
        }
        return tam+1;
    }

    public static void filtrarPorCategoria(Produto[] v, int tam, String categoria){
        Produto[] produtosfiltrado=new Produto[tam];
        int posicao=0;
        for (int i=0; i<tam; i++){
            if (v[i].categoria.equals(categoria)){
                    produtosfiltrado[posicao]=v[i];
                    posicao++;
                }
            }
        
        if (posicao==0){
            System.out.println("Não há nenhum produto com a categoria digitada");
        } else{
            listarProdutos(produtosfiltrado, posicao);
        }
    }

    public static void insertionSortPorCategoria (Produto[] v, int tam){
        int j;
        Produto aux;
        for (int i=1; i<tam; i++){
            aux=v[i];
            j=i-1;
            while(j>=0 && aux.categoria.compareTo(v[j].categoria)<=0){
                v[j+1]=v[j];
                j--;
            }
            v[j+1]=aux;
        }
    }

    public static void retirar(Produto [] v, int tam, String remover){ 
        int indiceAlvo=-1;

        for (int i=0; i<tam; i++){
            if (v[i].nome.equals(remover)){
                indiceAlvo=i;
                break;
            }
        }

        if (indiceAlvo==-1){
            System.out.println("Produto não existente.");
            return;
        }

        if (v[indiceAlvo].qtdEstoque>v[indiceAlvo].qtdMinima){
            v[indiceAlvo].qtdEstoque--;
            System.out.println("Um elemento do estoque removido com sucesso.");
        }
        else{
            System.out.println("A quantidade mínima de produto em estoque foi atingida. Não é possível mais retirar.");
        }
    }

    public static void atualizarPreco(Produto[] v, int tam, String x){
        int index=buscaSequencialNome(v, tam, x);
        if (index!=-1){
            System.out.println("Digite o preço novo do produto");
            v[index].precoUnitario=input.nextDouble();
            System.out.println("Preço do produto atualizado!");
        } else{
            System.out.println("Produto não existente.");
            return;
        }
    }

    public static void listagemSubtotal(Produto[] v, int tam){
        insertionSortPorCategoria(v, tam);
        String categoriadaVez=v[0].categoria;
        System.out.printf("\nCategoria %s", categoriadaVez);

        double subtotal=0;
        double totalGeral=0;


        for (int i=0; i<tam; i++){
            if(!v[i].categoria.equals(categoriadaVez)){
                    System.out.printf("\nSubtotal: R$%.2f\n",subtotal);
                    totalGeral+=subtotal;
                    categoriadaVez=v[i].categoria;
                    subtotal=0;
                    System.out.printf("\nCategoria %s", categoriadaVez);
            }

            System.out.printf("\n%s - %d - %.2f", v[i].nome, v[i].qtdEstoque, v[i].precoUnitario);
            subtotal+=v[i].qtdEstoque*v[i].precoUnitario;
                
        }

        System.out.printf("\nSubtotal: R$%.2f",subtotal);
        totalGeral+=subtotal;
        System.out.printf("\nTotal geral: R$%.2f\n",totalGeral);
    }

   public static void main(String[] args) {

        Produto[] produtos=new Produto[30];
        int tam=0;
        int opcao;
        do {
            System.out.println("\nDigite a operação que seja realizar (ou 0 para finalizar)");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Filtrar por categoria");
            System.out.println("4 - Ordenar");
            System.out.println("5 - Remover elemento");
            System.out.println("6 - Atualizar preço");
            System.out.println("7 - Listar o estoque por categoria");
            opcao=input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1:
                    tam=cadastrarProduto(produtos, tam);
                    break;
                case 2:
                    listarProdutos(produtos, tam);
                    break;
                case 3:
                    System.out.println("Digite a categoria que deseja filtrar: ");
                    String retirar=input.nextLine();
                    filtrarPorCategoria(produtos, tam, retirar);
                    break;
                case 4:
                    insertionSortPorCategoria(produtos, tam);
                    System.out.println("Seu vetor foi ordenado com sucesso.");
                    break;
                case 5:
                    System.out.println("Digite o nome do produto a retirar");
                    String retirar2=input.nextLine();
                    retirar(produtos, tam, retirar2);
                    break;
                case 6:
                    System.out.println("Digite o nome do produto a atualizar");
                    String atualizar=input.nextLine();
                    atualizarPreco(produtos, tam, atualizar);
                    break;
                case 7:
                    listagemSubtotal(produtos, tam);
                    break;
                default:
                    if (opcao!=0){
                        System.out.println("Opção inválida!\n");
                        break;
                    }
            
            }
        } while(opcao!=0);

    }
}



