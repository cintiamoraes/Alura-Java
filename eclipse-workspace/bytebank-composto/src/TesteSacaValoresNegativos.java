
public class TesteSacaValoresNegativos {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
        conta.deposita(100);
        
     // n�o saca o valor porque de acordo com o m�todo saca ele s� far� se o valor for >=, mas no caso s� h� 100 no deposita
     // System.out.println(conta.saca(200));    
     // System.out.println(conta.saldo);
        
        System.out.println(conta.saca(101));

        conta.saca(101);

        System.out.println(conta.getSaldo());
    

	}
}
