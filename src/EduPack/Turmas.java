package EduPack;

import java.sql.Time;

public class Turmas {

    private int id;
    private int semestre;
    private int ano;
    private char tipo;
    private Time horario;

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
    public char getTipo(){
        return tipo;
    }
    public Time getHorario(){
        return horario;
    }
}


