package Classes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import Util.Conexao;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;


public class Cliente {

    private String cpfCliente;
    private String nomeCliente;
    private String foneCliente;
    private String emailCliente;
    private String nrCartaoDebCred;
    private String chavePix;

    public boolean incluirCliente() {
        
        Connection con = Conexao.conectar();
        String sql  = "INSERT INTO cliente ";
               sql += "(cpfcliente, nomeCliente, foneCliente, emailCliente, nrCartaoDebCred, chavePix)";
               sql += "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, cpfCliente);
            stm.setString(2, nomeCliente);
            stm.setString(3, foneCliente);
            stm.setString(4, emailCliente);
            stm.setString(5, nrCartaoDebCred);
            stm.setString(6, chavePix);            
            stm.execute();
        }catch(SQLException ex) {           
            System.out.println("Erro: " + ex.getMessage());
            return false;
        }
        
        return true;
        
    }

    public boolean alterarCliente() {
        
        Connection con = Conexao.conectar();
        String sql  = "UPDATE cliente ";
               sql += "SET nomeCliente= ?, foneCliente= ?, emailCliente= ?, nrCartaoDebCred= ?, chavePix= ?" ;
               sql += "WHERE cpfCliente= ?";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, cpfCliente);
            stm.setString(2, nomeCliente);
            stm.setString(3, foneCliente);
            stm.setString(4, emailCliente);
            stm.setString(5, nrCartaoDebCred);
            stm.setString(6, chavePix);
            
            stm.execute();
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
            return false;
            
        }
        
        return true;
        
    }
 
    public boolean excluirCliente() {
        
        Connection con = Conexao.conectar();
        String sql  = "DELETE FROM cliente ";
               sql += "WHERE cpfCliente= ?";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, cpfCliente);
            
            stm.execute();
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
            return false;
            
        }
        
        return true;
        
     }

    public Cliente consultarCliente() {
        
        Connection con = Conexao.conectar();
        String sql  = "SELECT nomeCliente, foneCliente, emailCliente, nrCartaoDebCred, chavePix ";
               sql += "FROM cliente ";
               sql += "WHERE cpfCliente= ?;";    
        Cliente cli = null;
        
        try {  
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.cpfCliente);
            ResultSet rs = stm.executeQuery();
            
            if(rs.next()) {   
                cli = new Cliente();
                cli.setCpfCliente      (getCpfCliente());
                cli.setNomeCliente     (rs.getString("nomeCliente"));
                cli.setFoneCliente     (rs.getString("foneCliente"));
                cli.setEmailCliente    (rs.getString("emailCliente"));
                cli.setNrCartaoDebCred (rs.getString("nrCartaoDebCred"));
                cli.setChavePix        (rs.getString("chavePix"));      
            }
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
        }
        
        return cli;
        
    }

    public List<Cliente> consultarClientes() {
        
        Connection con = Conexao.conectar();
        List<Cliente> listaClientes = new ArrayList<>();
        String sql  = "SELECT cpfcliente, nomecliente, fonecliente, emailcliente, nrcartaodebcred, chavepix ";
               sql += "FROM cliente ";
               sql += "ORDER BY cpfcliente;";
        try {       
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()) { 
                Cliente cli = new Cliente();
                
                cli.setCpfCliente      (rs.getString("cpfcliente"));
                cli.setNomeCliente     (rs.getString("nomecliente"));
                cli.setFoneCliente     (rs.getString("fonecliente"));
                cli.setEmailCliente    (rs.getString("emailcliente"));
                cli.setNrCartaoDebCred (rs.getString("nrcartaodebcred"));
                cli.setChavePix        (rs.getString("chavepix"));
                
                listaClientes.add(cli);
                
            }
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
        }
        
        return listaClientes;
        
    }

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

    public String getFoneCliente() {
        return foneCliente;
    }

    public void setFoneCliente(String foneCliente) {
        this.foneCliente = foneCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getNrCartaoDebCred() {
        return nrCartaoDebCred;
    }

    public void setNrCartaoDebCred(String nrCartaoDebCred) {
        this.nrCartaoDebCred = nrCartaoDebCred;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

}