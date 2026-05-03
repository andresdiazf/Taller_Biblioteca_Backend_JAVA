package biblioteca;
import java.util.*;


public class SistemaBiblioteca {

    Map<String, Material> catalogo = new HashMap<>(); // punto 3 se usa <> para crear la coleccion

    Map<String, List<String>> listaEspera = new HashMap<>(); // Punto 4  List<String>> crea la lista de usuarios en espera, lista dentro de otra

    Set<String> miembros = new HashSet<>(); // punto 5

    public void registrarMaterial(Material m) {
        catalogo.put(m.getCodigo(), m);
    }
    // metodo buscar material desde la coleccion de catalogo

    public Material buscarMaterial(String codigo) {
        if (catalogo.get(codigo) != null) {
            return catalogo.get(codigo);
        }else {
            System.out.println("No existe el material con el codigo "+codigo);
            return null;
        }
    }

    public void mostrarCatalogo() {
        System.out.println("Catalogo");
        for (Map.Entry<String, Material> entrada : catalogo.entrySet()) {
            entrada.getValue().mostrarInfo();

        }
    }

    public void agregarEspera(String codigoMaterial, String usuario) {
        if (!listaEspera.containsKey(codigoMaterial)) { // No existe entonces la creamos desde cero
            listaEspera.put(codigoMaterial, new ArrayList<>());
        }

        listaEspera.get(codigoMaterial).add(usuario);

    }

    public String siguienteEnEspera(String codigoMaterial) {
        String siguiente = listaEspera.get(codigoMaterial).get(0);
        listaEspera.get(codigoMaterial).remove(0);
        return siguiente;
    }

    public boolean registrarMiembro(String usuario) {
        if (miembros.contains(usuario)) {
            System.out.println("El miembro "+usuario+" ya existe");
            return false;
        } else {
            miembros.add(usuario);
            System.out.println(miembros.size()+" miembros registrado");
        }
        return true;
    }

    public String tieneMenbresia (String usuario) {
        if (miembros.contains(usuario)) {
            System.out.println("El miembro "+usuario+" tiene menbresia");
            return "Tiene menbresia";
        } else {
            System.out.println("El miembro "+usuario+" no tiene menbresia");
            return "No tiene menbresia";
        }
    }

}
