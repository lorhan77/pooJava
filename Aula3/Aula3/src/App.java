public class App {
    public static void main(String[] args) throws Exception {
            int cont = 0;

            while(cont<=20){
                System.out.print(cont+" ");

                //incremetando variável de controle

                cont++;
            }

               System.out.println("\n Valor final do contador:"+cont);

               //contagem  de 50 ate 80
               int i = 50;

               while(i<=80){
                System.out.print(i+" ");
                i++;
               }

               //repetir 200 vezes a frase "Eu sou pobre então tenho que estudar para não morrer de fome."
               int contador = 0;

               while(contador<=200){
                    System.out.println(contador+"\nEu sou pobre então tenho que estudar para não morrer de fome.");
                    contador++;
               }

               //contagem decrescente iniciado em 100 e terminando em 1
               int dec = 100;
            
               while(dec>=1){
                System.out.println(dec);
                dec--;
           }

           //Contagem iniciando em 10 e finalizando em 300, incrementando os valores de 10 em 10 

           int z = 10;
            
           while(z<=300){
            System.out.println(z);
            z+=10;
       }
            //Contagem iniciando em 500 e finalizando em 0, decrementando o valor em 50.
            int y = 500;
            
            while(y>=0){
             System.out.println(y);
             y-=50;
        }
        System.out.println("---------------------------------------------------------------");

        //mostrar a soma total dos valores da contagem de 1 ate 10
        int s = 1;
        int soma = 0;
        while(s<=10){
            soma = soma + s;
            System.out.println("Os valores são:"+s);
            s++;
        }
       
        System.out.println("Valor total da soma é:"+soma);

        System.out.println("---------------------------------------------------------------");

        //Contagem iniciando em 25 e finalizando em 150. Incrementar os valores de 5 em 5 e mostrar a soma dos valores do contador

        int t = 25;
        int somaTotal = 0;
                while(t<=150){
                   somaTotal = somaTotal + t;
                   System.out.println("Os valores são:"+t);
                   t+=5;
        }

          System.out.println("Valor total da soma é:"+somaTotal);

          System.out.println("---------------------------------------------------------------");

          //mostrar a contagem dos valores das variaveis abaixo
             int a = 10;
             int b = 20; 

             while(a<=b){
                System.out.print(a+" ");
                a++;
             }
    }
}
