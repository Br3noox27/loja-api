package br.com.loja.lojaapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 

    private String nome;
    private int precoCentavos;
    private int estoque;

    protected Produto () {

    }

    public Produto(String nome, int precoCentavos, int estoque) {
        this.nome = nome;
        this.precoCentavos = precoCentavos;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public int getPrecoCentavos() {
        return precoCentavos;
    }

    public int getEstoque() {
        return estoque;
    }
}
