package mz.co.gramaticafacil.service;

import java.util.ArrayList;
import mz.co.gramaticafacil.model.Questao;
import mz.co.gramaticafacil.model.Usuario;

public class QuizService {

    
    private Usuario usuarioAtual;
    private ArrayList<Questao> listaQuestoes;
    private int pontuacaoAtual;
    
     public QuizService(Usuario usuario) {
        this.usuarioAtual = usuario;
        this.listaQuestoes = new ArrayList<>();
        this.pontuacaoAtual = 0;
    }
     
     
     // adicionar questão ao quiz
    public void adicionarQuestao(Questao q) {
        listaQuestoes.add(q);
    }

    // responder questão
    public void responder(Questao q, char resposta) {
        if (q.getRespostaCorreta() == resposta) {
            pontuacaoAtual++;
            usuarioAtual.setPontuacaoTotal(
                usuarioAtual.getPontuacaoTotal() + 1
            );

            System.out.println("✔ Correto!");
        } else {
            System.out.println("❌ Errado!");
            System.out.println("Explicação: " + q.getExplicacao());
        }
    }

    public int getPontuacaoAtual() {
        return pontuacaoAtual;
    }
}
