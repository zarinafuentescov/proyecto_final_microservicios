package com.microservicio.usuario;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.microservicio.usuarios.commons.models.entity.Role;
import com.microservicio.usuarios.commons.models.entity.Usuario;



@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		config.exposeIdsFor(Usuario.class, Role.class);
	
	}

}
