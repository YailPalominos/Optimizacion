import java.util.ArrayList;
import java.util.List;

public class Analisis {
    /**
     * @author Braulio Yail Palominos Patiño
     */
    private String codigoFuente = ""; // Codigo fuente resibido de la clase de ejecutador.
    private List<String> operaciones;// Seguardan las operaciones ya realizadas;

    // Ejemplo 1
    // T1=X+10
    // T2=X-Y
    // T3=10
    // T3=T2/4.32
    // T4=T1+T3

    // Ejemplo 2
    // T1=X+10
    // T2=Y+X+10

    // Ejemplo 3
    // T1=X+0
    // T2=Y+T1+10

    public Analisis(String codigoFuente) {
        this.codigoFuente = codigoFuente;
    }

    public void Generar() {
        operaciones = new ArrayList<String>();
        String[] lineas = codigoFuente.split("\n");
        for (String linea : lineas) {
            // Analizar la línea según el formato "T1=x+10"
            String[] partes = linea.split("=");

            // if (partes.length == 2) {
            // operaciones.add(partes[1].trim());
            // } else {
            // System.out.println("Línea no válida: " + linea);
            // }
        }
    }

}