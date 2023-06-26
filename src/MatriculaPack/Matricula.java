package MatriculaPack;

import java.sql.Date;

public class Matricula {

    private int id;
    private Date data;
    private boolean validada;
    private Date expira;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public boolean isValidada() {
        return validada;
    }
    public void setValidada(boolean validada) {
        this.validada = validada;
    }
    public Date getExpira() {
        return expira;
    }
    public void setExpira(Date expira) {
        this.expira = expira;
    }
}
