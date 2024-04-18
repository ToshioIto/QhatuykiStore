package pe.edu.upc.Categoria.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.Categoria.entities.Categoria;
import pe.edu.upc.Categoria.repositories.ICategoriaRepository;
import pe.edu.upc.Categoria.servicesinterfaces.ICategoriaService;

import java.util.List;
@Service

public class CategoriaServiceImplement implements ICategoriaService {

    @Autowired
    private ICategoriaRepository cR;
    @Override
    public void insert(Categoria categoria){
        cR.save(categoria);
    }

    @Override
    public List<Categoria> list() {
        return cR.findAll();
    }


    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        cR.deleteById(id);
    }

    @Override
    public Categoria listId(int id) {
        return cR.findById(id).orElse(new Categoria());

    }



}
