package Entity;

public class DetallePrestamo {
    private int id;
    private Libro objLibro;
    private Prestamo objPrestamo;

    public DetallePrestamo(){
        this.id = 0;
        this.objLibro = new Libro();
        this.objPrestamo = new Prestamo();
    }
    public DetallePrestamo(int id, Libro objLibro, Prestamo objPrestamo) {
        this.id = id;
        this.objLibro = objLibro;
        this.objPrestamo = objPrestamo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Libro getObjLibro() {
        return objLibro;
    }

    public void setObjLibro(Libro objLibro) {
        this.objLibro = objLibro;
    }

    public Prestamo getObjPrestamo() {
        return objPrestamo;
    }

    public void setObjPrestamo(Prestamo objPrestamo) {
        this.objPrestamo = objPrestamo;
    }
}
