package biblioteca;

public class Main {
    public static void main(String[] args) {

    /* polimorfismo*/

// punto 6

    // HashMap — catálogo
    System.out.println( "============Libro1==============");
    Material libro1 = new Libro("001","Don Quijote", 1981, false,"servantes", "abc124545" );
    libro1.mostrarInfo();
    System.out.println( "============Libro2==============");
    Material libro2 = new Libro("002","El Principito", 1943, true,"Antoine de Saint-Exupéry", "abc124546" );
    libro2.mostrarInfo();
    System.out.println( "============Revistas1==============");
    Material revista1 = new Revista("101", " Motor", 2026, true,2,"Autos Antiguos");
    revista1.mostrarInfo();
    System.out.println( "============Revistas2==============");
    Material revista2 = new Revista("102", " Panini", 2020, false,3,"Futbol");
    revista2.mostrarInfo();

    SistemaBiblioteca catalogo1 = new SistemaBiblioteca();
    catalogo1.registrarMaterial(libro1);
    catalogo1.registrarMaterial(libro2);
    catalogo1.registrarMaterial(revista1);
    catalogo1.registrarMaterial(revista2);

    System.out.println( "============Buscar con Código1==============");
    catalogo1.buscarMaterial("001").mostrarInfo();
    System.out.println( "============Buscar con Código2==============");
    catalogo1.buscarMaterial("004");

    System.out.println( "============Lista de espera==============");
    // ArrayList — lista de espera
    SistemaBiblioteca listaEspera1 = new SistemaBiblioteca();
    listaEspera1.agregarEspera("001","Andres");
    listaEspera1.agregarEspera("001","Maria");
    listaEspera1.agregarEspera("001","Juliana");

    System.out.println( "EL siguiente en fila para el código para el 001 es: " + listaEspera1.siguienteEnEspera("001"));
    System.out.println( "EL siguiente en fila para el código para el 001 es: " + listaEspera1.siguienteEnEspera("001"));
    System.out.println( "EL siguiente en fila para el código para el 001 es: " + listaEspera1.siguienteEnEspera("001"));


    System.out.println( "============HashSet — membresías==============");
    SistemaBiblioteca miembro1 = new SistemaBiblioteca();
    miembro1.registrarMiembro("Maria");
    miembro1.registrarMiembro("Juliana");
    miembro1.registrarMiembro("Aleja");
    miembro1.registrarMiembro("Maria");
    miembro1.tieneMenbresia("Maria");
    miembro1.tieneMenbresia("jose"); // miembro no registrado

    System.out.println( "============Polimorfismo==============");

    catalogo1.mostrarCatalogo();


    }
}