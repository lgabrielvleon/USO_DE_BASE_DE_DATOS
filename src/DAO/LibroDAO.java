package DAO;

import Entity.Libro;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibroDAO {
    Conexion con=new Conexion();

    public void Registrar(Libro objlibro){
        try {
            String sql="CALL sp_libro (?,?,?,?,?,?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,objlibro.getID_Categoria());
            ps.setString(2,objlibro.getTitle());
            ps.setString(3, objlibro.getAuthor());
            ps.setString(4,objlibro.getEditorial());
            ps.setInt(5,objlibro.getVolumen());
            ps.setString(6, objlibro.getTema());
            ps.execute();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }
    }

    public void Modificar(Libro objlibro){
        try {
            String sql="CALL sp_libro_update(?,?,?,?,?,?,?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,objlibro.getID());
            ps.setInt(2,objlibro.getID_Categoria());
            ps.setString(3,objlibro.getTitle());
            ps.setString(4, objlibro.getAuthor());
            ps.setString(5, objlibro.getEditorial());
            ps.setInt(6, objlibro.getVolumen());
            ps.setString(7, objlibro.getTema());
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }
    }

    public void Eliminar(int ID){
        try {
            String sql="CALL sp_libro_delete(?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,ID);
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }
    }
}
