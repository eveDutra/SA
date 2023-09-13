package Classes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import Util.Conexao;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class Modelo {

private String codTipo;
private int codMarca;
private int codModelo;
private String descModelo;

public boolean incluirModelo() {
Connection con = Conexao.conectar();
        String sql = "insert into modelo ";
               sql+= "values (?,?,?,?);";
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.codTipo);
            stm.setInt(2, this.codMarca);
            stm.setInt(3, this.codModelo);
            stm.setString(4, this.descModelo);
            stm.execute();  
        }
            catch (SQLException ex) {
            System.out.println("Erro no Insert: " + ex.getMessage() + " \nComando SQL : " + sql);
            return false;
            }
        return true;
}

public boolean alterarModelo() {
Connection con = Conexao.conectar();
        String sql = "UPDATE modelo ";
               sql+= "SET codTipo      = ?, ";
               sql+= "    codMarca      = ?, ";
               sql+= "    codModelo     = ?, ";
               sql+= "    descModelo  = ?, ";
               sql+= "WHERE codTipo     = ?;  ";
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.codTipo);
            stm.setInt(2, this.codMarca);
            stm.setInt(3, this.codModelo);
            stm.setString(4, this.descModelo);
            stm.execute();  
        }
            catch (SQLException ex) {
            System.out.println("Erro no Update: " + ex.getMessage() + " \nComando SQL : " + sql);
            return false;
            }
        return true;
}

public boolean excluirModelo() {
Connection con = Conexao.conectar();
        String sql = "DELETE from modelo ";
               sql+= "WHERE codTipo = ?; ";
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.codTipo);
            stm.execute();  
        }
            catch (SQLException ex) {
            System.out.println("Erro no Delete: " + ex.getMessage() + " \nComando SQL : " + sql);
            return false;
            }
        return true;  
}

public Modelo consultarModelo() {
        Connection con = Conexao.conectar();
        String sql = "select codTipo,codMarca, codModelo, descModelo ";
               sql+= "from modelo ";
               sql+= "WHERE codTipo = ?; ";
        Modelo mod = null;              
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, this.codTipo);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                mod = new Modelo();
                mod.setcodTipo(rs.getString("codTipo"));
                mod.setcodMarca(rs.getInt("codMarca"));
                mod.setcodModelo(rs.getInt("codModelo"));
                mod.setdescModelo(rs.getString("descModelo"));
            }
        }
        catch (SQLException ex) {
            System.out.println("Erro no Select Único: " + ex.getMessage() + " \nComando SQL : " + sql);
        }
        return mod;  

}

public List<Modelo> consultarModelos() {
        Connection con = Conexao.conectar();
        List<Modelo> listaModelos = new ArrayList<>();
        String sql = "select codTipo,codMarca, codModelo, descModelo ";
               sql+= "from modelo ";
               sql+= "order by codTipo";
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Modelo mod = new Modelo();
                mod.setcodTipo(rs.getString("codTipo"));
                mod.setcodMarca(rs.getInt("codMarca"));
                mod.setcodModelo(rs.getInt("codModelo"));
                mod.setdescModelo(rs.getString("descModelo"));
                listaModelos.add(mod);
            }
        }
            catch (SQLException ex) {
            System.out.println("Erro no Select Único: " + ex.getMessage() + " \nComando SQL : " + sql);
            }
        return listaModelos;

}

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

    public int getCodModelo() {
        return codModelo;
    }

    public void setCodModelo(int codModelo) {
        this.codModelo = codModelo;
    }

    public String getDescModelo() {
        return descModelo;
    }

    public void setDescModelo(String descModelo) {
        this.descModelo = descModelo;
    }

    private void setcodMarca(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setcodTipo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setcodModelo(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setdescModelo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
