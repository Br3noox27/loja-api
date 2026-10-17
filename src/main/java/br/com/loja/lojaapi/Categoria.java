package br.com.loja.lojaapi; 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 

public class Categoria {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 

    private String nome;
    private String slug; 

    protected Categoria () {

    }

    public Categoria(String nome, String slug) {
        this.nome = nome;
        this.slug = slug;
    }

    public Long getId() { return id; }
    public String getNome () { return nome; }
    public String getSlug () { return slug; }
}
 



