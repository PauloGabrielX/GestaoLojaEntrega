package app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.Entity.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{

	public List<Venda> findByEndereco(String endereco);
}
