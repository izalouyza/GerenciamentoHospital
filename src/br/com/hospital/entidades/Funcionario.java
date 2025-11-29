package br.com.hospital.entidades;

import br.com.hospital.exceptions.FuncionarioException;
import br.com.hospital.exceptions.PacienteException;

public class Funcionario extends Pessoa {
    private String cargo;
    private String setor;
    private String nivelAcesso; // Ver se é necessário o uso de nivel Acesso aqui e em Pessoa :D

    public Funcionario(int id, String nome, String cpf, String telefone, String email, String endereco,String senha, String nivelAcesso, String cargo, String setor) throws FuncionarioException, PacienteException {
        super(id, nome, cpf, telefone, email, endereco, senha, nivelAcesso);

        if (cargo==null || cargo.isBlank()) {
            throw new FuncionarioException("Cargo inválido!");
        }

        if (setor==null || setor.isBlank()) {
            throw new FuncionarioException("Setor inválido!");
        }

        this.cargo = cargo;
        this.setor = setor;
    }

    //getters e setters
    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String getSetor(){
        return setor;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    public String getNivelAcesso(){
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso){
        this.nivelAcesso = nivelAcesso;
    }

    //métodos
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.printf("""
                Cargo: %s
                Setor: %s
                Nível de Acesso: %s
                
                """, getCargo(), getSetor(), getNivelAcesso());
    }
}
