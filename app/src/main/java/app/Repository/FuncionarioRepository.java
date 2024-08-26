package app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import app.Entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	public List<Funcionario> findByNome(String nome);
	
	public List<Funcionario> findByIdade(int idade);
}
