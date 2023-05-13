import java.util.Scanner;

public class Tarefa {
    public static void main(String[] args) {
        // ler um número e mostrar
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInsira um número:");
        String numero = sc.nextLine();


        System.out.println("\n O número inserido foi:"+ numero);

        sc.close();

    }
}
