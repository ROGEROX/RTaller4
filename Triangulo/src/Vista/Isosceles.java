package Vista;

import Modelo.Medidas;
import java.util.Scanner;

public class Isosceles {
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
        Medidas triangulo = new Medidas();
        
        double altura,base;
        System.out.println("Conociendo el triángulo isósceles\n");
        
        System.out.print("Digite la altura del triángulo: ");
        altura = sc.nextDouble();
        System.out.print("Digite el tamaño de la base: ");
        base = sc.nextDouble();
        
        triangulo.setAltura(altura);
        triangulo.setBase(base);
        
        System.out.printf("\nEl área del triangulo es igual a %.2f\n",triangulo.area());
        System.out.printf("La longitiud de sus lados iguales es %.2f\n",triangulo.longitud());
        System.out.printf("El perimetro que conforma el triangulo es %.2f\n",triangulo.perimetro());
        
        System.out.printf("\nEl tamaño de los ángulos inferiores es de %.2f°\n",triangulo.angulo());
        System.out.printf("El tamaño del angulo superior es de %.2f°\n",triangulo.angulo2());

    }
}
