import java.util.Scanner;

public class exerciciodesala {
    public static Scanner input = new Scanner (System.in);

    public static int buscaSequencial(int v[], int tam, int valor){
        for (int i=0; i<tam; i++){
            if (v[i]==valor){
                return i;
            }
        }
        return -1;
    }
    

    public static int inserirElementos(int [] v, int tam){
        System.out.println("Digite o elemento que você quer inserir: ");
        int elementoAinserir = input.nextInt();

        int resposta = buscaSequencial(v, tam, elementoAinserir);
        
        if (resposta!=-1){
            System.out.println("Esse elemento já está no conjunto");
            return tam;
        }

        if (tam>=v.length){
            System.out.println("O conjunto já atingiu seu o limite de elementos");
        }

    
        v[tam]=elementoAinserir;
        return tam+1;

    }

    public static void impressao (int v[], int tam){
        System.out.print("{");
        for (int i=0; i<tam; i++){
            System.out.print(v[i]);
            if (i<tam-1){
                System.out.print(", ");
            }
        }
        System.out.print("}\n");
        
    }

    public static int uniao (int a[], int b[], int tamA, int tamB, int[]uniao){
        int tamVuniao=0;

        for (int i=0; i<tamA; i++){
            uniao[tamVuniao]=a[i];
            tamVuniao++;
        }

        for (int i=0; i<tamB; i++){
            int resposta = buscaSequencial(uniao, tamVuniao, b[i]);
            if (resposta==-1){
                uniao[tamVuniao]=b[i];
                tamVuniao++;
            }
        }

        return tamVuniao;
    }

    public static int intersecao (int a[], int b[], int tamA, int tamB, int[]inter){
        int tamVinter=0;

        for (int i=0; i<tamA; i++){
            int resposta = buscaSequencial(b, tamB, a[i]);
            if (resposta != -1){
                if (buscaSequencial(inter, tamVinter, a[i])==-1){
                    inter[tamVinter]=a[i];
                    tamVinter++;
                }
            }
        }

        return tamVinter;
        
    }

    public static int diferenca (int a[], int b[], int tamA, int tamB, int[] dif){
        int tamVdif=0;

        for (int i=0; i<tamA; i++){
            if (buscaSequencial(b, tamB, a[i])==-1){
                if (buscaSequencial(dif, tamVdif, a[i]) == -1) {
                dif[tamVdif]=a[i];
                tamVdif++;
            }
        }
    }
        return tamVdif;
}
    

    



    
    public static void main (String[] args){

        int [] conjuntoA = new int [30];
        int [] conjuntoB = new int [30];

        int tamA = 0;
        int tamB = 0;

        int escolha;
        do{
            System.out.println("\nEscolha que operação você deseja realizar:\n0) SAIR\n1) Inserir 1 elemento no Conjunto A\n2) Inserir 1 elemento no Conjunto B\n3) Imprimir os Conjuntos A e B\n4) Gerar e Imprimir a união de A e B\n5) Gerar e Imprimir a interseção entre A e B\n6) Gerar e Imprimir a diferença entre A e B\n7) Gerar e Imprimir a diferença entre B e A\n");
            escolha = input.nextInt();

            switch (escolha){
                case 1:
                    tamA=inserirElementos(conjuntoA, tamA);
                    break;
                
                case 2:
                    tamB=inserirElementos(conjuntoB, tamB);
                    break;
                
                case 3:
                    System.out.println("Conjunto A");
                    impressao(conjuntoA, tamA);
                    System.out.println("Conjunto B");
                    impressao(conjuntoB, tamB);
                    break;

                case 4:
                    int [] uniao=new int[60];
                    int tamU=uniao(conjuntoA, conjuntoB, tamA, tamB, uniao);
                    System.out.println("Conjunto união: ");
                    impressao(uniao, tamU);
                    break;

                case 5:
                    int [] inter=new int[60];
                    int tamI=intersecao(conjuntoA, conjuntoB, tamA, tamB, inter);
                    System.out.println("Conjunto interseção: ");
                    impressao(inter, tamI);
                    break;

                case 6:
                    int[] dAB = new int[30];
                    int tamAB = diferenca(conjuntoA, conjuntoB, tamA, tamB, dAB);
                    System.out.println("Conjunto A-B: ");
                    impressao(dAB, tamAB);
                    break;

                case 7:
                    int[] dBA = new int[30];
                    int tamBA = diferenca(conjuntoB, conjuntoA, tamB, tamA, dBA);
                    System.out.println("Conjunto B-A: ");
                    impressao(dBA, tamBA);
                    break;

            }
        } while (escolha!=0);
    }
}


