package mz.co.gramaticafacil.model;

public class Questao {

    private String enunciado,opcaoA,opcaoB,opcaoC,opcaoD,explicacao;
    private char respostaCerta;

    public Questao(String enunciado, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String explicacao, char respostaCerta) {
        this.enunciado = enunciado;
        this.opcaoA = opcaoA;
        this.opcaoB = opcaoB;
        this.opcaoC = opcaoC;
        this.opcaoD = opcaoD;
        this.explicacao = explicacao;
        this.respostaCerta = respostaCerta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getOpcaoA() {
        return opcaoA;
    }

    public String getOpcaoB() {
        return opcaoB;
    }

    public String getOpcaoC() {
        return opcaoC;
    }

    public String getOpcaoD() {
        return opcaoD;
    }

    public String getExplicacao() {
        return explicacao;
    }

    public char getRespostaCerta() {
        return respostaCerta;
    }
    
    
    
    
}
