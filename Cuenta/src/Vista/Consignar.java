package Vista;

import Modelo.Cuenta;
import java.util.Scanner;

public class Consignar {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Bienvenido \n");
        Cuenta cuenta1 = new Cuenta();
        
        int cuenta;
        String nomCuenta;
        double dinero,dinero2,dinero3;
        System.out.print("Digite su numero de cuenta: ");cuenta=entrada.nextInt();
        System.out.print("Digite el nombre de cuenta: ");nomCuenta=entrada.next();
        System.out.print("Digite su saldo de su cuenta: ");dinero=entrada.nextDouble();
        
        cuenta1.setNoCuenta(cuenta);
        cuenta1.setNombreCliente(nomCuenta);
        cuenta1.setSaldo(dinero);
        
        char saldo2;
        System.out.print("\nDesea consignar dinero? [S/N]");
        saldo2=Character.toUpperCase(entrada.next().charAt(0));
        
        if(saldo2 == 'S'){
             System.out.print("Cuanto dinero desea consignar? ");dinero2=entrada.nextDouble();
             cuenta1.consignar(dinero2);
        }
        
        char saldo3;
        System.out.print("\nDesea retirar dinero? [S/N]");
        saldo3=Character.toUpperCase(entrada.next().charAt(0));
        
        if(saldo3 == 'S'){
             System.out.print("Cuanto dinero desea retirar? ");dinero3=entrada.nextDouble();
             cuenta1.retirar(dinero3);
        }
    }
}
