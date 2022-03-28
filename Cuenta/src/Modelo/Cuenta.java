package Modelo;

public class Cuenta {

    private int noCuenta;
    private String nombreCliente;
    private double saldo;
    public double ingre;

    public Cuenta() {
        this.noCuenta = 0;
        this.nombreCliente = "";
        this.saldo = 0;
    }

    public int getNoCuenta() {return noCuenta;}
    public void setNoCuenta(int noCuenta) {this.noCuenta = noCuenta;}
    public String getNombreCliente() {return nombreCliente;}
    public void setNombreCliente(String nombreCliente) {this.nombreCliente = nombreCliente;}
    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}

    public boolean consignar(double monto) {
        boolean verdad = false;
        if (monto != 0) {
            verdad = true;
        }

        return verdad;
    }

    public boolean retirar(double monto) {
        boolean verdad = false;
        if (monto != 0) {
            verdad = true;
        }

        return verdad;
    }

}
