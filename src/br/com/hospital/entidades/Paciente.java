package br.com.hospital.entidades;

public class Paciente extends Pessoa {
    private int idade;
    private String historicoClinico;
    private double temperatura;
    private String pressaoArterial;
    private int oxigenacao;

    public Paciente(int id, String nome, String cpf, String telefone, String email, int idade, String historicoClinico,  double temperatura, String pressaoArterial, int oxigenacao) {
        super(id, nome, cpf, telefone, email);
        this.idade = idade;
        this.historicoClinico = historicoClinico;
        this.temperatura = temperatura;
        this.pressaoArterial = pressaoArterial;
        this.oxigenacao = oxigenacao;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.printf("""
                
                Dados clínicos:
                Idade: %d
                Temperatura: %.2f
                Pressão Arterial: %s
                Oxigenação: %d%%
                Histórico Clínico: %s
                """, getIdade(), getTemperatura(), getPressaoArterial(), getOxigenacao(), getHistoricoClinico());
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

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(String pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public int getOxigenacao() {
        return oxigenacao;
    }
}
