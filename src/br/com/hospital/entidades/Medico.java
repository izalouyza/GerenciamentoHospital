package br.com.hospital.entidades;

import br.com.hospital.exceptions.MedicoException;
import br.com.hospital.exceptions.PessoaException;
import br.com.hospital.interfaces.Validavel;

public class Medico extends Pessoa implements Validavel {
    private String crm;
    private String especialidade;

    public Medico(int id, String nome, String cpf, String telefone, String email, String endereco,String senha, String nivelAcesso,
                  String crm, String especialidade) throws MedicoException, PessoaException {
        super(id, nome, cpf, telefone, email, endereco,senha, nivelAcesso);

        if (crm==null || crm.length() < 4) {
            throw new MedicoException("CRM inválido!");
        }

        if (especialidade==null || especialidade.isBlank()) {
            throw new MedicoException("Especialidade não pode Ser vazia!");
        }

        this.crm = crm;
        this.especialidade = especialidade;
    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf("""
                
                Dados profissionais:
                CRM: %s
                Especialidade: %s
                """, getCrm(), getEspecialidade());
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public boolean validar() {
        if (getNome() == null || getNome().isBlank()) {
            return false;
        }

        if (getCpf() == null || getCpf().length() != 11) {
            return false;
        }

        if (crm == null || crm.isBlank()) {
            return false;
        }

        if (crm.length() < 4 || crm.length() > 10) {
            return false;
        }

        if (especialidade == null || especialidade.isBlank()) {
            return false;
        }
        return true;
    }

    @Override
    public String getMensagemValidacao() {
        if (getNome() == null || getNome().isBlank()) {
            return "Nome inválido.";
        }

        if (getCpf() == null || getCpf().length() != 11) {
            return "CPF inválido. Deve conter 11 dígitos.";
        }

        if (crm == null || crm.isBlank()) {
            return "CRM não pode ser vazio.";
        }

        if (crm.length() < 4 || crm.length() > 10) {
            return "CRM inválido. Deve ter entre 4 e 10 caracteres.";
        }

        if (especialidade == null || especialidade.isBlank()) {
            return "Especialidade não pode ser vazia.";
        }
        return "Médico válido.";
    }
}
