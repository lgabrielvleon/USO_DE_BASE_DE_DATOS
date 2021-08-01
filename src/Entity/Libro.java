package Entity;

public class Libro {
    private int ID;
    private int ID_Categoria;
    private String Title;
    private String Author;
    private String Editorial;
    private int Volumen;
    private String Tema;

    public Libro(){
        this.ID=0;
        this.ID_Categoria=0;
        this.Title="";
        this.Author="";
        this.Editorial="";
        this.Volumen=0;
        this.Tema="";
    }

    public Libro(int ID,int ID_Categoria,String Title,String Author,String Editorial,int Volumen,String Tema){
        this.ID=ID;
        this.ID_Categoria=ID_Categoria;
        this.Title=Title;
        this.Author=Author;
        this.Editorial=Editorial;
        this.Volumen=Volumen;
        this.Volumen=Volumen;
        this.Tema=Tema;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_Categoria() {
        return ID_Categoria;
    }

    public void setID_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        this.Editorial = editorial;
    }

    public int getVolumen() {
        return Volumen;
    }

    public void setVolumen(int volumen) {
        this.Volumen = volumen;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String tema) {
        this.Tema = tema;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ID=" + ID +
                ", ID_Categoria=" + ID_Categoria +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Editorial='" + Editorial + '\'' +
                ", Volumen=" + Volumen +
                ", Tema='" + Tema + '\'' +
                '}';
    }
}

