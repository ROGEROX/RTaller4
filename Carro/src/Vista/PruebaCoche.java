package Vista;

import Modelo.Coche;

public class PruebaCoche {
    public static void main(String[] args) {
                
        System.out.println("Coche 1\n");
        Coche coche1 = new Coche("Rojo","Ferrari","2023","FER-314",2500,2);
        coche1.estado();
        
        System.out.println("Coche 2\n");
        Coche coche2 = new Coche("Amarillo","Lamborghini","2000","LB-078",1500,2);
        coche2.estado(); 
        
        System.out.println("Coche 3\n");
        Coche coche3 = new Coche("Negro","Mercedes","2015","GT-1014",2000,4);
        coche3.estado(); 
    }
}
