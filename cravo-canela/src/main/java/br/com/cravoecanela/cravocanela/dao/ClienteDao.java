package br.com.cravoecanela.cravocanela.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.cravoecanela.cravocanela.model.Cliente;

public interface ClienteDao extends CrudRepository<Cliente,Integer>{

}
