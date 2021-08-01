package DAO;

import Entity.Persona;
import Entity.Prestamo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrestamoDAO {
    Conexion con=new Conexion();

    public void Registrar(Prestamo objprestamo){
        try {
            String sql="CALL sp_prestamo (?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,objprestamo.getId_Usuario());
            ps.execute();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }
    }

    public void Modificar(Prestamo objprestamo){
        try {
            String sql="CALL sp_prestamo_update(?,?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,objprestamo.getID());
            ps.setInt(2, objprestamo.getId_Usuario());
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }
    }

    public void Eliminar(int ID){
        try {
            String sql="CALL sp_prestamo_delete(?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,ID);
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }
    }
}
