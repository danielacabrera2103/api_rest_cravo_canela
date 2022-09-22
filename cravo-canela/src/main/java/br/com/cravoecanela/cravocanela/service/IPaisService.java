package br.com.cravoecanela.cravocanela.service;

import java.util.ArrayList;

import br.com.cravoecanela.cravocanela.model.Pais;

public interface IPaisService {
	public Pais criarPais(Pais novo);
	public Pais updatePais(Pais dados);
	public ArrayList<Pais> listarPaises();
	public Pais paisPorId(Integer id);
	public void deletarPais(Integer id);

}

