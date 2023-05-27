import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args) {
        int v1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor inicial:"));
        int v2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor final:"));

        System.out.println(v1+" "+v2);

        //mostrar a contagem de b1 ate b2
        int a = v1;
        int b = v2; 

        while(a<=b){
           System.out.print(a+" ");
           a++;
        }

    }
}
