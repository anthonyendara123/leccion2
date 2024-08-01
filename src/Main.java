public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Pajaro
        Pajaro piolin = new Pajaro("piolin");

        // Llamar al método comer
        piolin.comer();
        // Llamar al método cantar con un tipo específico
        String canto = piolin.cantar("canario");
        System.out.println(canto);
        // Llamar al método volar
        piolin.volar();
    }
}
