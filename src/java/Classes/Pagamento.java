package Classes;

import Util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Pagamento {

    private int idAluguel;
    private int idPagamento;
    private String dataPagamento;
    private int tipoPagamento;
    private double vlrPagamento;

    public boolean incluirPagamento() {
        
        Connection con = Conexao.conectar();
        String sql  = "INSERT INTO pagamento ";
               sql += "(idAluguel, idPagamento, dataPagamento, tipoPagamento, vlrPagamento)";
               sql += "VALUES (?, ?, ?, ?, ?)";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setInt(1, idAluguel);
            stm.setInt(2, idPagamento);
            stm.setString(3, dataPagamento);
            stm.setInt(4, tipoPagamento);
            stm.setDouble(5, vlrPagamento);
            
            stm.execute();
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
            return false;
            
        }
        
        return true;
        
    }
   
    public boolean alterarPagamento() {
        
        Connection con = Conexao.conectar();
        String sql  = "UPDATE pagamento ";
               sql += "SET nomeAluguel= ?, foneAluguel= ?, emailAluguel= ?, nrCartaoCredDeb= ?, chavePix= ?" ;
               sql += "WHERE idAluguel= ? and idPagamento= ?";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setInt(1, idAluguel);
            stm.setInt(2, idPagamento);
            stm.setString(3, dataPagamento);
            stm.setInt(4, tipoPagamento);
            stm.setDouble(5, vlrPagamento);
            
            stm.execute();
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
            return false;
            
        }
        
        return true;
        
    }
 
    public boolean excluirPagamento() {
        
        Connection con = Conexao.conectar();
        String sql  = "DELETE FROM aluguel ";
               sql += "WHERE idAluguel= ? and idPagamento= ?";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setInt(1, idAluguel);
            stm.setInt(2, idPagamento);
            
            stm.execute();
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
            return false;
            
        }
        
        return true;
        
     }

    public Pagamento consultarPagamento() {
        
        Connection con = Conexao.conectar();
        String sql  = "SELECT nomeAluguel, foneAluguel, emailAluguel, nrCartaoCredDeb, chavePix";
               sql += "FROM aluguel ";
               sql += "WHERE idAluguel= ? and idPagamento= ?";
               
        Pagamento pag = null;
        
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, idAluguel);
            ResultSet rs = stm.executeQuery();
            
            if(rs.next()) {
                
                pag = new Pagamento();
                
                pag.setIdAluguel      (getIdAluguel());
                pag.setIdAluguel      (getIdPagamento());
                pag.setDataPagamento  (rs.getString("dataPagamento"));
                pag.setTipoPagamento  (rs.getInt("tipoPagamento"));
                pag.setVlrPagamento   (rs.getInt("vlrPagamento"));
               

                
            }
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
        }
        
        return pag;
        
    }

   public List<Pagamento> consultarPagamentos() {
        
        Connection con = Conexao.conectar();
        List<Pagamento> listaPagamentos = new ArrayList<>();
        String sql  = "SELECT * ";
               sql += "FROM aluguel ";
               sql += "ORDER BY codAluguel;";
        
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()) {
                
                Pagamento pag = new Pagamento();
                
               pag.setIdAluguel      (getIdAluguel());
               pag.setIdAluguel      (getIdPagamento());
               pag.setDataPagamento  (rs.getString("dataPagamento"));
               pag.setTipoPagamento  (rs.getInt("tipoPagamento"));
               pag.setVlrPagamento   (rs.getInt("vlrPagamento"));
                
                listaPagamentos.add(pag);
                
            }
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
        }
        
        return listaPagamentos;
        
    }
   
    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public int getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getVlrPagamento() {
        return vlrPagamento;
    }

    public void setVlrPagamento(double vlrPagamento) {
        this.vlrPagamento = vlrPagamento;
    }

}