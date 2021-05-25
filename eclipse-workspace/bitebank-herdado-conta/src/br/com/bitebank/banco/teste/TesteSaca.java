package br.com.bitebank.banco.teste;
public class TesteSaca {

    public static void main(String[] args) {
        br.com.bitebank.banco.Modelo.Conta conta = new br.com.bitebank.banco.Modelo.ContaCorrente(123, 321);

        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch(br.com.bitebank.banco.Modelo.SaldoInsuficienteException ex) {
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println(conta.getSaldo());
    }
}