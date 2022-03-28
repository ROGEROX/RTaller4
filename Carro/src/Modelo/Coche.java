package Modelo;

public class Coche {
    private String color;
    private String marca;
    private String modelo;
    private String matricula;
    private int noCaballos;
    private int noPuertas;
    
    public Coche(String _color, String _marca, String _modelo,
            String _matricula, int caballos, int puertas){
        
        this.color = _color;
        this.marca = _marca;
        this.modelo = _modelo;
        this.matricula = _matricula;
        this.noCaballos = caballos;
        this.noPuertas = puertas;
    }
    
    public void estado(){
        
        System.out.printf("Marca: %s\n"
                         + "Modelo: %s\n"
                         + "Matricula: %s\n"
                         + "Color: %s\n"
                         + "Caballos de fuerza: %d\n"
                         + "Numero de puertas: %d\n\n",marca,modelo,
                         matricula,color,noCaballos,noPuertas);    
    }
}
