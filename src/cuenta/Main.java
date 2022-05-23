package cuenta;
/**
 * Clase Main: clase principal desde donde inicializa el programa, e instancia
 * y crea el objetos para la clase CCuenta
 * @since 22-05-2022
 * @author Rolando Roldán Santos
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Inicializacion del programa, recibe único parámetro y de tipo float
         */
        operativa_cuenta(0);
    }
    /**
     * Programa ya referenciado, que funciona a modo de ejemplo de como se ejecuta
     * la aplicación
     * @param cantidad: dloat que sirve para el tipo de interes.
     */
    public static void operativa_cuenta(float cantidad) {
        
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,cantidad);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        } 
    }
}
