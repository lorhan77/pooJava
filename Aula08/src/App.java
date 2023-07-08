import modelos.Cliente;
import modelos.ContaCorrente;
import modelos.Endereco;

public class App {

    public static void main(String[] args) {
         Vendedor vend1 = new Vendedor("lorhan", "92981899300", "gabriellorhan7@gmail.com ", "Engenharia");
        
        System.out.println("O valor do salario do ven1 foi: "+vend1.setSalarioTotal(1000));

            Gerente ger1 = new Gerente("Joao", "9299999999", "joao@gmail.com", "zbct");
        System.out.println("O valor do salario do ger1 foi: "+ger1.setSalarioTotal(5000));
    }

}
 

