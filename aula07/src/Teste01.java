import modelos.Cliente;
import modelos.Conta;

public class Teste01 {
    public static void main(String[] args) {
        //instanciar objetos do tipo cliente
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("José da Silva", "Rua 20", "98787-2522", "jose@gmail.com");
        //adicionar valores aos atributos de c1
        c1.setNome("AhNão");
        c1.setEmail("ahnao@gmail.com");
        c1.setEndereco("Rua zero");
        c1.setTelefone("7878-4541");
        //mostrar atributos do cliente
        System.out.println(c1.getNome());
        System.out.println(c1);
        //criar contas para os clientes
        Conta conta1 = new Conta(147852,2541,c1,2000);
        Conta conta2 = new Conta(36985,3698,c2, 450);
       
        //mostrar dados das contas
        System.out.println("Dados do titular da conta1 \n"+conta1.getTitular());
        System.out.println("Dados do titular da conta2 \n"+conta2.getTitular());
        //Transferir valores entre contas
       boolean op = conta1.transferir(conta2,900);
       if(op){
            System.out.println("Transferência realizada com sucesso!!!!");
       }else{
            System.out.println("Transferência não realizada!!!!");
       }
       
        //Mostrar o saldo atual da conta 2
        System.out.println("Saldo conta 2: "+conta2.getSaldo());
        System.out.println("Saldo conta 1: "+conta1.getSaldo());
        //dados da conta
        System.out.println(conta1);

    }
}
