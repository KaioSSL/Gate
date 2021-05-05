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
public class EntradaVeiculo {
    private int idTicket;
    private String horaEntrada;
    private String idPlacaVeiculo;
    private int cpfCliente;
    private String dataEntradaVeiculo;

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getIdPlacaVeiculo() {
        return idPlacaVeiculo;
    }

    public void setIdPlacaVeiculo(String idPlacaVeiculo) {
        this.idPlacaVeiculo = idPlacaVeiculo;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    
}
