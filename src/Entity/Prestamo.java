package Entity;

public class Prestamo {
    private int ID;
    private Usuario objUsuario;
    private String Date_prestamo;

    public Prestamo() {
        this.ID = 0;
        this.objUsuario = new Usuario();
        this.Date_prestamo = "";
    }

    public Prestamo(int ID, Usuario objUsuario, String date_prestamo) {
        this.ID = ID;
        this.objUsuario = objUsuario;
        this.Date_prestamo = date_prestamo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Usuario getId_Usuario() {
        return objUsuario;
    }

    public void setId_Usuario(Usuario objUsuario) {
        this.objUsuario = objUsuario;
    }

    public String getDate_prestamo() {
        return Date_prestamo;
    }

    public void setDate_prestamo(String date_prestamo) {
        this.Date_prestamo = date_prestamo;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "ID=" + ID +
                ", Id_Usuario=" + objUsuario.getID() +
                ", Date_prestamo='" + Date_prestamo + '\'' +
                '}';
    }
}
