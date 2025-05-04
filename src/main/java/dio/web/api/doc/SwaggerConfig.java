package dio.web.api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Minha API REST com Spring Boot")
                        .version("1.0")
                        .description("Documentação da API criada como parte do meu estudo com Springdoc + Swagger")
                        .contact(new Contact()
                                .name("Tayara Cruz")
                                .email("tayara.gomes@gmail.com")
                                .url("https://www.linkedin.com/in/tayara-cruz-0b055970/")));
    }
}
