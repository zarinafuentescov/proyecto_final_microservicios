package com.microservicio.items.models.servive;

import java.util.List;

import com.microservicio.commons.models.entity.Producto;
import com.microservicio.items.models.Item;


public interface ItemService {
	
	public List<Item> findAll();
	public Item findByid(Long id, Integer cantidad);
	
	public Producto save(Producto producto);
	
	public Producto update(Producto producto, Long id);
	
	public void delete(Long id);
}
