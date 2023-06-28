package EduPack;


public class Turmas {

    private int id;
    private int semestre;
    private int ano;
    private String hora, curso, alunos, professor, sala;


    public Turmas(int id, int semestre, int ano, String hora, String curso, String alunos, String professor, String sala) {
        this.id = id;
        this.semestre = semestre;
        this.ano = ano;
        this.hora = hora;
        this.curso = curso;
        this.alunos = alunos;
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


    public String getHora() {
        return hora;
    }


    public void setHora(String hora) {
        this.hora = hora;
    }


    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }


    public String getAlunos() {
        return alunos;
    }


    public void setAlunos(String alunos) {
        this.alunos = alunos;
    }


    public String getProfessor() {
        return professor;
    }


    public void setProfessor(String professor) {
        this.professor = professor;
    }


    public String getSala() {
        return sala;
    }


    public void setSala(String sala) {
        this.sala = sala;
    }


    
    
}


