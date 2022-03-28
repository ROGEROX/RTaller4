package Vista;

import Modelo.Informe;
public class Trabajo {
    public static void main(String[] args) {
        
        
        double ventas[] = {19420.52,6233.82,70323.21,95000,60214.5,52000,4444,
        921410,30196,793210,32476,620412};
        
        Informe informe = new Informe();
        System.out.println("Informe de ventas del año\n");
        
        informe.getVentas(ventas);
        
        informe.setPromVentas(ventas);
        informe.setMenorVenta(ventas);
        informe.setMayorVenta(ventas);
        
        System.out.printf("\nEl promedio de ventas en el año es de %.2f\n",informe.getPromVentas());
        System.out.printf("El número más bajo de ventas es de %.2f\n",informe.getMenorVenta());
        System.out.printf("El número más alto de ventas es de %.2f\n",informe.getMayorVenta());
        System.out.printf("El acumulado de las ventas este año fue de %.2f\n\n",informe.getVentasaño());   
    }
}
