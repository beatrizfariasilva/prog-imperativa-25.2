import java.util.Scanner;
import java.util.Random;

public class exercicioMatrizes {
    public static Scanner input=new Scanner (System.in);
    public static Random gerador = new Random();

    public static void impressao(int[][] matriz){
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        //EXERCÍCIO 1
        /*int [][] matriz = new int[4][4];
        int contador=0;
    
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                matriz[i][j]=gerador.nextInt(100);
                if (matriz[i][j]>10){
                    contador++;
                }
            }
        }

        System.out.println("A quantidade de elementos maiores que 10 na matriz é: "+contador);*/

        //EXERCÍCIO 2
        int [][] matriz = new int[5][5];
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                if (i==j){
                    matriz[i][j]=1;
                }
                else{
                    matriz[i][j]=0;
                }
            }
        }

        impressao(matriz);


    }
}
