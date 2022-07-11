package br.com.lucas;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;


@OpenAPIDefinition(info = @Info(description = "Conjunto de end point ",title = "luck",version = "0.0.2",contact = @Contact(name = "Lucas Trindade Da Silva",email = "lucasdevjava@gmail.com")))
@ApplicationPath("/api")
public  class Luck extends  Application {
    
}
