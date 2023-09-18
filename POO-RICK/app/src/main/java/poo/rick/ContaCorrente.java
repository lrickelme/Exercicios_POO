package poo.rick;

public class ContaCorrente {
    private int numeroConta;
    private double saldo;
    private String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public ContaCorrente(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor){
        if (valor < 0) throw new RuntimeException();
        saldo += valor;
    }

    public void sacar(double valor){
        if (valor < 0) throw new RuntimeException();
        saldo += valor;
    }

    public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente(132465, 0, "Lucas");
        System.out.println(c.numeroConta);
        System.out.println(c.saldo);
        System.out.println(c.titular);
        c.depositar(50000);
        c.sacar(115000);
        System.out.println(c.saldo);
    }
}
