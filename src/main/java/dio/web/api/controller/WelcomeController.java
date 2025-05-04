package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* com o @RestController a classe vai entender que deve atender requisições web (HTTP) e retornar dados e não páginas HTML
* Diz que a classe é uma API REST e devolve dados (JSON, texto, etc.)
* a annotation @GetMapping vai responder a uma requisição HTTP do tipo GET
* */

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Welcome to my Spring Boot Wep API";
    }
}
