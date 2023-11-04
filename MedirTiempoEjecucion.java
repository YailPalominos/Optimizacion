public class MedirTiempoEjecucion {
    public static void main(String[] args) {
        long tiempoInicio = System.nanoTime();

        // Pon aqui el ejemplo en java.

        long tiempoFin = System.nanoTime();
        long tiempoTotal = tiempoFin - tiempoInicio;

        System.out.println("Tiempo de ejecución en nanosegundos: " + tiempoTotal);
    }
}
