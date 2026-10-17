package br.com.loja.lojaapi;

import org.springframework.data.jpa.repository.JpaRepository;

// TODO (Breno): escreva aqui a interface CategoriaRepository,
// no mesmo molde do ProdutoRepository (troque Produto por Categoria).

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
