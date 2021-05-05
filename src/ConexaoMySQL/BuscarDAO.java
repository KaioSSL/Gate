/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoMySQL;

import Objetos.Cliente;
import Objetos.Funcionario;
import Objetos.Vaga;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SynMcall
 */
public class BuscarDAO {
 
    public List<Cliente> tabelaCliente(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Cliente> clientes = new ArrayList<>();
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Cliente");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setCpfCliente(rs.getString("cpfCliente"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setEnderecoCliente(rs.getString("enderecoCliente"));
                cliente.setTelefoneCliente(rs.getString("telefoneCliente"));
                cliente.setDscCargo(rs.getString("dscCargo"));
                cliente.setStatusInadimplencia(rs.getBoolean("statusInadimplencia"));
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar! "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return clientes;
    }  
    public List<Funcionario> tabelaFuncionario(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Funcionario> funcionarios = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Funcionario");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Funcionario funcionario = new Funcionario();
                funcionario.setCpfFuncionario(rs.getString("cpfFuncionario"));
                funcionario.setNomeFuncionario(rs.getString("nomeFuncionario"));
                funcionario.setEnderecoFuncionario(rs.getString("enderecoFuncionario")); 
                funcionario.setTelefoneFuncionario(rs.getString("telefoneFuncionario"));                               
                funcionario.setDscPerfil(rs.getString("dscPerfil"));
                funcionario.setLogin(rs.getString("login"));
                funcionario.setSenha(rs.getString("senha"));
                funcionarios.add(funcionario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar! "+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt,rs);
        }
        return funcionarios;
        
    }
    public List<Vaga> tabelaVaga(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Vaga> vagas = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Vaga");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Vaga vaga = new Vaga();
                vaga.setIdVaga(rs.getInt("idVaga"));
                vaga.setDscVaga(rs.getString("dscVaga"));
                vaga.setIdSetor(rs.getString("fk_idSetor"));
                vaga.setStatusVaga(rs.getBoolean("statusVaga"));
                vagas.add(vaga); 
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar! "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return vagas;  
    } 
    public static int vagasDisponiveis(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int vagas = 0;
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT count(idVaga) FROM Vaga WHERE statusVaga = true");
            rs = stmt.executeQuery();
            vagas = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt,rs);
            
        }
        
        return vagas;
        
    }
    public static int vagasOcupadas(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int vagas = 0;
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT count(idVaga) FROM Vaga WHERE statusVaga = false");
            rs = stmt.executeQuery();
            vagas = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt,rs);
            
        }
        return vagas;
    }
    public Boolean funcionarioExiste(String login, String senha){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Funcionario> funcionarios = new ArrayList<>();
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT login,senha FROM Funcionario WHERE login = ?,senha = ?");
            stmt.setString(1,login);
            stmt.setString(2,senha);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Funcionario funcionario = new Funcionario();
                funcionario.setLogin(rs.getString("login"));
                funcionario.setSenha(rs.getString("senha"));
                funcionarios.add(funcionario);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(BuscarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt, rs);
    }
    if(funcionarios.size() == 0){
         return false;   
     }else{
        return true;
    }   
        
    }
}

