
public class TestaReferencias { 	
	
    public static void main(String[] args) {
    	
        Conta primeiraConta = new Conta(); 
        
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        
        System.out.println("saldo da segunda conta " + segundaConta.saldo); 

        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
        	
            System.out.println("? a mesma conta");        
        }                 
        System.out.println(primeiraConta);                    
    }
}
//H? somente uma Conta criada. 
//primeiraConta e segundaConta s?o refer?ncias da Conta. Os objetos s?o o que est?o dentro de saldo, ag?ncia, etc. 
