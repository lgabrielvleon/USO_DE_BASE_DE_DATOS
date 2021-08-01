package Entity;

public class Prestamo {
    private int ID;
    private int Id_Usuario;
    private String Date_prestamo;

    public Prestamo() {
        this.ID = 0;
        this.Id_Usuario = 0;
        this.Date_prestamo = "";
    }

    public Prestamo(int ID, int id_Usuario, String date_prestamo) {
        this.ID = ID;
        this.Id_Usuario = id_Usuario;
        this.Date_prestamo = date_prestamo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.Id_Usuario = id_Usuario;
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
                ", Id_Usuario=" + Id_Usuario +
                ", Date_prestamo='" + Date_prestamo + '\'' +
                '}';
    }
}
