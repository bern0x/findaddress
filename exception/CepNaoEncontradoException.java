package br.com.alura.findcep.exception;

public class CepNaoEncontradoException extends RuntimeException {

    private String mensagem;

    public CepNaoEncontradoException(String mensage) {
        this.mensagem = mensagem;
        }

    public String getMessage(){
        return this.mensagem;
    }
}
