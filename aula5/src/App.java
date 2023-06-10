import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("Lorhan", 200.0);
        Conta c2 = new Conta("Joao", 300.0);
        Conta c3 = new Conta();

        c1.setTitular("Lorhan Gabriel Barbosa Lopes");
        System.out.println(c1.getTitular());
        JOptionPane.showMessageDialog(null, c1.getTitular());
        JOptionPane.showMessageDialog(null, c2.getTitular());
        JOptionPane.showMessageDialog(null, c3.getTitular());

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
        Cliente cli1 = new Cliente("Joao", "Av. dos Gays", "293993293219", "joaogay@gmail.com");
        Cliente cli2 = new Cliente("Lorhanxl99", "Av. dos mascho alfa, redpill", "9292993293392", "lorhanxl99@gmail.com"); 

        System.out.println(cli1.getNome());
        System.out.println(cli2.getNome());
    }
}
