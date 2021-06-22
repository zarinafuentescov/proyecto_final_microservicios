package com.microservicio.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.microservicio.commons.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
