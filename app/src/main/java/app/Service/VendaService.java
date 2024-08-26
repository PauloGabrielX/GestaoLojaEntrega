package app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.Entity.Venda;
import app.Repository.VendaRepository;

@Service
public class VendaService {

	@Autowired
	private VendaRepository vendaRepository;

	public String save(Venda venda) {
		this.vendaRepository.save(venda);
		return "Venda salva com sucesso!";
	}

	public String update(Venda venda, long id) {
		venda.setId(id);
		this.vendaRepository.save(venda);
		return "Venda Atualizada com sucesso!";
	}

	public String delete(long id) {
		this.vendaRepository.deleteById(id);
		return "Venda Deletada com sucesso!";
	}

	public List<Venda> findAll() {
		List<Venda> lista = this.vendaRepository.findAll();
		return lista;
	}

	public Venda findbyId(long id) {
		Venda venda = this.vendaRepository.findById(id).get();
		return venda;
	}
	
	public List<Venda> findByEndereco(String endereco){
		return this.vendaRepository.findByEndereco(endereco);
	}
}
