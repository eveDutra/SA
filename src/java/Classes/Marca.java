package Classes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import Util.Conexao;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class Marca {

    private String codTipo;
    private int    codMarca;
    private String descMarca;

    public boolean incluirMarca() {
        Connection con = Conexao.conectar();
        String sql = "insert into marca ";
               sql+= "values (?,?,?);";
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.codTipo);
            stm.setInt(2, this.codMarca);
            stm.setString(3, this.descMarca);
            stm.execute();   
        } 
            catch (SQLException ex) {
            System.out.println("Erro no Insert: " + ex.getMessage() + " \nComando SQL : " + sql);
            return false;
            }
        return true;   
    }

    public boolean alterarMarca() {
        Connection con = Conexao.conectar();
        String sql = "UPDATE marca ";
               sql+= "SET descmarca = ? ";
               sql+= "WHERE codtipo  = ? ";
               sql+= "  AND codmarca = ?;";
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.descMarca);
            stm.setString(2, this.codTipo);
            stm.setInt(3, this.codMarca);
            stm.execute();   
        } 
            catch (SQLException ex) {
            System.out.println("Erro no Update: " + ex.getMessage() + " \nComando SQL : " + sql);
            return false;
            }
        return true;
    }

    public boolean excluirMarca() {
        Connection con = Conexao.conectar();
        String sql = "DELETE from marca ";
               sql+= "WHERE codtipo = ? ";
               sql+= "  AND codmarca = ?;";
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.codTipo);
            stm.setInt(2, this.codMarca);
            stm.execute();   
        } 
            catch (SQLException ex) {
            System.out.println("Erro no Delete: " + ex.getMessage() + " \nComando SQL : " + sql);
            return false;
            }
        return true;   
    }

    public Marca consultarMarca() {
        Connection con = Conexao.conectar();
        String sql = "select descmarca ";
               sql+= "from marca ";
               sql+= "WHERE codtipo = ? ";
               sql+= "  AND codmarca = ?;";
        Marca cli = null;               
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.codTipo);
            stm.setInt(2, this.codMarca);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                cli = new Marca();
                cli.setDescMarca(rs.getString("descmarca"));
            }
        } 
        catch (SQLException ex) {
            System.out.println("Erro no Select Único: " + ex.getMessage() + " \nComando SQL : " + sql);
        }
        return cli;  
    }

    public List<Marca> consultarMarcas() {
        Connection con = Conexao.conectar();
        List<Marca> listaMarcas = new ArrayList<>();
        String sql = "select codmarca,descmarca ";
               sql+= "from marca ";
               sql+= "where codtipo = ? ";
               sql+= "order by descmarca";
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.codTipo);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Marca cli = new Marca();
                cli.setCodMarca(rs.getInt("codmarca"));
                cli.setDescMarca(rs.getString("descmarca"));
                listaMarcas.add(cli);
            }
        } 
            catch (SQLException ex) {
            System.out.println("Erro no Select Único: " + ex.getMessage() + " \nComando SQL : " + sql);
            }
        return listaMarcas;   
    }

    public int maxMarca(String pCodTipo){
        int maxCodTipo = 0;
        Connection con = Conexao.conectar();
        String sql = "select max(codmarca) codmarca ";
               sql+= "from marca ";
               sql+= "where codtipo = ? ";
         try{
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.codTipo);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Marca cli = new Marca();
                maxCodTipo = (rs.getInt("codmarca"));
            }
        } 
            catch (SQLException ex) {
            System.out.println("Erro no Select Único: " + ex.getMessage() + " \nComando SQL : " + sql);
            }       
        return maxCodTipo;
    }
    
    // area de getters e setters

    public String getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(String codTipo) {
        this.codTipo = codTipo;
    }

    public int getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(int codMarca) {
        this.codMarca = codMarca;
    }

    public String getDescMarca() {
        return descMarca;
    }

    public void setDescMarca(String descMarca) {
        this.descMarca = descMarca;
    }
}