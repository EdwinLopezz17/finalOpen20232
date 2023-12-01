package com.kaeser.platmform.si729ebu20201b051.shared.infrastructure.documentation.openapi.configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI incidentOpenApi(){
        return new OpenAPI()
                .info(new Info().title("Examen final API Documentation Swagger")
                        .description(
                                "Examen final API REST documentation")
                        .version("v1.0.0")
                        .license(new License().name("Apache 2.0").url("https://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Song platform wiki Documentation")
                        .url("https://Song-platform.wiki.github.org/docs"));
    }
}