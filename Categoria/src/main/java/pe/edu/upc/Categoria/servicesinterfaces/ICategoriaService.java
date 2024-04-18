package pe.edu.upc.Categoria.servicesinterfaces;

import pe.edu.upc.Categoria.dtos.CategoriaDTO;
import pe.edu.upc.Categoria.entities.Categoria;

import java.util.List;

public interface ICategoriaService {

    public void insert(Categoria categoria);
    public List<Categoria> list();
    public void delete(int id);
    public Categoria listId(int id);

}
