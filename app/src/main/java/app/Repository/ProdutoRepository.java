package app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.Entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findByNome(String nome);
	
	public List<Produto> findByValor(Double valor);
}
