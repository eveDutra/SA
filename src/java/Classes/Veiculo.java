package Classes;

import Util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Veiculo {

    private int idVeiculo;
    private String marcaVeiculo;
    private String modeloVeiculo;
    private String placaVeiculo;
    private String corPredominante;
    private int anoFabricacao;
    private boolean disponivel;
    private boolean temArCondicionado;
    private boolean temDirHidraulica;
    private boolean revisado;

    public boolean incluirVeiculo() {
        
        Connection con = Conexao.conectar();
        String sql  = "INSERT INTO veiculo ";
               sql += "(idVeiculo, marcaVeiculo, modeloVeiculo, placaVeiculo, corPredominante, anoFabricacao, disponivel, temArCondicionado, temDirHidraulica, revisado)";
               sql += "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setInt     (1, idVeiculo);
            stm.setString  (2, marcaVeiculo);
            stm.setString   (3, modeloVeiculo);
            stm.setString  (4, placaVeiculo);
            stm.setString  (5, corPredominante);
            stm.setInt     (6, anoFabricacao);
            stm.setBoolean (7, disponivel);
            stm.setBoolean (8, temArCondicionado);
            stm.setBoolean (9, temDirHidraulica);
            stm.setBoolean (10, revisado);
            
            stm.execute();
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
            return false;
            
        }
        
        return true;
        
    }

    public boolean alterarVeiculo() {
        
        Connection con = Conexao.conectar();
        String sql  = "UPDATE veiculo ";
               sql += "SET marcaVeiculo= ?, modeloVeiculo= ?, placaVeiculo= ?, corPredominante= ?, anoFabricacao= ?, disponivel= ?, temArCondicionado= ?, temDirHidraulica= ?, revisado= ?" ;
               sql += "WHERE idVeiculo= ?";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setInt     (1, idVeiculo);
            stm.setString  (2, marcaVeiculo);
            stm.setString  (3, modeloVeiculo);
            stm.setString  (4, placaVeiculo);
            stm.setString  (5, corPredominante);
            stm.setInt     (6, anoFabricacao);
            stm.setBoolean (7, disponivel);
            stm.setBoolean (8, temArCondicionado);
            stm.setBoolean (9, temDirHidraulica);
            stm.setBoolean (10, revisado);
            
            stm.execute();
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
            return false;
            
        }
        
        return true;
        
    }
 
    public boolean excluirVeiculo() {
        
        Connection con = Conexao.conectar();
        String sql  = "DELETE FROM veiculo ";
               sql += "WHERE idVeiculo= ?";
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setInt(1, idVeiculo);
            
            stm.execute();
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
            return false;
            
        }
        
        return true;
        
     }

    public Veiculo consultarVeiculo() {
        
        Connection con = Conexao.conectar();
        String sql  = "SELECT marcaVeiculo, modeloVeiculo, placaVeiculo, corPredominante, anoFabricacao, disponivel, temArCondicionado, temDirHidraulica, revisado";
               sql += "FROM veiculo ";
               sql += "WHERE idVeiculo= ?";
               
        Veiculo vei = null;
        
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, idVeiculo);
            ResultSet rs = stm.executeQuery();
            
            if(rs.next()) {
                
                vei = new Veiculo();
                
                vei.setIdVeiculo         (getIdVeiculo());
                vei.setMarcaVeiculo      (rs.getString    ("marcaVeiculo"));
                vei.setModeloVeiculo     (rs.getString    ("modeloVeiculo"));
                vei.setPlacaVeiculo      (rs.getString ("placaVeiculo"));
                vei.setCorPredominante   (rs.getString ("corPredominante"));
                vei.setAnoFabricacao     (rs.getInt ("anoFabricacao"));
                vei.setDisponivel        (rs.getBoolean ("disponivel"));
                vei.setTemArCondicionado (rs.getBoolean ("temArCondicionado"));
                vei.setTemDirHidraulica  (rs.getBoolean ("temDirHidraulica"));
                vei.setRevisado          (rs.getBoolean ("revisado"));

            }
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
        }
        
        return vei;
        
    }

    public List<Veiculo> consultarVeiculos() {
        
        Connection con = Conexao.conectar();
        List<Veiculo> listaVeiculos = new ArrayList<>();
        String sql  = "SELECT * ";
               sql += "FROM veiculo ";
               sql += "ORDER BY codVeiculo;";
        
        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()) {
                
                Veiculo vei = new Veiculo();
                
                vei.setIdVeiculo         (getIdVeiculo());
                vei.setMarcaVeiculo      (rs.getString    ("marcaVeiculo"));
                vei.setModeloVeiculo     (rs.getString    ("modeloVeiculo"));
                vei.setPlacaVeiculo      (rs.getString ("placaVeiculo"));
                vei.setCorPredominante   (rs.getString ("corPredominante"));
                vei.setAnoFabricacao     (rs.getInt ("anoFabricacao"));
                vei.setDisponivel        (rs.getBoolean ("disponivel"));
                vei.setTemArCondicionado (rs.getBoolean ("temArCondicionado"));
                vei.setTemDirHidraulica  (rs.getBoolean ("temDirHidraulica"));
                vei.setRevisado          (rs.getBoolean ("revisado"));
                
                listaVeiculos.add(vei);
                
            }
            
        }catch(SQLException ex) {
            
            System.out.println("Erro: " + ex.getMessage());
            
        }
        
        return listaVeiculos;
        
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getCorPredominante() {
        return corPredominante;
    }

    public void setCorPredominante(String corPredominante) {
        this.corPredominante = corPredominante;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isTemArCondicionado() {
        return temArCondicionado;
    }

    public void setTemArCondicionado(boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }

    public boolean isTemDirHidraulica() {
        return temDirHidraulica;
    }

    public void setTemDirHidraulica(boolean temDirHidraulica) {
        this.temDirHidraulica = temDirHidraulica;
    }

    public boolean isRevisado() {
        return revisado;
    }

    public void setRevisado(boolean revisado) {
        this.revisado = revisado;
    }

}