package Conta.controller;

import java.util.ArrayList;

import Conta.model.Conta;
import Conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	
	private ArrayList<Conta>ListaContas = new ArrayList<Conta>();
	
	@Override
	public void procurarPorNumero(int numero) {
       var conta = buscarNaCollection (numero);
       
		 if (conta != null)
            conta.visualizar();
		 
		 else
			 System.out.println("\nA Conta numero "+numero+ " não foi encontrada ! ");
       
	}

	@Override
	public void listarTodas() {
		for (var conta :ListaContas) {
			conta.visualizar();
		}
	}

	@Override
	public void cadastrar(Conta conta) {
		ListaContas.add(conta);
		System.out.println("\nA Conta numero : " +conta.getNumero()+ " foi criada com sucesso !");		
	}

	@Override
	public void atualizar(Conta conta) {
		var buscarConta = buscarNaCollection(conta.getNumero());
		
		if (buscarConta != null) {
			ListaContas.set(ListaContas.indexOf(buscarConta),conta);
			System.out.println("\nA conta numero "+conta.getNumero()+" foi atualizada com sucesso ! ");
			}
		else 
			
			System.out.println("\nA conta "+conta.getNumero()+ " não foi encontrada !!" );
	}

	@Override
	public void deletar(int numero) {
	  var conta = buscarNaCollection(numero);
	  
	  if (conta != null) {
		 if (ListaContas.remove(conta)==true) 
			 System.out.println("\nA conta numero "+numero+"foi deletada com sucesso ! ");	  
		 
	  }else 
		   System.out.println("\nA conta numero "+numero+ " nao foi encontrada ! ");
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarNumero() {
		// TODO Auto-generated method stub
		return ListaContas.size ()+1;
	}
	
    public Conta buscarNaCollection(int numero) {
	
    	for (var conta : ListaContas) {
    	 if (conta.getNumero()== numero) {
    		 return conta;
    	 }
    		
    	}
	return null;
     }
    
   public int retornaTipo(int numero) {
	   
	     for (var conta : ListaContas) {
	      if (conta.getNumero()== numero) {
	    	  return conta.getTipo();
	      }
	     }
	return 0;
}
    
    
}
