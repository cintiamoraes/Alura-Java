public class Conta {

	double saldo;
    int agencia;
    int numero;
    String titular; 

    public void deposita(double valor) { 
    	
        this.saldo += valor;//=-tira o valor dele mesmo, ? a forma utilizada pelos programadores, 
        //mas significa o mesmo que: this.saldo + valor o Thsi ser? usado para acessar um m?todo
        //This ? uma palavra chave do Java que indica a refer?ncia para o objeto Conta (new Conta()). 
    } 

    
    public boolean saca(double valor) { 
        if(this.saldo >= valor) {
            this.saldo -= valor;//tira valor dele mesmo
            return true;
        } else { 
            return false;
        }
    }
    
    public boolean transfere(double valor, Conta destino) { 
    	
        if(this.saldo >= valor) { 
            this.saldo -= valor; //subtrai esse valor do saldo
            destino.deposita(valor);// e deposita na conta destino est? reutilizando um m?todo da minha class
            return true;
        }   
            return false;
    }
}