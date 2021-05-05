/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author 20171tpmi0371
 */
public class Vaga {
    private int idVaga;
    private String idSetor;
    private String dscVaga;
    private Boolean statusVaga; 

    public String getDscVaga() {
        return dscVaga;
    }

    public void setDscVaga(String dscVaga) {
        this.dscVaga = dscVaga;
    }

    public Boolean getStatusVaga() {
        return statusVaga;
    }

    public void setStatusVaga(Boolean statusVaga) {
        this.statusVaga = statusVaga;
    }

    public int getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(int idVaga) {
        this.idVaga = idVaga;
    }

    public String getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(String idSetor) {
        this.idSetor = idSetor;
    }
}
