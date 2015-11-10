package com.fafica.fornecedor;

import java.util.ArrayList;

import com.fafica.atividade04.cliente.Cliente;



public class RepositorioFornecedorList implements IRepositorioFornecedor {
	
	
	   private ArrayList<Fornecedor> arrayListFornecedor;
	   private Integer id;

	   public RepositorioFornecedorList(){
	 		
		   		arrayListFornecedor = new ArrayList<Fornecedor>();
		   		id = 1;
		    		
		    	}
	   
	   
	     public void cadastrar(Fornecedor fornecedor){
		 if (existe(fornecedor.getIdFornecedor()));
	     fornecedor.setIdFornecedor(id);
	     arrayListFornecedor.add(fornecedor);
		 id++;
	     }
	     

	     public void atualizar(Fornecedor fornecedor){
	     int i = getId(fornecedor.getIdFornecedor());
	 	 if(i == -1);
	 	 arrayListFornecedor.add(i,fornecedor);
	 	 }
	     
	     
	   
		  
	     
	     
	     private int getId(Integer idFornecedor) {
				int aux = -1;
				boolean aux1 = false;
				for (int i = 0; !aux1 && (i < id); i = i + 1) {
					if (arrayListFornecedor.get(i).equals(idFornecedor)) {
						aux = i;
						aux1 = true;
					}
				}
				return aux;
			}
		   
	    }
		   
		   
		   
	   
