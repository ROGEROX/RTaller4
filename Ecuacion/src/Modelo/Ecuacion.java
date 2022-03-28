package Modelo;

public class Ecuacion {
    private double a;
    private double b;
    private double c;
    
    public Ecuacion(){
        
        a = 0;
        b = 0;
        c = 0;
    }
    
    public void setA(double coeficiente1){a = coeficiente1;}
    public void setB(double coeficiente2){b = coeficiente2;}
    public void setC(double coeficiente3){c = coeficiente3;}
    
    public double raiz(){
        
        double cuadrado = Math.pow(b,2);
        double raiz = Math.sqrt(cuadrado - (4*a*c));
        return raiz;
    }
    public void ecuacionCuadratica(){
        System.out.printf("Ecuacion: %.0fx²%+.0fx%+.0f = 0\n",a,b,c);
    }
    public boolean probar_X(double x){
        
        double resultado = a*Math.pow(x,2)+b*x+c;
        return resultado == 0;
    }
}
