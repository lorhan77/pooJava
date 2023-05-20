import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args) {
        String curso = JOptionPane.showInputDialog(null, "Informe um curso: \n1-Java \n2-Javascript");
        curso = curso.toLowerCase();
        if(curso.equals("java" ) || curso.equals("1")) 
        {
            JOptionPane.showMessageDialog(null,"Backend");  
        }else if(curso.equals("javascript") || curso.equals("2"))
        {
            JOptionPane.showMessageDialog(null,"Frontend");  
        }else{
            JOptionPane.showMessageDialog(null,"INVALIDO porra");  
        }
    }
    
}
