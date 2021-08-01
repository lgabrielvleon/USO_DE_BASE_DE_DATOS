package DAO;

import Entity.Persona;
import Entity.Prestamo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PrestamoDAO {
    Conexion con=new Conexion();

    public Prestamo Consultar(int ID)throws Exception{
        Prestamo objprestamo=new Prestamo();
        try {
            String sql = "CALL sp_consultarPrestamo (?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,ID);
            ResultSet rs= ps.executeQuery();
            if (rs.next()){
                objprestamo=new Prestamo(
                        rs.getInt("Id_Prestamo"),
                        rs.getInt("Id_Usuario"),
                        rs.getString("Date_prestamo")
                );
            }
        }catch (Exception e){
            System.out.println("SQL ERROR"+e);
        }finally {
            con.getCon().close();
        }
        return objprestamo;
    }

    public void Registrar(Prestamo objprestamo){
        try {
            String sql="CALL sp_prestamo_insert (?);";
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

    public ArrayList<Prestamo> list() throws Exception{
        ArrayList<Prestamo> listPrestamo=new ArrayList<Prestamo>();
        try {
            Statement stmt=con.getCon().createStatement();
            ResultSet rs= stmt.executeQuery("CALL sp_listarPrestamo");
            while (rs.next()){
                    Prestamo objTmpPrestamo=new Prestamo(
                            rs.getInt(1),
                            rs.getInt(2),
                            rs.getString(3)
                    );
                    listPrestamo.add(objTmpPrestamo);
            }
        }catch (SQLException err){
            System.out.println("SQL ERROR"+err);
        }finally {
            con.getCon().close();
        }
        return listPrestamo;
    }
}
