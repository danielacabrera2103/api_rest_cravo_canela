package br.com.cravoecanela.cravocanela.service;

import java.util.ArrayList;

import br.com.cravoecanela.cravocanela.model.HospedagemTipo;

public interface IHospedagemTipoService {
	public HospedagemTipo criarHospedagemTipo(HospedagemTipo novo);

	public HospedagemTipo updateHospedagemTipo(HospedagemTipo dados);

	public ArrayList<HospedagemTipo> listarHospedagemTipos();

	public HospedagemTipo hospedagemTipoPorId(Integer id);

	public void deletarHospedagemTipo(Integer id);

}
