public class RodarAppDois {

    public static void main(String[] args) {
        // UPCAST
        Funcionario funcionario = new Funcionario();
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();
       
        // DOWNCAST

        Vendedor vendedor= (vendedor) new Funcionario();


    }
    
}
