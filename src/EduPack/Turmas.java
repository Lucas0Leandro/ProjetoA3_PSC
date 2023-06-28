package EduPack;


public class Turmas {

    private int id, semestre, ano, curso, professor, sala;
    private String hora;


    public Turmas(int id, int semestre, int ano, int curso, int professor, int sala, String hora) {
        this.id = id;
        this.semestre = semestre;
        this.ano = ano;
        this.hora = hora;
        this.curso = curso;
        this.professor = professor;
        this.sala = sala;
    }

    //Usando o get para podemos utilizar em outros package de forma publica
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getSemestre() {
        return semestre;
    }


    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    public int getCurso() {
        return curso;
    }


    public void setCurso(int curso) {
        this.curso = curso;
    }


    public int getProfessor() {
        return professor;
    }


    public void setProfessor(int professor) {
        this.professor = professor;
    }


    public int getSala() {
        return sala;
    }


    public void setSala(int sala) {
        this.sala = sala;
    }


    public String getHora() {
        return hora;
    }


    public void setHora(String hora) {
        this.hora = hora;
    }

    
}


