package pe.edu.upc.Categoria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.Categoria.entities.Categoria;

import java.util.List;
@Repository

public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {


}
