public class Pajaro extends Animal implements Volador {
    private String nombre;

    public Pajaro(String nombre) {
        this.nombre = nombre;
    }

    public String cantar(String tipo) {
        return nombre + " el pájaro está cantando, es de tipo " + tipo + " y canta: me parecio ver un lindo gatito";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Implementación del método volar de la interfaz Volador
    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }
}