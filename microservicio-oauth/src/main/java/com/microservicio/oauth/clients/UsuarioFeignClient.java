package com.microservicio.oauth.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.microservicio.usuarios.commons.models.entity.Usuario;

@FeignClient(name="servicio-usuarios")
public interface UsuarioFeignClient {
	
	@GetMapping("/usuario/search/buscar-username")
	public Usuario findByUsername(@RequestParam String username);
	
	/*@PutMapping("/usuario/{id}")
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id);*/
}
