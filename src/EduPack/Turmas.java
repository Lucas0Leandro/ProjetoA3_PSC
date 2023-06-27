package EduPack;


public class Turmas {

    private int id;
    private int semestre;
    private int ano;
    private String hora, tipo;


    public Turmas(int id, int semestre, int ano, String hora, String tipo) {
        this.id = id;
        this.semestre = semestre;
        this.ano = ano;
        this.hora = hora;
        this.tipo = tipo;
    }
    

    //Usando o get para podemos utilizar em outros package de forma publica
    public int getID(){
        return id;
    }
    public int getSemestre(){
        return semestre;
    }
    public int getAno(){
        return ano;
    }
    public String getTipo(){
        return tipo;
    }
    public String getHora(){
        return hora;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}


