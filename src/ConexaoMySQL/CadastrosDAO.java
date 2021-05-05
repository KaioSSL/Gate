/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoMySQL;

import Objetos.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SynMcall
 */
public class CadastrosDAO {
    
    public static void cadastrarClientes(Cliente cliente){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Cliente(cpfCliente,nomeCliente,enderecoCliente,telefoneCliente,dscCargo,statusInadimplencia) VALUES(?,?,?,?,?,?)");
            stmt.setString(1,cliente.getCpfCliente());
            stmt.setString(2,cliente.getNomeCliente());
            stmt.setString(3,cliente.getEnderecoCliente());
            stmt.setString(4,cliente.getTelefoneCliente());
            stmt.setString(5,cliente.getDscCargo());
            stmt.setBoolean(6,cliente.getStatusInadimplencia());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo Com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Dados já Existentes! "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }
        
        
        
    }
    public static void cadastrarFuncionarios(Funcionario funcionario){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Funcionario(cpfFuncionario,nomeFuncionario,enderecoFuncionario,telefoneFuncionario,dscPerfil,login,senha) VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1,funcionario.getCpfFuncionario());
            stmt.setString(2,funcionario.getNomeFuncionario());
            stmt.setString(3,funcionario.getEnderecoFuncionario());
            stmt.setString(4,funcionario.getTelefoneFuncionario());
            stmt.setString(5,funcionario.getDscPerfil());
            stmt.setString(6,funcionario.getLogin());
            stmt.setString(7,funcionario.getSenha());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Dados já existentes");
        }finally{
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
    }
    
        
        
    }
    public static void atualizarCliente(Cliente cliente,String chaveAtualizar){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE Cliente SET cpfCliente = ?, nomeCliente = ?, enderecoCliente = ?, telefoneCliente = ?,dscCargo = ? WHERE cpfCliente = ?");
            stmt.setString(1,cliente.getCpfCliente());
            stmt.setString(2,cliente.getNomeCliente());
            stmt.setString(3,cliente.getEnderecoCliente());
            stmt.setString(4,cliente.getTelefoneCliente());
            stmt.setString(5,cliente.getDscCargo());
            stmt.setString(6,chaveAtualizar);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }
    
     }   
    public static void atualizarFuncionario(Funcionario funcionario,String chaveAtualizar){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE Cliente SET cpfFuncionario = ?, nomeFuncionario = ?, enderecoFuncionario = ?, telefoneFuncionario = ?,dscPerfil = ?, login = ?, senha = ? WHERE cpfFuncionario = ?");
            stmt.setString(1,funcionario.getCpfFuncionario());
            stmt.setString(2,funcionario.getNomeFuncionario());
            stmt.setString(3,funcionario.getEnderecoFuncionario());
            stmt.setString(4,funcionario.getTelefoneFuncionario());
            stmt.setString(5,funcionario.getDscPerfil());
            stmt.setString(6,funcionario.getLogin());
            stmt.setString(7,funcionario.getSenha());
            stmt.setString(8,chaveAtualizar);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }
    
     }
    public static void deletarFuncionario(Funcionario funcionario){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM Funcionario WHERE cpfFuncionario = ?");
            stmt.setString(1,funcionario.getCpfFuncionario());            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }
    
     }
    public static void deletarCliente(Cliente cliente){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM Cliente WHERE cpfCliente = ?");
            stmt.setString(1,cliente.getCpfCliente());           
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido Com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }
    
     }  
    public static void cadastrarSetor(Setor setor){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Setor(idSetor,dscSetor) VALUES (?,?)");
            stmt.setInt(1, setor.getIdSetor());
            stmt.setString(2,setor.getDscSetor());
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }
        
    }
    public static void cadastrarVaga(Vaga vaga){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Vaga(idVaga,dscVaga,fk_idSetor,statusVaga) VALUES(?,?,?,?");
            stmt.setInt(1, vaga.getIdVaga());
            stmt.setString(2,vaga.getDscVaga());
            stmt.setString(3,vaga.getIdSetor());
            stmt.setBoolean(4,vaga.getStatusVaga());
            
            stmt.executeUpdate();            
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar Vaga "+ex);
        }
        
    }
    public static void atualizarVaga(Vaga vaga,String chaveAtualizar){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE Vaga SET idVaga=? ,dscVaga = ?, fk_idSetor = ?,statusVaga = ? WHERE idVaga =?");
            stmt.setInt(1, vaga.getIdVaga());
            stmt.setString(2,vaga.getDscVaga());
            stmt.setString(3,vaga.getIdSetor());
            stmt.setBoolean(4,vaga.getStatusVaga());
            
            stmt.executeUpdate();            
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar Vaga "+ex);
     }
    }
    public static void deletarVaga(Vaga vaga){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM Vaga WHERE idVaga = ?");
            stmt.setInt(1,vaga.getIdVaga());           
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido Com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }
    }
}