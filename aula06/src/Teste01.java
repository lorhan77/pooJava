public class Teste01 {
    public static void main(String[] args) {
         Cliente c1 = new Cliente();
         Cliente c2 = new Cliente("Lorhan", "Av. prof nilton lins", "92900000000", "lorhan@gmail.com");
         c1.setNome("aaaaaaaaa");
         c1.setEmail("gabriellorhan7@gmail.com");
         c1.setEndereco("Av. do Charme, 100");
         c1.setTelefone("92981899300");

         System.out.println(c1.getNome());
         System.out.println(c1.getEmail());
         System.out.println(c1.getEndereco());
         System.out.println(c1.getTelefone());
         System.out.println(c1);

         Conta conta1 = new Conta(1234, 5555, c1, 2000);
         Conta conta2 = new Conta(5678, 6666, c2, 1000);

         System.out.println("Dados do titular da conta1: \n"+conta1.getTitular());
         System.out.println("Dados do titular da conta2: \n"+conta2.getTitular());
         //transferir valores entre contas
        boolean op = conta1.transferir(conta2, 2000);

        if(op){
            System.out.println("Transferência realizada com sucesso!");
        }else{
            System.out.println("Transferência não realizada!");
        }
        //Mostrar o saldo das contas
        System.out.println("Saldo da conta1:"+conta1.getSaldo());
        System.out.println("Saldo da conta2:"+conta2.getSaldo());
        //System.out.println(conta1);
        //System.out.println(conta2);
    }
}
