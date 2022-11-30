public class ContaEspecial extends Conta {
    private double limite;

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public ContaEspecial(int numero, String nome_titular, double limite){
        super(numero, nome_titular);
        this.limite = limite;
    }

    public boolean sacar (double valor){
        double saldo = this.getSaldo();
        if(valor <= this.limite + this.getSaldo()){
            saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

}
