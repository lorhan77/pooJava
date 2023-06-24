//import javax.swing.JOptionPane;

import modelos.Cliente;
import modelos.ContaCorrente;

public class App {
    public static void main(String[] args) throws Exception {
       Cliente cli2 = new Cliente();
       ContaCorrente cc2 = new ContaCorrente(1212, 55555, cli2, 6000  );
       System.out.println(cc2.getSaldo());  

    }
}
