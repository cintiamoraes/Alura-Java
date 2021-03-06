package br.com.bitebank.banco.Modelo;
//ningu?m pode instanciar os objetos desta classe
public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;// composi??o
	private static int total;

	/**
	* Construtor para inicializar o objeto a partir da agencia e numero.
	*
	*@param agencia
	*@param numero
	*/
	
	public Conta(int agencia, int numero) {

		Conta.total++;
		// System.out.println("o total de contas ? " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("estou criando uma conta " + this.numero);
	}

	public abstract void deposita(double valor);

	/**
	*
	*Valor precisa ser maior que o saldo
	*@param valor
	*@throws SaldoInsuficienteException
	*/
	public void saca(double valor) throws SaldoInsuficienteException{

        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 

        this.saldo -= valor;       
}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
	    this.saca(valor);
	    destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {// set altera o atributo

		if (numero <= 0) {
			System.out.println("n?o pode valor <= 0");
			return;
		}

		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {

		if (agencia <= 0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}

		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {/// o m?todo est?tico s? acessa atributos est?ticos da pr?pria classe,
		// ou seja, nada com "this"
		return Conta.total;

	}
	
	@Override 
	public String toString() { 
	    return "Numero: " + this.numero + " Agencia:" + this.agencia;
	}
	
}


