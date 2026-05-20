package br.com.alura.findcep.exception;

public class CepInvalidoException extends RuntimeException {

    private String mensagem;

    public CepInvalidoException(String mensage) {
        this.mensagem = mensage;
    }

    public String getMessagem() {
        return this.mensagem;
    }
}
