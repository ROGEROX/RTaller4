package Modelo;

public class Habitacion {
    private double largo;
    private double ancho;
    private double altura;
    
    public Habitacion(){
        
        this.largo = 0;
        this.ancho = 0;
        this.altura = 0;
    }
    
    public void setLargo(double largo){this.largo = largo;}
    public void setAncho(double ancho){this.ancho = ancho;}
    public void setAltura(double altura){this.altura = altura;}
    
    public double enchapar(){
        
        double Enchape = this.largo*this.ancho;
        double TotalEnchape = Enchape+Enchape*0.15;
        
        return TotalEnchape;
    }
    
    public double tapizar(String decision){
        
        double tapiz = this.ancho*this.altura;
        double TotalTapiz;
        
        if(decision.equals("L")){
            TotalTapiz = tapiz/4.2;
        }else{
            TotalTapiz = tapiz/4.6;
        }
        
        return TotalTapiz;
    }
}