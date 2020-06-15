package no.bjonnhy;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@SecurityScheme(name = "basicAuth", type = SecuritySchemeType.HTTP, scheme = "basic")
@OpenAPIDefinition(
    info = @Info(
        title = "api",
        version = "0.01",
        description = "API"
    ),
    servers = {
        @Server(url = "http://dev.lan")
    }
)
public class OpenApiTrigger {
    // This class only exists so we have a place to put the OpenAPIDefinition annotation.
}
