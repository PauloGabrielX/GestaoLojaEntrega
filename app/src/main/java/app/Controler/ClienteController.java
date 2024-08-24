package app.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.Entity.Cliente;
import app.Service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Cliente cliente) {
		try {

		} catch (Exception e) {
			return new ResponseEntity<>("Falha ao salvar", HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> update(Cliente cliente, @PathVariable long id) {
		try {

		} catch (Exception e) {
			return new ResponseEntity<>("Falha ao tentar Atualizar", HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable long id) {
		try {

		} catch (Exception e) {
			return new ResponseEntity<>("Falha ao tentar Deletar", HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("/findAll")
	public ResponseEntity<List<Cliente>> findAll() {
		try {

		} catch (Exception e) {
			return new ResponseEntity<>("Falha ao salvar", HttpStatus.BAD_REQUEST);
		}
		return null;
	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<Cliente> findbyId(@PathVariable long id) {
		try {

		} catch (Exception e) {
			return new ResponseEntity<>("Falha ao salvar", HttpStatus.BAD_REQUEST);
		}
		return null;
	}

}
