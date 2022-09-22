package br.com.cravoecanela.cravocanela.service;

import java.util.ArrayList;

import br.com.cravoecanela.cravocanela.model.Cliente;

public interface IClienteService {
	public Cliente criarCliente(Cliente novo);

	public Cliente updateCliente(Cliente dados);

	public ArrayList<Cliente> listarClientes();

	public Cliente clientePorId(Integer id);

	public void deletarCliente(Integer id);
}
