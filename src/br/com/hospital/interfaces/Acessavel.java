package br.com.hospital.interfaces;

public interface Acessavel {
    String getNivelAcesso();

    boolean temPermissao(String acao);
}
