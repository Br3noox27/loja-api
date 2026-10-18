package br.com.loja.lojaapi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class CategoriaController {
    
    private final CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @PostMapping("/categorias")
    public Categoria cadastra(@RequestBody Categoria cadastrar ) {
        return categoriaRepository.save(cadastrar);
    }

    @GetMapping ("/categorias")
    public List<Categoria> Listar() {
        return categoriaRepository.findAll();
    }
}
