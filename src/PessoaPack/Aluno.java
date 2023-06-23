package PessoaPack;

public class Aluno extends Pessoa {
    
    private int ra;
    
    public Aluno()
    {
        this.nome = "Pedroa";
        this.sobrenome = "Robert";
        this.ra = 122314254;
        this.CPF = "334.183.884-85";
        this.fone = "(47) 2530-6610";
        this.endereço = "Rua Professora Inge Moy 135 | Casa | Aventureiro";
        this.cep = 89225855;
    }

    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }

}
