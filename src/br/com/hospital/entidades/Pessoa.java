package br.com.hospital.entidades;

public abstract class Pessoa {
    private int  id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public Pessoa(int id, String nome, String cpf, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public void exibirInformacoes(){
        System.out.printf("""
                Dados pessoais:
                Id: %d
                Nome: %s
                CPF: %s
                Telefone: %s
                Email: %s
                """, getId(), getNome(), getCpf(), getTelefone(), getEmail());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
