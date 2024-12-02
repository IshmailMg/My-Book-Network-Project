package com.ishmail_projects_jwt_string_angular.book_network.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
        info = @Info(
                contact =@Contact(
                        name = "Ishmail",
                        email = "ishmail.mgwena@gmail.com",
                        url = "https://github.com/ishmailmgwena/book-network"
        ),
                description = "OpenApi documentation for Spring Security Project",
                title = "OpenApi specification - Ishmail",
                version = "1.0",
                license = @License(
                        name = "Licence name",
                        url = "https://some-url.com"
                ),
                termsOfService = "Terms of service"
))
public class OpenApiConfig {
}