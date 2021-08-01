package DAO;

import Entity.Ubicacion;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UbicacionDAO {
    Conexion con=new Conexion();

    public void Registrar(Ubicacion objubicacion){
        try {
            String sql="CALL sp_ubicacion(?,?,?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setString(1,objubicacion.getPais());
            ps.setString(2, objubicacion.getRegion());
            ps.setString(3, objubicacion.getCiudad());
            ps.execute();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }
    }

    public void Modificar(Ubicacion objubicacion){
        try {
            String sql="CALL sp_ubicacion_update(?,?,?,?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,objubicacion.getID());
            ps.setString(2, objubicacion.getPais());
            ps.setString(3,objubicacion.getRegion());
            ps.setString(4,objubicacion.getCiudad());
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }
    }

    public void Eliminar(int ID){
        try {
            String sql="CALL sp_ubicacion_delete(?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,ID);
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }

    }


}
