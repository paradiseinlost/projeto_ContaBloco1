package Conta.model;

public class Conta_Poupanca extends Conta {
	
private int aniversario;

	public Conta_Poupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
		
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
@Override

public void visualizar () {
	super.visualizar();
System.out.println("\nAniversario da Conta " +this.aniversario);

}
	
	
}
