package br.com.hospital.entidades;

public abstract class Pessoa {
    private int  id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco; //Pode ser dividido em outras variaveis como: cidade, bairro, rua e número (mas talvez fique exagerado)

    public Pessoa(int id, String nome, String cpf, String telefone, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public void exibirInformacoes(){
        System.out.printf("""
                Dados pessoais:
                Id: %d
                Nome: %s
                CPF: %s
                Telefone: %s
                Email: %s
                Endereco: %s
                """, getId(), getNome(), getCpf(), getTelefone(), getEmail(), getEndereco());
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
