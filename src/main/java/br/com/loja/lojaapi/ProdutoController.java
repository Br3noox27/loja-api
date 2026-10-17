package br.com.loja.lojaapi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    private final ProdutoRepository produtoRepository; 

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
     }

    @GetMapping("/produtos")
    public List<Produto> listar() {
        return List.of(
                new Produto("Mouse Gamer", 12990, 5),
                new Produto("Teclado", 25990, 3),
                new Produto("Monitor", 89990, 2));
    }
}
