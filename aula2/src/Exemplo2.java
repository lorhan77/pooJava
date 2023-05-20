import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args) {
        //ler o valor de um produto
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor: "));

        if(valor<0){
            JOptionPane.showMessageDialog(null,"Valor do produto não pode ser negativo ");
        }
        else if(valor<500){
            JOptionPane.showMessageDialog(null,"Valor de baixo custo ");
        }
        else{
            JOptionPane.showMessageDialog(null,"Valor está ok ");
        }
    }
}
