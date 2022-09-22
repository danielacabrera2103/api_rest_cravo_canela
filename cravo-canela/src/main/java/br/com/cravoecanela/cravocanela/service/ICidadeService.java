package br.com.cravoecanela.cravocanela.service;

import java.util.ArrayList;

import br.com.cravoecanela.cravocanela.model.Cidade;

public interface ICidadeService {
	public Cidade criarCidade(Cidade novo);
	public Cidade updateCidade(Cidade dados);
	public ArrayList<Cidade> listarCidades();
	public Cidade cidadePorId(Integer id);
	public void deletarCidade(Integer id);

}
