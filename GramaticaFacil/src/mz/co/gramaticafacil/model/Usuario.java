package mz.co.gramaticafacil.model;

public class Usuario {

    private int id, pontuacaoTotal;
    private String nome, senha;

    public Usuario(int id, String nome, String senha) {
        this.id = id;
        this.pontuacaoTotal =0;
        this.nome = nome;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public int getPontuacaoTotal() {
        return pontuacaoTotal;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setPontuacaoTotal(int pontuacaoTotal) {
        this.pontuacaoTotal = pontuacaoTotal;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
