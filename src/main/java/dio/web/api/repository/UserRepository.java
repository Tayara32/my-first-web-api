package dio.web.api.repository;

import dio.web.api.model.Utilizador;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(Utilizador utilizador) {
        if(utilizador.getId() == null){
            System.out.println("SAVE - Recebendo o utilizador na camada de repositório");
        }else{
            System.out.println("UPDATE - Recebendo o utilizador");
        }
        System.out.println(utilizador);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id Recebendo o id: %d para excluir o utilizador", id));
        System.out.println(id);
    }

    public List<Utilizador> findAll() {
        List<Utilizador> utilizadores = new ArrayList<>();
        utilizadores.add(new Utilizador("tayara", "password"));
        utilizadores.add(new Utilizador("tay", "senhinha"));
        return utilizadores;
    }

    public Utilizador findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %id para localizar", id));
        return new Utilizador("tayara", "password");
    }

    public Utilizador findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s", username));
        return new Utilizador("tayara", "password");
    }
}
