import java.util.Scanner;

public class ex03 {
    public static Scanner input = new Scanner (System.in);


    public static void preencher (int vet[]){
        for (int i=0; i<vet.length; i++){
            vet[i]=input.nextInt();
        }
    }

public static void somar (int v1[], int v2[], int soma[]){
        for (int i=0; i<v1.length; i++){
            soma[i]=v1[i]+v2[i];
        }
    }

public static void mostrando (int array[]){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
    }

    
    public static void main(String[] args) {
        System.out.println("Preencha um vetor com números inteiros");
        int [] v = new int [5];

        preencher(v);

        System.out.println("Agora preencha um segundo vetor com números inteiros");
        int [] v2 = new int [5];

        preencher(v2);

        int [] vsoma = new int [5];
        
        somar(v, v2, vsoma);


        System.out.println("Seu primeiro vetor: ");
        mostrando(v);

        System.out.println("\nSeu segundo vetor: ");
        mostrando(v2);

        System.out.println("\nA soma deles resulta em: ");
        mostrando(vsoma);




    }



}
