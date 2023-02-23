package Conta.model;

public abstract class Conta {

	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		super();
		
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor) {
		
		if(this.getSaldo()<valor) {
			System.out.println("\nSaldo insuficiente ! ");
			return false;
		}
		this.setSaldo(this.getSaldo()- valor);
		return true;
	}
	
	public void depositar (float valor) {
		this.setSaldo(this.getSaldo()+ valor);
	}
	
	
	public void visualizar () {
		
	String tipo = "";
	
	switch (this.tipo) {
	
	case 1:
		tipo = " Conta Corrente ";
	break;
	
	case 2:
		tipo = " Conta Poupan�a ";
	break;
	
	default:
		System.out.println("\nOp��o Invalida !!");
	break;
	}
	
	System.out.println("\n\n***************************************************");	
	System.out.println("\nDados da Conta");	
	System.out.println("\n*****************************************************");	
	System.out.println("\nNumero da Conta "+this.numero);	
	System.out.println("\nAg�ncia : "+this.agencia);	
	System.out.println("\nTipo da Conta : "+tipo);	
	System.out.println("\nTitular : "+this.titular);	
	System.out.println("\nSaldo :"+this.saldo);	
}
	
	
	
	
}
