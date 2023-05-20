import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //output saída de dados
        JOptionPane.showMessageDialog(null, "Olaaa");

        //input entrada de dados
        String nome = JOptionPane.showInputDialog("Qual seu nome ?");
        JOptionPane.showMessageDialog(null, "Seja bem-vindo(a) "+ nome);

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
        JOptionPane.showMessageDialog(null, "Sua idade é: "+ idade);

        if(idade<18){
                JOptionPane.showMessageDialog(null,"Volte quando completar 18 anos");
        }else{
            JOptionPane.showMessageDialog(null,"Pode da-lhe");
        }

        
        
    }
}
