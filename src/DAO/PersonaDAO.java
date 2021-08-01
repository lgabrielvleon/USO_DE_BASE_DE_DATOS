package DAO;

import Entity.Libro;
import Entity.Persona;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonaDAO {
    Conexion con=new Conexion();

    public void Registrar(Persona objpersona){
        try {
            String sql="CALL sp_persona (?,?,?,?,?,?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,objpersona.getId_Ubicacion());
            ps.setString(2,objpersona.getFirstname());
            ps.setString(3, objpersona.getLastname());
            ps.setString(4,objpersona.getBirthday());
            ps.setString(5,objpersona.getCarrera());
            ps.setInt(6, objpersona.getCiclo());
            ps.execute();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }
    }

    public void Modificar(Persona objpersona){
        try {
            String sql="CALL sp_persona_update(?,?,?,?,?,?,?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,objpersona.getID());
            ps.setInt(2,objpersona.getId_Ubicacion());
            ps.setString(3,objpersona.getFirstname());
            ps.setString(4, objpersona.getLastname());
            ps.setString(5,objpersona.getBirthday());
            ps.setString(6,objpersona.getCarrera());
            ps.setInt(7, objpersona.getCiclo());
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }
    }

    public void Eliminar(int ID){
        try {
            String sql="CALL sp_persona_delete(?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,ID);
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }
    }
}
