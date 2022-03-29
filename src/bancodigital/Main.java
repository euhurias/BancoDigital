package bancodigital;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        cc.depositar(100);
        cc.transferir(90, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
