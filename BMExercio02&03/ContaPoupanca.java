public class ContaPoupanca extends Conta{
    public void reajustar(double percentual){
        double saldoAtual = this.getSaldo();
        double reajuste = saldoAtual * percentual;
        this.depositar(reajuste);
    }

    public ContaPoupanca(int numero, String nome_titular){
        super(numero, nome_titular);
    }

}
