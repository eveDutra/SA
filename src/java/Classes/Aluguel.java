package Classes;

import Util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Aluguel {

    private int    idAluguel;
    private int    idVeiculo;
    private String cpfCliente;
    private String dataAluguel;
    private String dataDevolucao;
    private String dataEstimadaDevolucao;
    private boolean pagamento;

    public boolean locarVeiculo() {
        Connection con = Conexao.conectar();
        String sql  = "INSERT INTO aluguel ";
               sql += "(idAluguel, idVeiculo, cpfCliente, dataAluguel, dataDevolucao, dataEstimadaDevolucao, pagamento)";
               sql += "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setInt     (1, idAluguel);
            stm.setInt     (2, idVeiculo);
            stm.setString  (3, cpfCliente);
            stm.setString  (4, dataAluguel);
            stm.setString  (5, dataDevolucao);
            stm.setString  (6, dataEstimadaDevolucao);
            stm.setBoolean (7, pagamento);
            
            stm.execute();
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
            return false;
            
        }
        
        return true;
        
    }

    public boolean devolverVeiculo() {
        
        Connection con = Conexao.conectar();
        String sql  = "UPDATE aluguel ";
               sql += "SET dataDevolucao= ?";
               sql += "WHERE idAluguel= ? and cpfCliente= ?";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString  (1, dataDevolucao);
            stm.setInt     (2, idAluguel);
            stm.setString  (3, cpfCliente);  
            
            stm.execute();
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
            return false;
            
        }
        
        return true;
        
    }

    public boolean cancelarLocacao() {
        
        Connection con = Conexao.conectar();
        String sql  = "DELETE FROM aluguel ";
               sql += "WHERE idAluguel= ? and cpfCliente= ?";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setInt     (1, idAluguel);
            stm.setString  (2, cpfCliente);
            
            stm.execute();
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
            return false;
            
        }
        
        return true;
    }

    public List<Aluguel> consultarLocacaoCliente() {
        
        Connection con = Conexao.conectar(); 
        List<Aluguel> listaAlugueis = new ArrayList<>();
        String sql  = "SELECT *";
               sql += "FROM aluguel ";
               sql += "WHERE cpfCliente= ?";
               sql += "ORDER BY idAluguel= ? and cpfCliente= ?";
               
        
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString  (1, cpfCliente);

            ResultSet rs = stm.executeQuery();
            
            while(rs.next()) {
                
                Aluguel al = new Aluguel();
                
                al.setCpfCliente             (getCpfCliente());
                al.setIdAluguel              (rs.getInt     ("idAluguel"));
                al.setIdVeiculo              (rs.getInt     ("idVeiculo"));
                al.setCpfCliente             (rs.getString  ("cpfCliente"));
                al.setDataAluguel            (rs.getString  ("dataAluguel"));
                al.setDataDevolucao          (rs.getString  ("dataDevolucao"));
                al.setDataEstimadaDevolucao  (rs.getString  ("dataEstimadaDevolucao"));
                al.setPagamento              (rs.getBoolean ("pagamento"));
                
                listaAlugueis.add(al);
             
            }
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
        }
        
        return listaAlugueis;
        
    }

    public List<Aluguel> consultarLocacaoVeiculo() {
        
        Connection con = Conexao.conectar(); 
        List<Aluguel> listaAlugueis = new ArrayList<>();
        String sql  = "SELECT *";
               sql += "FROM aluguel ";
               sql += "WHERE idVeiculo= ?";
               sql += "ORDER BY idAluguel= ? and cpfCliente= ?";
               
        
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt  (1, idVeiculo);

            ResultSet rs = stm.executeQuery();
            
            while(rs.next()) {
                
                Aluguel al = new Aluguel();
                
                al.setCpfCliente             (rs.getString  ("cpfCliente"));
                al.setIdAluguel              (rs.getInt     ("idAluguel"));
                al.setIdVeiculo              (getIdVeiculo());
                al.setCpfCliente             (rs.getString  ("cpfCliente"));
                al.setDataAluguel            (rs.getString  ("dataAluguel"));
                al.setDataDevolucao          (rs.getString  ("dataDevolucao"));
                al.setDataEstimadaDevolucao  (rs.getString  ("dataEstimadaDevolucao"));
                al.setPagamento              (rs.getBoolean ("pagamento"));
                
                listaAlugueis.add(al);
             
            }
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
        }
        
        return listaAlugueis;
        
        
    }

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(String dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getDataEstimadaDevolucao() {
        return dataEstimadaDevolucao;
    }

    public void setDataEstimadaDevolucao(String dataEstimadaDevolucao) {
        this.dataEstimadaDevolucao = dataEstimadaDevolucao;
    }

    public boolean isPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

}

