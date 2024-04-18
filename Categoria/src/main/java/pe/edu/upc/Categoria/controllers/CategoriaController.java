package pe.edu.upc.Categoria.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.Categoria.dtos.CategoriaDTO;
import pe.edu.upc.Categoria.entities.Categoria;
import pe.edu.upc.Categoria.servicesinterfaces.ICategoriaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private ICategoriaService cS;

    @PostMapping
    public void insertar(@RequestBody CategoriaDTO caDTO){
        ModelMapper m=new ModelMapper();
        Categoria ca=m.map(caDTO,Categoria.class);
        cS.insert(ca);
    }
    @GetMapping
    public List<CategoriaDTO> listar(){
        return cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,CategoriaDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody CategoriaDTO categoriaDTO){
        ModelMapper m=new ModelMapper();
        Categoria c=m.map(categoriaDTO,Categoria.class);
        cS.insert(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public CategoriaDTO listarId(@PathVariable("id")Integer id) {
        ModelMapper m=new ModelMapper();
        CategoriaDTO dto=m.map(cS.listId(id), CategoriaDTO.class);
        return dto;
    }





}
