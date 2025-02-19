package Entity;

public class Persona {
    private int ID;
    private int Id_Ubicacion;
    private String Firstname;
    private String Lastname;
    private String Birthday;
    private String Carrera;
    private int Ciclo;
    private String Register_date;

    public Persona() {
        this.ID = 0;
        this.Id_Ubicacion = 0;
        this.Firstname = "";
        this.Lastname = "";
        this.Birthday = "";
        this.Carrera = "";
        this.Ciclo = 0;
        this.Register_date = "";
    }

    public Persona(int ID, int id_Ubicacion, String firstname, String lastname, String birthday,
                   String carrera, int ciclo, String register_date) {
        this.ID = ID;
        this.Id_Ubicacion = id_Ubicacion;
        this.Firstname = firstname;
        this.Lastname = lastname;
        this.Birthday = birthday;
        this.Carrera = carrera;
        this.Ciclo = ciclo;
        this.Register_date = register_date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getId_Ubicacion() {
        return Id_Ubicacion;
    }

    public void setId_Ubicacion(int id_Ubicacion) {
        this.Id_Ubicacion = id_Ubicacion;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        this.Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        this.Lastname = lastname;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        this.Birthday = birthday;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        this.Carrera = carrera;
    }

    public int getCiclo() {
        return Ciclo;
    }

    public void setCiclo(int ciclo) {
        this.Ciclo = ciclo;
    }

    public String getRegister_date() {
        return Register_date;
    }

    public void setRegister_date(String register_date) {
        this.Register_date = register_date;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "ID=" + ID +
                ", Id_Ubicacion=" + Id_Ubicacion +
                ", Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", Carrera='" + Carrera + '\'' +
                ", Ciclo=" + Ciclo +
                ", Register_date='" + Register_date + '\'' +
                '}';
    }
}