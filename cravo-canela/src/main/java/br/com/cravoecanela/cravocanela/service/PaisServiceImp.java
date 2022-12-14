package br.com.cravoecanela.cravocanela.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cravoecanela.cravocanela.dao.PaisDao;
import br.com.cravoecanela.cravocanela.model.Pais;


@Service
public class PaisServiceImp implements IPaisService {
	@Autowired
	private PaisDao dao;

	@Override
	public Pais criarPais(Pais novo) {
		if (novo.getPaisNome() != null) {
			return dao.save(novo);
		}
		return null;
	}

	@Override
	public Pais updatePais(Pais dados) {
		if (dados.getPaisId() != null && dados.getPaisNome() != null) {
			return dao.save(dados);
		}
		return null;
	}

	@Override
	public ArrayList<Pais> listarPaises() {
		return (ArrayList<Pais>) dao.findAll();
	}

	@Override
	public Pais paisPorId(Integer id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void deletarPais(Integer id) {
		dao.deleteById(id);

	}

}
