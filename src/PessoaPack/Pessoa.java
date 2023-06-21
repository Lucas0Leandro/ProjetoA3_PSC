package PessoaPack;

public class Pessoa {
    
    protected String nome;
    protected String sobrenome;
    protected String CPF;
    protected String fone;
    protected String endereço;
    protected int cep;
    
    //Usando o get para podemos utilizar em outros package de forma publica 

    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public String getCPF(){
        return CPF;
    }
    public String getfone(){
        return fone;
    }
    public String getendereço(){
        return endereço;
    }
    public int getcep(){
        return cep;
    }
}

