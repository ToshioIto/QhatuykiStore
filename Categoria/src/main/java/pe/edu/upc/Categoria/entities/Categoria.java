package pe.edu.upc.Categoria.entities;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.Query;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;
    @Column(name = "nombre")
    private  String nombre;
    @Column(name = "descripcion")
    private  String descripcion;


    public Categoria(int idCategoria, String nombre, String descripcion){
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;

    }


    public Categoria(){
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
