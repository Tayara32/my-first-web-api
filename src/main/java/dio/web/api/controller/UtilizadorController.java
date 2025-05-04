package dio.web.api.controller;

import dio.web.api.model.Utilizador;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UtilizadorController {

    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<Utilizador> getUtilizador() {
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public Utilizador getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
         repository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody Utilizador utilizador) {
        repository.save(utilizador);

    }

    @PutMapping
    public void putUser(@RequestBody Utilizador utilizador) {
        repository.save(utilizador);
    }
}
