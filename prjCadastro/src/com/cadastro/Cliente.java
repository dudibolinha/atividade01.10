package com.cadastro;

/**
 *
 * @author Eduardo
 */
public class Cliente {
    
    private int id;
    private String Nome;
    private String CPF;
    private String Endereco;
    private String Cidade;
    private String Estado;

    public Cliente() {
    }

    public Cliente(int id, String Nome, String CPF, String Endereco, String Cidade, String Estado) {
        this.id = id;
        this.Nome = Nome;
        this.CPF = CPF;
        this.Endereco = Endereco;
        this.Cidade = Cidade;
        this.Estado = Estado;        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    
    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }
    
    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }    
    
}
