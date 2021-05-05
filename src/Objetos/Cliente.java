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
public class Cliente {
    private String cpfCliente;
    private String nomeCliente;
    private String enderecoCliente;
    private String telefoneCliente;
    private String dscCargo;
    private boolean statusInadimplencia;

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getDscCargo() {
        return dscCargo;
    }

    public void setDscCargo(String dscCargo) {
        this.dscCargo = dscCargo;
    }

    public boolean getStatusInadimplencia() {
        return statusInadimplencia;
    }

    public void setStatusInadimplencia(boolean statusInadimplencia) {
        this.statusInadimplencia = statusInadimplencia;
    }


}
