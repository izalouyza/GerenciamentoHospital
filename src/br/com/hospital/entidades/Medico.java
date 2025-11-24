package br.com.hospital.entidades;

public class Medico extends Pessoa{
    private String crm;
    private String especialidade;

    public Medico(int id,String nome, String cpf, String telefone, String email, String crm, String especialidade) {
        super(id, nome, cpf, telefone, email);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    @Override
    public void exibirInformacoes(){
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
}
