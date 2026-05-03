package biblioteca;

public class Libro extends Material {
    private String  autor;
    private String  ISBN;  /* Siglas */

    public Libro(String codigo, String titulo, int anio, boolean disponible, String autor, String ISBN) {
        super(codigo, titulo, anio, disponible);
        this.autor = autor;
        this.ISBN = ISBN;
    }

    @Override
    public String getTipo() {
        return "Libro";
    }


}