public class exerciciospre{
    public static int buscaSequencial(int v[], int tam, int valor){
        for (int i=0; i<tam; i++){
            if (v[i]==valor){
                return i;
            }
        }

        return -1;
    }

    public static int remover(int v[], int tam, int x){
        int index = buscaSequencial(v, tam, x);

        if (index==-1){
            System.out.println("Não foi encontrado esse ítem no vetor!");
            return tam;
        }

        for (int i=index; i<tam-1; i++){
            v[i]=v[i+1];
        }

        return tam-1;
    }

        public static void impressao(int v[], int tam){
            for (int i=0; i<tam; i++){
                System.out.println(v[i]);

            }
        }

/*        public static int removerTodos(int v[], int tam, int alvo){
            int novoTam=tam;
            int i=0;
            while(i<novoTam){
                if(v[i]==alvo){
                    novoTam=remover(v, novoTam, alvo);
                }
                else{
                    i++;
                }
            }
            return novoTam;
        }
*/ 

//outraversão
/*      public static int removerTodos(int v[], int tam, int alvo){^
            int novoTam=0;
            for (int i=0; i<tam, i++){
                if (v[i]!=alvo){
                    v[novoTam]=v[i];
                    novoTam++;
            }
        }
        return novoTam;
    }
        
*/ 

        public static int removerTodos(int []v, int tam, int x){
            int deslocamento=0;
            for (int i=0; i<tam; i++){
                if (v[i]==x){
                    deslocamento++;
                }
                else{
                    v[i-deslocamento]=v[i];
                }
            }
            return tam-deslocamento;
        }
        
        public static void main(String[] args) {
            int v[] = new int [10];
            v[0]=1;
            v[1]=2;
            v[2]=4;
            v[3]=5;
            v[4]=4;
            v[5]=5;

            int tam=6;

            int novotamanho = remover(v, tam, 4);
            System.out.println(novotamanho);

            for (int i=0; i<novotamanho; i++){
                System.out.println(v[i]);
            }
        }


}
