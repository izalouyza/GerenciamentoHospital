package br.com.hospital.entidades;

public class Paciente extends Pessoa {
    private int idade;
    private String historicoClinico;

    public Paciente(int id, String nome, String cpf, String telefone, String email, String endereco, int idade, String historicoClinico) {
        super(id, nome, cpf, telefone, email, endereco);
        this.idade = idade;
        this.historicoClinico = historicoClinico;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.printf("""
                
                Dados clínicos:
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

}
