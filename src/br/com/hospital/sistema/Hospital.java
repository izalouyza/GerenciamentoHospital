package br.com.hospital.sistema;

import br.com.hospital.entidades.Pessoa;
import br.com.hospital.interfaces.Gerenciavel;

import java.util.ArrayList;
import java.util.List;

public class Hospital implements Gerenciavel<Pessoa> {
    final private List<Pessoa> pessoasRegistradas;

    public Hospital (){
        this.pessoasRegistradas = new ArrayList<>();
    }

    @Override
    public void adicionar(Pessoa elemento) {
        pessoasRegistradas.add(elemento);
    }

    @Override
    public void listar() {
        if (pessoasRegistradas.isEmpty()) {
            System.out.println("Nenhuma pessoa registrada, não é possível listar.");
            return;
        }
        for (Pessoa pessoaListar: pessoasRegistradas){
            pessoaListar.exibirInformacoes();
        }
    }

    @Override
    public Pessoa buscar(String identificador) {
        return null;
    }

    @Override
    public boolean editar(String identificador, Pessoa novoElemento) {
        return false;
    }

    @Override
    public boolean remover(String identificador) {
        return false;
    }
}
