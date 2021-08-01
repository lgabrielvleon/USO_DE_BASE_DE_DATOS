package Entity;

public class Usuario {
    private int ID;
    private int Id_Persona;
    private String Email;
    private String Nickname;
    private String Contraseña;

    public Usuario() {
        this.ID = 0;
        Id_Persona = 0;
        Email = "";
        Nickname = "";
        Contraseña = "";
    }

    public Usuario(int ID, int id_Persona, String email, String nickname, String contraseña) {
        this.ID = ID;
        this.Id_Persona = id_Persona;
        this.Email = email;
        this.Nickname = nickname;
        this.Contraseña = contraseña;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getId_Persona() {
        return Id_Persona;
    }

    public void setId_Persona(int id_Persona) {
        this.Id_Persona = id_Persona;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        this.Nickname = nickname;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        this.Contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ID=" + ID +
                ", Id_Persona=" + Id_Persona +
                ", Email='" + Email + '\'' +
                ", Nickname='" + Nickname + '\'' +
                ", Contraseña='" + Contraseña + '\'' +
                '}';
    }
}
