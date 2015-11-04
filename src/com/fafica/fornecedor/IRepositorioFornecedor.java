package com.fafica.fornecedor;

import java.util.ArrayList;

public interface IRepositorioFornecedor {
	
	public void cadastrar(Fornecedor fornecedor);
	public void atualizar(Fornecedor fornecedor);
	public boolean remover(Integer idFornecedor);
	public Fornecedor procurar(Integer idFornecedor);
	public boolean existe(Integer idFornecedor);
	public ArrayList<Fornecedor> listar();

}
