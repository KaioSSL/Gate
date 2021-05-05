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
public class Inadimplencia {
    private int idInadimplencia;
    private double valorInadimplencia;
    private String dataInicio;
    private String dataVencimento;
    private Double cpfCliente;

    public int getIdInadimplencia() {
        return idInadimplencia;
    }

    public void setIdInadimplencia(int idInadimplencia) {
        this.idInadimplencia = idInadimplencia;
    }

    public double getValorInadimplencia() {
        return valorInadimplencia;
    }

    public void setValorInadimplencia(int valorInadimplencia) {
        this.valorInadimplencia = valorInadimplencia;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(Double cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    
    
}
