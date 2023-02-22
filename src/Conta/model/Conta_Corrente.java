package Conta.model;

public class Conta_Corrente extends Conta {

	private float limite;
	
	public Conta_Corrente(int numero, int agencia, int tipo, String titular, float saldo,float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	
	public boolean sacar(float valor) {
		
		if(this.getSaldo()+this.getLimite()< valor) {
			System.out.println("\nSaldo Insuficiente !!");
			return false ;
		}
	this.setSaldo(this.getSaldo()- valor);
	return true ;
	}
	public void visualizar () {
	super.visualizar();	
	System.out.println("\nLimite de Credito :"+this.limite);
	}
	
	
	
}
