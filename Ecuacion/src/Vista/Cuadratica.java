package Vista;

import Modelo.Ecuacion;
import java.util.Scanner;
public class Cuadratica {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Ecuacion ecuacion = new Ecuacion();
        double a,b,c;
        char cambio;
        
        System.out.println("Cálculo de la ecuación cuadratica\n");
        
        System.out.print("Digite el valor de a: ");a = sc.nextDouble();
        System.out.print("Digite el valor de b: ");b = sc.nextDouble();
        System.out.print("Digite el valor de c: ");c = sc.nextDouble();
        
        while(4*a*c > Math.pow(b,2)){
            System.out.println("\nEl valor interno de la raiz no debe ser negativo, "
                            + "digite otro valores para a o c");
            
            System.out.print("\n[a/c] ");
            cambio = Character.toLowerCase(sc.next().charAt(0));
            
            if(cambio == 'a'){
                System.out.print("Cambie el valor: ");a = sc.nextDouble();
            }else{
                System.out.print("Cambie el valor: ");c = sc.nextDouble();
            }
        }
        
        ecuacion.setA(a);
        ecuacion.setB(b);
        ecuacion.setC(c);
        System.out.printf("\nEl valor de la raíz es %.2f\n",ecuacion.raiz());
        ecuacion.ecuacionCuadratica();
        
        double x;
        System.out.print("\nDigite un valor de x para evaluarlo: ");
        x = sc.nextDouble();
        
        if(ecuacion.probar_X(x)){
            System.out.println("\nEl valor de x cumple la igualdad en la ecuación");
        }else{
            System.out.println("\nEl valor de x no cumple la igualdad de la ecuación");
        }
    }
}
