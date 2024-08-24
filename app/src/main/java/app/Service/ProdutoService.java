package app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.Entity.Produto;
import app.Repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public String save(Produto produto) {
		this.produtoRepository.save(produto);
		return "Produto salvo com sucesso!";
	}

	public String update(Produto produto, long id) {
		produto.setId(id);
		this.produtoRepository.save(produto);
		return "produto Atualizado com sucesso!";
	}

	public String delete(long id) {
		this.produtoRepository.deleteById(id);
		return "Produto Deletado com sucesso!";
	}

	public List<Produto> findAll() {
		List<Produto> lista = this.produtoRepository.findAll();
		return lista;
	}

	public Produto findbyId(long id) {
		Produto produto = this.produtoRepository.findById(id).get();
		return produto;
	}

}
