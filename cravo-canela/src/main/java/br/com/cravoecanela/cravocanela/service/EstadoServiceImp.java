package br.com.cravoecanela.cravocanela.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cravoecanela.cravocanela.dao.EstadoDao;
import br.com.cravoecanela.cravocanela.model.Estado;

@Service
public class EstadoServiceImp implements IEstadoService {
	@Autowired
	private EstadoDao dao;

	@Override
	public Estado criarEstado(Estado novo) {
		return dao.save(novo);

	}

	@Override
	public Estado updateEstado(Estado dados) {
		if (dados.getEstadoId() != null) {
			return dao.save(dados);
		}
		return null;
	}

	@Override
	public ArrayList<Estado> listarEstados() {
		return (ArrayList<Estado>) dao.findAll();
	}

	@Override
	public Estado estadoPorId(Integer id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void deletarEstado(Integer id) {
		dao.deleteById(id);

	}

}
