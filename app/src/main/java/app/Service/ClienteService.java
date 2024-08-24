package app.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.Entity.Cliente;

@Service
public class ClienteService {

	public String save(Cliente cliente) {
		//
		return "Cliente salvo com sucesso!";

	}

	public String update(Cliente cliente, long id) {
		//
		return "Cliente Atualizado com sucesso!";
	}

	public String delete(long id) {

		return "Cliente Deletado com sucesso!";
	}

	public List<Cliente> findAll() {
		//
		return null;
	}

	public Cliente findbyId(long id) {
		return null;
	}

}
