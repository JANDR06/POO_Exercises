/*
Ejercicio 1. Crea una clase Cuenta con los métodos ingreso, reintegro y
transferencia. La clase contendrá los métodos getters y setters.
 */

package exercises.exercise1y2;

public class Cuenta {

    // ATRIBUTOS
    private static final String CODIGO_CUENTA = "ES33";
    private double saldo;
    private String titular;
    private String numCuenta;
    private static int num;

    // CONSTRUCTORES
    public Cuenta(String titular) {
        this.titular = titular;
        saldo = 50;
        numCuenta = CODIGO_CUENTA + num;
        num++;
    }

    public Cuenta(String titular, double saldo) {
        this(titular);
        this.saldo = saldo;
    }

    // GETTERS
    public double getSaldo() { return saldo; }

    public String getTitular() { return titular; }

    public String getNumCuenta() {return numCuenta; }

    // SETTERS
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // METODO INGRESO
    public boolean ingreso(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            return true;
        }
        return false;
    }

    // METODO REINTEGRO
    public boolean reintegro(double cantidad){
        if(cantidad > 0 && saldo >= cantidad){
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    // METODO TRANSFERENCIA
    public boolean transferencia(double cantidad, Cuenta cuentaDestino) {
        if(reintegro(cantidad))
            if(cuentaDestino.ingreso(cantidad))
                return true;
        return false;
    }

    @Override
    public String toString(){
        return "Titular: " + titular + " NUMCuenta: " + numCuenta + " y con saldo: " + saldo;
    }

}