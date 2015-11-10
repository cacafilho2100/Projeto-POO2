package com.fafica.fornecedor;
import java.util.ArrayList;

public class ControladorFornecedor {
	
	private IRepositorioFornecedor repositorioFornecedor;
	
	
	public ControladorFornecedor(){
		this.repositorioFornecedor = new RepositorioFornecedorArrayList();
		
	}
	public void cadastrar(Fornecedor fornecedor){
		if (fornecedor == null) throw new IllegalArgumentException("Fornecedor Inválido.");
	    if (!IdFornecedor.idFornecedor(fornecedor.getIdFornecedor())) throw new IdInvalidoException(fornecedor.getIdFornecedor());
	    if (fornecedor.getNomeFornecedor().equals("")) throw new CampoObritarorioInvalidoException("Nome");
		repositorioFornecedor.cadastrar(fornecedor);
	}

	
	public void atualizar(Fornecedor fonecedor){
		
	}
}
