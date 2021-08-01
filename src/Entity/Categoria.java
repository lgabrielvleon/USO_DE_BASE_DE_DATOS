package Entity;

public class Categoria {
    private int ID;
    private String Nombre;
    private String Tipo;

    public Categoria(){
        this.ID=0;
        this.Nombre="";
        this.Tipo="";
    }

    public Categoria(int ID, String Nombre,String Tipo){
        this.ID=ID;
        this.Nombre=Nombre;
        this.Tipo=Tipo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo(){
        return Tipo;
    }

    public void setTipo(String Tipo){
        this.Tipo=Tipo;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "ID=" + ID +
                ", Nombre='" + Nombre + '\'' +
                ", Tipo='" + Tipo + '\'' +
                '}';
    }
}

