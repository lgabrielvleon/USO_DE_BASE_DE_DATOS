package DAO;

import Entity.DetallePrestamo;
import Entity.Libro;
import Entity.Prestamo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DetallePrestamoDAO {
    private Conexion con = new Conexion();

    public ArrayList<DetallePrestamo> getDetallePrestamoReporte(int idPrestamo) throws Exception {
        ArrayList<DetallePrestamo> lstDetallePrestamo = new ArrayList<DetallePrestamo>();
        try{
            String sqlStatement = "CALL sp_consultarDetallePrestamoReporte(?)";
            PreparedStatement ps = con.getCon().prepareStatement(sqlStatement);
            ps.setInt(1,idPrestamo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                /*
                DetallePrestamo objTmpDetallePersona = new DetallePrestamo(
                        0,
                        new Libro(
                                0,
                                0,
                                rs.getString(1),
                                "",
                                "",
                                0,
                                ""
                        ),
                        new Prestamo()
                );

                lstDetallePrestamo.add(objTmpDetallePersona);*/

                lstDetallePrestamo.add(
                        new DetallePrestamo(
                                0,
                                new Libro(
                                        0,
                                        0,
                                        rs.getString(1),
                                        "",
                                        "",
                                        0,
                                        ""
                                ),
                                new Prestamo()
                        )
                );
            }
        }catch (SQLException e){
            System.out.println("Error: "+e);
        }finally {
            con.getCon().close();
        }
        return lstDetallePrestamo;
    }
}



