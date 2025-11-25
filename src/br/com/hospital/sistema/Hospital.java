package br.com.hospital.sistema;

import br.com.hospital.entidades.Medico;
import br.com.hospital.entidades.Paciente;
import br.com.hospital.interfaces.Gerenciavel;

import java.util.ArrayList;
import java.util.List;

public class Hospital implements Gerenciavel {
    private List<Medico> medicosRegistrados;
    private List<Paciente> pacientesRegistrados;

    public Hospital (){
        this.medicosRegistrados = new ArrayList<>();
        this.pacientesRegistrados = new ArrayList<>();
    }

    @Override
    public void adicionar(Object elemento) {

    }

    @Override
    public void listar() {

    }

    @Override
    public Object buscar(String identificador) {
        return null;
    }

    @Override
    public boolean editar(String identificador, Object novoElemento) {
        return false;
    }

    @Override
    public boolean remover(String identificador) {
        return false;
    }
}
