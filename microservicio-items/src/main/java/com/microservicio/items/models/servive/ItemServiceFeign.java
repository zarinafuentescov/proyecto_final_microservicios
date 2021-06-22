package com.microservicio.items.models.servive;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.microservicio.commons.models.entity.Producto;
import com.microservicio.items.clientes.ProductoClienteRest;
import com.microservicio.items.models.Item;



@Service("serviceFeign")
public class ItemServiceFeign implements ItemService {
	
	@Autowired
	private ProductoClienteRest clienteFeign;

	@Override
	public List<Item> findAll() {
		
		return clienteFeign.listar().stream().map(p -> new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item findByid(Long id, Integer cantidad) {
		
		return new Item(clienteFeign.detalle(id), cantidad);
	}

	@Override
	public Producto save(Producto producto) {
		
		return clienteFeign.crear(producto);
	}

	@Override
	public Producto update(Producto producto, Long id) {

		return clienteFeign.update(producto, id);
	}

	@Override
	public void delete(Long id) {

		clienteFeign.eliminar(id);
		
	}

}
