import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        System.out.println("Por favor, digite sua escolha\n" + "1- Cadastrar conta\n" + "0 - Sair");
        Scanner entrada = new Scanner(System.in);
        int escolha = entrada.nextInt();
        int numero;
        String nomeTitular;

        while(escolha == 1){
            System.out.println("Por favor, digite sua escolha\n" + "1- Cadastrar Conta\n" + "2 - Cadastrar Conta especial\n" + "3 - Cadastrar conta poupança");
            escolha = entrada.nextInt();

            switch(escolha){
                case 1:
                System.out.print("Digite o número da conta: ");
                Scanner numConta = new Scanner(System.in);
                numero = numConta.nextInt();

                System.out.print("Digite o nome da conta: ");
                Scanner nomeConta = new Scanner(System.in);
                nomeTitular = nomeConta.nextLine();
                Conta conta = new Conta(numero, nomeTitular);

                System.out.println("\n|| CONTA ||\n" + conta.getNumero() + " " + conta.getNome_titular());

                break;

                case 2: 
                System.out.print("Digite o número da conta: ");
                Scanner numContaEspecial = new Scanner(System.in);
                numero = numContaEspecial.nextInt();

                System.out.print("Digite o nome da conta: ");
                Scanner nomeContaEspecial = new Scanner(System.in);
                nomeTitular = nomeContaEspecial.nextLine();

                System.out.print("Digite o limite da conta: ");
                Scanner limiteContaEspecial = new Scanner(System.in);
                double limite = limiteContaEspecial.nextDouble();
                
                
                ContaEspecial contaEspecial = new ContaEspecial(numero, nomeTitular, limite);

                System.out.println("\n|| CONTA ESPECIAL ||\n" + contaEspecial.getNumero() + " " + contaEspecial.getNome_titular() + " " + contaEspecial.getLimite());

                
                break;

                case 3:
                System.out.print("Digite o número da conta: ");
                Scanner numContaPoupanca = new Scanner(System.in);
                numero = numContaPoupanca.nextInt();

                System.out.print("Digite o nome da conta: ");
                Scanner nomeContaPoupanca = new Scanner(System.in);
                nomeTitular = nomeContaPoupanca.nextLine();
                ContaPoupanca contaPoupanca = new ContaPoupanca(numero, nomeTitular);

                System.out.println("\n|| CONTA POUPANÇA ||\n" + contaPoupanca.getNumero() + " " + contaPoupanca.getNome_titular());
                break;
            }
            

        };

        entrada.close();



    }
}