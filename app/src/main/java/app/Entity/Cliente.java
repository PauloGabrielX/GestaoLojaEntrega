package app.Entity;

import java.util.List;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Nome deve ser inserido!")
	private String nome;

	@CPF(message = "CPF inválido")
	@Pattern(regexp = "\\d{11}", message = "O CPF deve ter exatamente 11 dígitos numéricos")
	private String cpf;

	@Positive(message = "A idade deve ser um número positivo")
	@NotNull(message = "A idade não pode ser nula")
	private int idade;

	@NotBlank(message = "O número de telefone não pode ser nulo ou vazio")
	private String telefone;

	@OneToMany(mappedBy = "cliente")
	@JsonIgnore
	private List<Venda> venda;
}
