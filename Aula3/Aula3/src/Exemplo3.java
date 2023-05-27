public class Exemplo3 {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            System.out.print(i+" ");
        }
        System.out.print("\n---------------------------------------------------\n");
        //inicio em 20 até 0.
        for(int x=20; x>=0; x--){
            System.out.print(x+" ");
        }
        System.out.print("\n---------------------------------------------------\n");
        //inicio em 0 ate 100, incrementando em 5.
        for(int z=0; z<=100; z+=5){
            System.out.print(z+" ");
        }

        System.out.print("\n---------------------------------------------------\n");
        //mostrar a soma dos valores iniciando em 11 e termina em 20 
        int somaTotal=0;
        for(int z=11; z<=30; z++){
            System.out.print("\nOs valores são: "+z);
            somaTotal=somaTotal + z;
           
        }
            System.out.print("\nA soma total  dos valores é: "+somaTotal);


    }
}
