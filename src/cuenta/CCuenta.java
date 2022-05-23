package cuenta;
/**
 * Clase que maneja una cuenta bancaria, en ella se puede ingresar, retirar,  
 * consular y gestionar saldos.
 * @since 21-05-2022
 * @author Rolando Roldán Santos
 * @version 1.0.0
 */
public class CCuenta {
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }
    /**
     * Método constuctor de la clase CCuenta.
     * @param nom: usuario de la cuenta
     * @param cue: numero de cuenta.
     * @param sal: saldo de cuenta.
     * @param tipo: tipo de cuenta (ahorro o credito)
     */             
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    /**
     * GETTER de nombre de cuenta.
     * @return devuelve el nombre en String del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }    
    /**
     * SETTER de nombre de la cuenta.    
     * @param nombre: recibe el nombre de el titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * GETTER del número de cuenta.
     * @return devuelve el número de la cuenta asociada al titular.
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * SETTER del número de cuenta.
     * @param cuenta recibe un número de cuenta que asocia a un titular
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * GETTER de saldo que posee el titular de la cuenta
     * @return el saldo disponible del titular de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * SETTER de saldo de titular asociado a la cuenta
     * @param saldo recibe una cantidad ingresada o resta una cantidad 
     * retirada.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Método que establece el tipo de interes aplicar al saldo 
     * @return el tipo de interes que se aplicara 
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    /**
     * Método que recibira el tipo de interese aplicar al saldo
     * @param tipoInterés recibe el tipo de interes aplicar.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    /**
     * Método donde se albergara el saldo de una cuenta.
     * @return devuelve el saldo de la cuenta gestiona en ese momento.
     */
    public double estado() {
        return saldo;
    }
    /**
     * 
     * @param cantidad: monto en decimales a ingresar, suma a la variable saldo.
     * @throws Exception si la cantidad a ingresar es negativa devulve esta excepción
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }
    /**
     * Método para retirar el dinero, si existe saldo y si la cantida no es 
     * negativa.
     * @param cantidad: monto en decimales a retirar, resta de la varable saldo.
     * @throws Exception existen dos, una para manejar las cantidades negativa
     * y la otra para el estado de la cuenta.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
}
