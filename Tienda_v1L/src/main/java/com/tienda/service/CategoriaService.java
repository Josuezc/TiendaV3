package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    // Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);
    
    //se obtiene un Categoria, a partir del id de un Categoria 
    public Categoria getCategoria(Categoria categoria);
    
    //se inserta un nuevo categoria si el id del categoria esta vacio
    //se actualiza un categoria si el id del categoria NO esta vacio
    public  void save(Categoria categoria);
    
    //Se eliimina el categoria que tiene el id pasado por parametro 
    public void delete(Categoria categoria);
    
    
 
}