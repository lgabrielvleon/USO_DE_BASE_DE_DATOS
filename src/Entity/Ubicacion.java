package Entity;

public class Ubicacion {
    private int ID;
    private String Pais;
    private String Region;
    private String Ciudad;

    public Ubicacion(){
        this.ID=0;
        this.Pais="";
        this.Region="";
        this.Ciudad="";
    }

    public Ubicacion(int ID,String Pais,String Region,String Ciudad){
        this.ID=ID;
        this.Pais=Pais;
        this.Region=Region;
        this.Ciudad=Ciudad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        this.Pais = pais;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        this.Region = region;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        this.Ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Ubicacion{" +
                "ID=" + ID +
                ", Pais='" + Pais + '\'' +
                ", Region='" + Region + '\'' +
                ", Ciudad='" + Ciudad + '\'' +
                '}';
    }
}
