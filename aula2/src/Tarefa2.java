import javax.swing.JOptionPane;

public class Tarefa2 {
    public static void main(String[] args) {
        //ler o salario do funcionario, informar se o salário está acima ou abaixo do valor mínimo
        double valor= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do salário: "));
        double salario = 1320;

        if(valor<salario && valor>0){
            JOptionPane.showMessageDialog(null,"Trabalho escravo");
        }
        else if(valor>=salario){
            JOptionPane.showMessageDialog(null,"Valor acima da média");
        }
        else if(valor<0){
            JOptionPane.showMessageDialog(null,"CORRA");
        }

    }
}
