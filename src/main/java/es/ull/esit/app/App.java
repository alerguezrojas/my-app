package es.ull.esit.app;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // bucle que imprime los numeros del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // codigo que divide por 0
        //try {
            int resultado = 10 / 0;
            System.out.println("El resultado es: " + resultado);
        //} catch (ArithmeticException e) {
            //System.out.println("Error: No se puede dividir por cero.");
        //}
    }

}
