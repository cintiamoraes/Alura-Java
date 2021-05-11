public class Conta {

	double saldo;
    int agencia;
    int numero;
    String titular; 

    public void deposita(double valor) { 
    	
        this.saldo += valor;//=-tira o valor dele mesmo, é a forma utilizada pelos programadores, 
        //mas significa o mesmo que: this.saldo + valor o Thsi será usado para acessar um método
        //This é uma palavra chave do Java que indica a referência para o objeto Conta (new Conta()). 
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
            destino.deposita(valor);// e deposita na conta destino está reutilizando um método da minha class
            return true;
        }   
            return false;
    }
}