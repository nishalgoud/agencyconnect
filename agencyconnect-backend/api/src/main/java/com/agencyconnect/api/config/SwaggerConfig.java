package com.agencyconnect.api.config;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Agency Connect API")
                        .description("API for Agency Connect is a B2B application designed for managing users, organizations, and agencies.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("API Support")
                                .url("http://example.com/contact")
                                .email("nishalgoudbaddam17@gmail.com")));


    }
}
