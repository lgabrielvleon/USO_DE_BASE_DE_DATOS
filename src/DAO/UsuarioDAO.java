package DAO;

import Entity.Persona;
import Entity.Usuario;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    Conexion con=new Conexion();

    public void Registrar(Usuario objusuario){
        try {
            String sql="CALL sp_usuario (?,?,?,?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,objusuario.getId_Persona());
            ps.setString(2,objusuario.getEmail());
            ps.setString(3, objusuario.getNickname());
            ps.setString(4, objusuario.getContraseña());
            ps.execute();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }
    }

    public void Modificar(Usuario objusuario){
        try {
            String sql="CALL sp_usuario_update(?,?,?,?,?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,objusuario.getID());
            ps.setInt(2, objusuario.getId_Persona());
            ps.setString(3, objusuario.getEmail());
            ps.setString(4, objusuario.getNickname());
            ps.setString(5, objusuario.getContraseña());
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }
    }

    public void Eliminar(int ID){
        try {
            String sql="CALL sp_usuario_delete(?);";
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1,ID);
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println("SQL ERROR"+e);
        }
    }
}
