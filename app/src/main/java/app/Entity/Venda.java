package app.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String enderecoEntrega;

	@NotNull(message = "O valor total não pode ser nulo")
	@Positive(message = "O valor total deve ser um número positivo")
	private Double valorTotal;

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("vendas")
	private Cliente cliente;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "venda_produtos")
	private List<Produto> produtos;

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("vendas")
	private Funcionario funcionario;

}
