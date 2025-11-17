package model;

public class Autor {
    private String nombreAutor;
    private int id;

    public Autor() {}
    public Autor(String nombreAutor, int id) {
        this.nombreAutor = nombreAutor;
        this.id = id;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
