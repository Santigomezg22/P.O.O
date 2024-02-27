/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author Usuario
 */
public class Animal {
  static int id=1;  
   // atributos
  private int IdAnumal;  
  private String Nombre;
  private int Edad;
  private String Color;
  private String Tamnio;
  
  //metodo constructor

    public Animal(String Nombre, int Edad, String Color, String Tamnio) {
        this.IdAnumal=Animal.id++;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Color = Color;
        this.Tamnio = Tamnio;
    }
    
    //Getters setters

    public int getIdAnumal() {
        return IdAnumal;
    }

    public void setIdAnumal(int IdAnumal) {
        this.IdAnumal = IdAnumal;
    }
    
    
    
    public String getNombre(){
        return Nombre;
        
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTamnio() {
        return Tamnio;
    }


    public void setTamnio(String Tamnio) {
        this.Tamnio = Tamnio;
    }


    //mostrar datos

    public String MuestraDatos() {
        String Datos="ID: "+this.IdAnumal+"\n";
        Datos+="Nombre: "+this.Nombre+"\n";
        Datos+="Edad: "+this.Edad+"\n";
        Datos+="Color: "+this.Color+"\n";
        Datos+="Tamanio: "+this.Tamnio+"\n";
        return Datos;        
                }
    
     
}
