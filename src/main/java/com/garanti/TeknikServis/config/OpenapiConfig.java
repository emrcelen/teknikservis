package com.garanti.TeknikServis.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Component
public class OpenapiConfig {

    @Bean
    public OpenAPI teknikservisOpenAPI () {
        return new OpenAPI()
                .info(new Info()
                        .title("Teknik Servis")
                        .description("Randevu, satış, alım ve bakım hizmetlerini gerçekleştirir.")
                        .version("1.0.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                        )
                .externalDocs(new ExternalDocumentation()
                        .description("Teknik Servis Project Documentation")
                        .url("https://springdoc.org/"));
    }

}