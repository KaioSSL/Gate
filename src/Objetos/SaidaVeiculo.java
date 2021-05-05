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
public class SaidaVeiculo {
    private int idTicket;
    private String horaEntrada;
    private String placaVeiculo;
    private String horaSaida;
    private double valor;
    private Double cpfCliente;

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

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Double getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(Double cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    
}
