package br.com.hospital.entidades;

import br.com.hospital.exceptions.PacienteException;
import br.com.hospital.exceptions.PessoaException;
import br.com.hospital.interfaces.Validavel;

public class Paciente extends Pessoa implements Validavel {
    private int idade;
    private String historicoClinico;

    public Paciente(int id, String nome, String cpf, String telefone, String email, String endereco,String senha, String nivelAcesso, int idade, String historicoClinico) throws PacienteException, PessoaException {
        super(id, nome, cpf, telefone, email, endereco,senha,nivelAcesso);

        if (idade <= 0 || idade >= 120) {
            throw new PacienteException("Idade inválida!");
        }

        if (historicoClinico == null || historicoClinico.isBlank()) {
            throw new PacienteException("Histórico Clínico não pode ser vazio!");
        }

        this.idade = idade;
        this.historicoClinico = historicoClinico;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.printf("""
                
                Dados Clínicos:
                Idade: %d
                Histórico Clínico: %s
                """, getIdade(), getHistoricoClinico());
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHistoricoClinico() {
        return historicoClinico;
    }

    public void setHistoricoClinico(String historicoClinico) {
        this.historicoClinico = historicoClinico;
    }

    @Override
    public boolean validar() {
        if(getNome() == null || getNome().isBlank()){
            return false;
        }
        
        if(getCpf() == null || getCpf().length() != 11){
            return false;
        }

        if(idade <= 0 || idade > 120){
            return false;
        }

        if(historicoClinico == null || historicoClinico.isBlank()){
            return false;
        }
        return true;
    }

    @Override
    public String getMensagemValidacao() {
        if (getNome() == null || getNome().isBlank()) {
            return "Nome não pode ser vazio.";
        }

        if (getCpf() == null || getCpf().length() != 11) {
            return "CPF inválido. Deve conter 11 dígitos.";
        }

        if (idade <= 0 || idade > 120) {
            return "Idade inválida.";
        }

        if (historicoClinico == null || historicoClinico.isBlank()) {
            return "Histórico clínico não pode ser vazio.";
        }

        return "Paciente válido.";
    }
}
