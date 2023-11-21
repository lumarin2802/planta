public class Main {
    public static void main(String[] args) {
     Arbol arbol = new Arbol("Pino", 10, true, "Templado", "Pino", "Recto", 1.5, "Verde", "Aguja");
        arbol.decirLoQueSoy() ;


        Flor flor = new Flor("Rosa", 0.5, true, "Templado", "Rojo", 5, "Rosa", "Amarillo", "Primavera");
        flor.decirLoQueSoy();

        Arbusto arbusto = new Arbusto("Arbusto", 0.5, true, "Templado", 0.5, true, "Arbusto", "Verde", true);
        arbusto.decirLoQueSoy();

    }
}