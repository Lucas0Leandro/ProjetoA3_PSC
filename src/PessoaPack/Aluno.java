package PessoaPack;

public class Aluno extends Pessoa {
    
    private int ra;
    

    public Aluno(int ra, String nome, String sobrenome, String cPF, String fone, String endereço, int cep) {
        super(nome, sobrenome, cPF, fone, endereço, cep);
        this.ra = ra;
    }

    
    public int getRa() {
        return ra;
    }
    
    public void setRa(int ra) {
        this.ra = ra;
    }

}
