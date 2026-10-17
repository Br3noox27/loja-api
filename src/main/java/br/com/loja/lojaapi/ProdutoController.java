package br.com.loja.lojaapi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    private final ProdutoRepository produtoRepository; 

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
     }
    
    @PostMapping("/produtos")
    public Produto cadastra(@RequestBody Produto cadastrar ) {
        return produtoRepository.save(cadastrar);
    }

    @GetMapping ("/produtos")
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }

}
