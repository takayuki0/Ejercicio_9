/**
 * 9.- Escriba código para generar y capturar una excepción ArrayIndexOutOfBoundsException
 * (Índice de matriz fuera de límites).
 */
public class Main {
    public static void main(String[] args) {

        try {

            String miArray[] = new String[5];

            for (int i = 0; i <= miArray.length; i++) {
                miArray[i] = "Posición: " + i;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha producico una excepción de tipo: (ArrayIndexOutOfBoundsException)");
            System.out.println(e.getMessage());
        }
    }
}