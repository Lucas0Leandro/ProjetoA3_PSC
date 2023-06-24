package PessoaPackage;

public class Pessoa {
    
    protected String nome;
    protected String sobrenome;
    protected String CPF;
    protected String fone;
    protected String endereço;
    protected int cep;
 

    //Criando metodos de acesso

    public String getnome(){
        return nome;
    }
    public String getsobrenome(){
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
