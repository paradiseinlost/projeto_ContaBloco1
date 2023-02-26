package Conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Conta.controller.ContaController;
import Conta.model.Conta_Corrente;
import Conta.model.Conta_Poupanca;
import Conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ContaController contas = new ContaController ();	
	
	Scanner leia = new Scanner (System.in);								
	
int opcao,numero,agencia,tipo,aniversario,numeroDestino;	
String titular;
float saldo,limite,valor;
	
System.out.println("\nCriar Contas\n");	


Conta_Corrente contaCorrente1 = new Conta_Corrente (contas.gerarNumero (),123,1,"Bellatrix Lestrange",1000f,100.0f);
contas.cadastrar(contaCorrente1);

Conta_Corrente contaCorrente2 = new Conta_Corrente (contas.gerarNumero (),124,1,"Hermione Granger",2000f,100.0f);
contas.cadastrar(contaCorrente2);

Conta_Poupanca contaPoupanca1 = new Conta_Poupanca(contas.gerarNumero (),125,2,"Harry Potter",4000f,12);
contas.cadastrar(contaPoupanca1);
    
Conta_Poupanca contaPoupanca2 = new Conta_Poupanca(contas.gerarNumero (),125,2,"Albus Percival Wulfric Brian Dumbledore ",4000f,30);
contas.cadastrar(contaPoupanca2);
    	

contas.listarTodas();
		
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


try {
		opcao=leia.nextInt();
}catch(InputMismatchException e) {
	    System.out.println("\nDigite valor inteiros : ");
	    leia.nextLine();
	    opcao=0;
}

if (opcao==9) {
	System.out.println("\n\t\tBANCO GRINGOTES  ");
	System.out.println("\n Além de Hogwarts, esse é o lugar mais seguro para se guardar qualquer coisa de valor.");
	leia.close();
    System.exit(0);   
}

switch (opcao) {

  case 1:
	
	System.out.println("\nCriar Conta");
	
	System.out.println("\nDigite o numero da Agencia : ");
	agencia=leia.nextInt();
	System.out.println("Digite o nome do titular: ");
	leia.skip("\\R?");
	titular = leia.nextLine();
	
	do {
	System.out.println("\nDigite o tipo de Conta(1-CC ou 2 - CP ): ");	
	tipo = leia.nextInt();
	}while (tipo < 1 && tipo > 2);
	
	System.out.println("\nDigite o saldo da conta (R$): ");
	saldo=leia.nextFloat();
	
	switch (tipo) {
	
	 case 1 -> {
		
	
		System.out.println("\nDigite o limite de Credito (R$) : ");
		limite=leia.nextFloat();	
		contas.cadastrar(new Conta_Corrente(contas.gerarNumero(),agencia,tipo,titular,saldo,limite));		
	    }
	
     case 2 -> {

	   System.out.println("\nDigite o aniversário da conta : ");
	   aniversario=leia.nextInt();	
	   contas.cadastrar(new Conta_Poupanca(contas.gerarNumero(),agencia,tipo,titular,saldo,aniversario));	
       }
	
    }
	
keyPress();
break;

case 2:

	System.out.println("\nListar todas as Contas ");
	contas.listarTodas();
keyPress();
break;

case 3:
	
	System.out.println("\nConsultar dados da Conta - por número ");
	
	System.out.println("\nDigite o numero da Conta : ");
	numero=leia.nextInt();
	
	contas.procurarPorNumero(numero);
	
keyPress();
break;

case 4:
	
	System.out.println("\nAtualizar dados da Conta ");
	
	System.out.println("\nDigite o numero da Conta : ");
	numero=leia.nextInt();
	
	if ( contas.buscarNaCollection(numero)!= null) {
		System.out.println("\nDigite o numero da agencia : ");
		agencia=leia.nextInt();
		System.out.println("\nDigite o nome do titular : ");
		leia.skip("\\R?");
		titular=leia.nextLine();
		
		System.out.println("\nDigite o saldo da conta (R$) : ");
		saldo=leia.nextFloat();
		
		tipo = contas.retornaTipo(numero);
		
		
		switch (tipo) {
		
		case 1 -> {
			
			System.out.println("Digite o limirte de Credito (R$): ");
			limite=leia.nextFloat();
			contas.atualizar(new Conta_Corrente(numero,agencia,tipo,titular,saldo,limite));	
		}
		
		case 2 -> {
			
			System.out.println("Digite o aniversario da conta : ");
			aniversario=leia.nextInt();
			contas.atualizar(new Conta_Poupanca(numero,agencia,tipo,titular,saldo,aniversario));		
		}	
		
		default -> {
			
			System.out.println("\nTipo de conta Invalido ! ");
		}
		
		}
	
	   }else
	        System.out.println("\nConta não encontrada ! ");
		   
keyPress();	
break;

case 5:
	
	System.out.println("\nApagar a Conta ");
	
	System.out.println("\nDigite o numero da Conta : ");
	numero=leia.nextInt();
	
	contas.deletar(numero);
	
keyPress();
break;

case 6:
	
	System.out.println("\nSaque ");
	
	System.out.println("\nDigite o numero da Conta : ");
	numero=leia.nextInt();
	
	do {
		System.out.println("\nDigite o valor do saque: ");
		valor = leia.nextFloat();
		
	}while(valor<=0);
	
	contas.sacar(numero,valor);
	
keyPress();	
break;

case 7:
	
	System.out.println("\nDeposito ");
	
	
	System.out.println("\nDigite o numero da Conta : ");
	numero=leia.nextInt();
	
	do {
		System.out.println("\nDigite o valor do deposito : ");
		valor = leia.nextFloat();
		
	}while(valor<=0);
	
	contas.depositar(numero,valor);
		
keyPress();
break;

case 8:
	
	System.out.println("\nTransferência entre Contas ");
	
	System.out.println("\nDigite o numero da Origem : ");
	numero=leia.nextInt();
	
	System.out.println("\nDigite o numero da Conta Destino : ");
	numeroDestino=leia.nextInt();
	
	do {
		System.out.println("\nDigite o valor de transferência : ");
		valor = leia.nextFloat();
		
	}while(valor<=0);
	
	contas.transferir(numero,numeroDestino,valor);
	
	
	
	
	
	
	
	
keyPress();
break;

default :
	
	System.out.println("\nOpcão Invalida ");
keyPress();
break;

}
	}
	}
public static void keyPress() {
	
	try {
		System.out.println(Cores.TEXT_RESET+"\n\nPressione Enter para Continuar ...");
		System.in.read();	
	}catch (IOException e) {
		
	System.out.println("\nVocê pressionou uma tecla diferente de Enter ! ");	
	}
	
}



}
