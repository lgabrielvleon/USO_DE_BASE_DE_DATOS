package DAO;

import Entity.Categoria;
import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriaDAO {
    Conexion con=new Conexion();

    public Categoria Consultar (int ID) throws Exception{
        Categoria objcategoria=new Categoria();

        try {
            String sql= "CALL sp_categoria_mostrar (?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,ID);
            ResultSet rs= ps.executeQuery();
            if (rs.next()){
                objcategoria=new Categoria(
                rs.getInt("ID"),
                rs.getString("Nombre"),
                rs.getString("Tipo")
                );
            }
        }catch (SQLException e){

            System.out.println("SQL ERROR" +e);
        }finally {
            con.getCon().close();
        }
        return objcategoria;
    }

    public void Registrar(Categoria objcategoria){
        try {
            String sql="CALL sp_categoria (?,?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setString(1,objcategoria.getNombre());
            ps.setString(2, objcategoria.getTipo());
            ps.execute();

        }catch (SQLException e) {
            System.out.println("SQL ERROR" + e);
        }
    }

    public void Modificar(Categoria objcategoria){
        try {
            String sql="CALL sp_categoria_update (?,?,?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,objcategoria.getID());
            ps.setString(2,objcategoria.getNombre());
            ps.setString(3, objcategoria.getTipo());
            ps.execute();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }

    }

    public void Eliminar(int ID){
        try {
            String sql="CALL sp_categoria_delete (?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,ID);
            ps.execute();
        }catch (SQLException er){
            System.out.println("SQL ERROR"+er);
        }

    }
}
