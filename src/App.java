import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String curso = "POO JAVA";
        int ch = 36;
        double valor = 5.456;

        System.out.printf("Hoje iniciamos o curso de  %s com a carga horária de %d", curso, ch);

        System.out.printf("\nDuas casas decimais: %.3f",valor);

        //leitura de dados no terminal 
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInforme seu nome:");
        String nome = sc.nextLine();

        System.out.print("\nInforme sua idade:");
        String idade = sc.nextLine();

        System.out.printf("\nSeu nome é %s e você tem %s anos",nome, idade);

        sc.close();
    



    }
}

