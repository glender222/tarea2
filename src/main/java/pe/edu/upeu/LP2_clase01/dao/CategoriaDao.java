package pe.edu.upeu.LP2_clase01.dao;

import java.util.List;


import pe.edu.upeu.LP2_clase01.entity.Categoria;

public interface CategoriaDao {
	Categoria create(Categoria c);
    Categoria update(Categoria c);
    void delete(Long id);
    Categoria read(Long id);
    List<Categoria> readAll(); 

}
