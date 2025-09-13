//EXERCÍCIO 1
/* 
public class arraysEmatrizes {
    public static void mostrar (int [] v){
        System.out.println("Os valores presentes em cada posição do vetor são: ");
        for (int i=0; i<v.length; i++){
            System.out.println(v[i]);

        }

    }


    public static void main (String[] args) {
        //letra a
        int [] A = new int [6];
        A[0]=1;
        A[1]=0;
        A[2]=5;
        A[3]=-2;
        A[4]=-5;
        A[5]=7;

        //letra b
        int somaentrefatores = A[0]+A[1]+A[5];
        System.out.println("A soma dos números na posição 0, 1 e 5 é: "+ somaentrefatores);

        //letra c
        A[4]=100;

        //letra d
        mostrar(A);

    }
}
*/

//EXERCÍCIO 2
/* 
import java.util.Scanner;
public class arraysEmatrizes {
    public static Scanner input = new Scanner (System.in);

    public static void escaneandoVetor (int [] v) {
        for (int i=0; i<6; i++){
        int valor = input.nextInt();
        v[i]=valor;
        }

    }

    public static void mostrar (int [] v){
        System.out.println("Os valores presentes em cada posição do vetor são: ");
        for (int i=0; i<v.length; i++){
            System.out.println(v[i]);

        }

    }

    public static void main (String[] args) {

    int [] vetor = new int [6];
    escaneandoVetor(vetor);
    mostrar(vetor);
    }
}
*/

//EXERCÍCIO 3
/*
import java.util.Scanner;
public class arraysEmatrizes {
    public static Scanner input = new Scanner (System.in);

    public static void escaneandoVetor (float [] v) {
        for (int i=0; i<10; i++){
            float valor = input.nextFloat();
            v[i]=valor;
        }
    }

    public static void mostrar (float [] v){
        for (int i=0; i<v.length; i++){
            System.out.print(v[i] + " ");
        }
    }

    public static void vetorQuadrado(float [] v, float [] b){
        for (int i=0; i<v.length; i++){
            b[i]=v[i]*v[i];
        }
    }

    public static void main(String [] args){
        float [] vetor1=new float[10];
        float [] vetor2=new float[10];

        escaneandoVetor(vetor1);
        vetorQuadrado(vetor1, vetor2);
        System.out.println("Os valores presentes no primeiro vetor são: ");
        mostrar(vetor1);
        System.out.println("\nOs valores presentes no segundo vetor são: ");
        mostrar(vetor2);
    }



}
*/


//EXERCÍCIO 4
/*
import java.util.Scanner;
public class arraysEmatrizes {
    public static Scanner input = new Scanner (System.in);

    public static void escaneandoVetor (int [] v) {
        for (int i=0; i<v.length; i++){
            int valor = input.nextInt();
            v[i]=valor;
        }
    }

    public static void main(String [] args){
        int [] vetorPosicoes = new int [8];
        escaneandoVetor(vetorPosicoes);


        System.out.println("Digite um número inteiro até 8");
        int X = input.nextInt();
        System.out.println("Digite um outro número inteiro até 8 sem ser o anterior");
        int Y = input.nextInt();

        System.out.printf("A soma dos números presentes nas posições %d e %d é: %d", X, Y, vetorPosicoes[X]+vetorPosicoes[Y]);




    }

}  
*/