package EduPack;

import java.sql.Time;

public class Turmas {

    private int id;
    private int semestre;
    private int ano;
    private String tipo;
    private String horario;

    //Usando o get para podemos utilizar em outros package de forma publica

    public Turmas(){
        
    }

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
    public String getHorario(){
        return horario;
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

    public void setHorario(String horario) {
        this.horario = horario;
    }
}


