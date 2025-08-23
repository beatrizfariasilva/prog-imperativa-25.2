public class Ex2{
    public static void main (String [] args){

        //imprimindo todos os n de 1 a 100
        int i=0;
        System.out.println("todos os n de 1 a 100"); 
        for (i=1; i<=100; i++){
            
            if (i!=100){
               System.out.print(i+", "); 
            }
            
            if (i==100){
                System.out.print(i);
            }
        }

        System.out.println();
        System.out.println();
        
        //imprimindo todos os impares de 1 a 100
        System.out.println("todos os ímpares de 1 a 100"); 
        for (i=1; i<=100; i++){
            if (i%2!=0 && i!=99){
                System.out.print(i+", ");
            }
            if (i==99){
                    System.out.print(i);
            }
        }

        System.out.println();
        System.out.println();

        //imprimindo todos os pares de 1 a 100
        System.out.println("todos os pares de 1 a 100"); 
        for (i=1; i<=100; i++){
            if (i%2==0 && i!=100){
                System.out.print(i+", ");
            }
            if (i==100){
                    System.out.print(i);
            }
            
        }

        System.out.println();
        System.out.println();

        //imprimindo todos os multiplos de 3
        System.out.println("todos os múltiplos 3 de 1 a 100"); 
        for (i=1; i<=100; i++){
            if (i%3==0 && i!=99){
                System.out.print(i+", ");
            }
            if (i==99){
                    System.out.print(i);
            }
        }

        System.out.println();
        System.out.println();

        //imprimindo todos os multiplos de 3 e os números que terminam com 3
        System.out.println("todos os múltiplos de 3 e números que terminam em 3 de 1 a 100"); 
        for (i=1; i<=100; i++){
            if (i%3==0 && i!=99 || (i==13 || i==23 ||i==33||i==43||i==53||i==63||i==73||i==87||i==93)){
                System.out.print(i+", ");
            }
            if (i==99){
                    System.out.print(i);
            }
        }
        
    }

}