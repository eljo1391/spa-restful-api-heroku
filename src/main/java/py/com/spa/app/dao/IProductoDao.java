package py.com.spa.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import py.com.spa.app.entities.Productos;

public interface IProductoDao extends JpaRepository<Productos, Integer>{

}
