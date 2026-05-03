package biblioteca;

public abstract class Material implements Catalogable {
    private String  codigo;
    private String  titulo;
    private int     anio;
    private boolean  disponible;

    public Material(String codigo, String titulo, int anio, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
        this.disponible = disponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {}

    public abstract String getTipo();       /* Las clases hijas usaran este metodo*/

    public void mostrarInfo() {
        String estado = disponible ? "Disponible" : "No disponible";
        System.out.println("Tipo: " + getTipo());
        System.out.println("Titulo:" + titulo);
        System.out.println("anio: " + anio);
        System.out.println("Estado: " + estado);
        System.out.println("Codigo: " + codigo);

    }


}
