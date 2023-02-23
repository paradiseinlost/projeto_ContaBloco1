package Conta;

import java.util.Scanner;

import Conta.model.Conta;
import Conta.model.Conta_Corrente;
import Conta.model.Conta_Poupanca;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
								
    Conta_Corrente contaCorrente1= new Conta_Corrente(1234,234,1,"Bellatrix Lestrange",15000.0f,3000.0f);
    contaCorrente1.visualizar();
    System.out.println("\n\n\n");
    contaCorrente1.sacar(16000.0f);
    contaCorrente1.visualizar();
    System.out.println("\n\n\n");
    contaCorrente1.depositar(6500.0f);
	contaCorrente1.visualizar();
	
System.out.println("\n\n\n");

	Conta_Poupanca contaPoupanca1 = new Conta_Poupanca(1234,234,2,"Bellatrix Lestrange",15000.0f,2);
	contaPoupanca1.visualizar();
    System.out.println("\n\n\n");
    contaPoupanca1.sacar(1000.0f);
    contaPoupanca1.visualizar();
    System.out.println("\n\n\n");
    contaPoupanca1.depositar(6500.0f);
    contaPoupanca1.visualizar();
	
System.out.println("\n\n\n");
	

int opcao=0;
		
Scanner leia = new Scanner (System.in);

while (true){

System.out.println("\n*************************************************************");
System.out.println("\n                                                             ");
System.out.println("\n\t\tBANCO GRINGOTES    ∆ ϟ O-O¬ 9¾                           ");
System.out.println("\n                                                             ");
System.out.println("\n*************************************************************");
System.out.println("\n                                                             ");
System.out.println("\n\t\t 1 - Criar Conta                                         ");
System.out.println("\n\t\t 2 - Listar todas as contas                              ");
System.out.println("\n\t\t 3 - Buscar Conta por Numero                             ");
System.out.println("\n\t\t 4 - Atualizar Dados da Conta                            ");
System.out.println("\n\t\t 5 - Apagar Conta                                        ");
System.out.println("\n\t\t 6 - Sacar                                               ");
System.out.println("\n\t\t 7 - Depositar                                           ");
System.out.println("\n\t\t 8 - Transferir valores Entre contas                     ");
System.out.println("\n\t\t 9 - Sair                                                ");
System.out.println("\n                                                             ");
System.out.println("\n*************************************************************");
System.out.println("\n                                                             ");
System.out.println("\n\t\tEntre com a Opção desejada :                             ");
System.out.println("\n                                                             ");
opcao=leia.nextInt();

if (opcao==9) {
	System.out.println("\n\t\tBANCO GRINGOTES  ");
	System.out.println("\n Além de Hogwarts, esse é o lugar mais seguro para se guardar qualquer coisa de valor.");
	leia.close();
    System.exit(0);   
}
switch (opcao) {

case 1:
	
	System.out.println("\nCriar Conta");

break;

case 2:

	System.out.println("\nListar todas as Contas ");

break;

case 3:
	
	System.out.println("\nConsultar dados da Conta - por número ");

break;

case 4:
	
	System.out.println("\nAtualizar dados da Conta ");
	
break;

case 5:
	
	System.out.println("\nApagar a Conta ");

break;

case 6:
	
	System.out.println("\nSaque ");
	
break;

case 7:
	
	System.out.println("\nDeposito ");

break;

case 8:
	
	System.out.println("\nTransferência entre Contas ");

break;

default :
	
	System.out.println("\nOpcão Invalida ");

break;

}
	}




}
}