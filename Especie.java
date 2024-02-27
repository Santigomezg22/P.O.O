/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Especie {
    //atributos
    private String Tipo;
    private String Alimentacion;
    private Animal MatAnimal[][]=new Animal[2][2];
    
    //metodo constructor

    public Especie(String Tipo, String Alimentacion) {
        this.Tipo = Tipo;
        this.Alimentacion = Alimentacion;
    }
  
    public Especie (String Tipo, String Alimentacion, Animal ani[][]){
        this.Tipo=Tipo;
        this.Alimentacion=Alimentacion;
        this.MatAnimal=ani;
    }
//getters setters

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getAlimentacion() {
        return Alimentacion;
    }

    public void setAlimentacion(String Alimentacion) {
        this.Alimentacion = Alimentacion;
    }

    public Animal[][] getMatAnimal() {
        return MatAnimal;
    }

    public void setMatAnimal(Animal[][] MatAnimal) {
        this.MatAnimal = MatAnimal;
    }
    
 //metodos
    public void InsertarAnimal(int i, int j, Animal animal){
        this.MatAnimal[i][j]=animal;
        
    }
    
    public String MuestraDatosEspecie(){
        String Datos="Tipo: "+this.Tipo+"\n";
        Datos+="Alimentacion"+this.Alimentacion+"\n";
        for (int i = 0; i < MatAnimal.length; i++) {
            for (int j = 0; j < MatAnimal[i].length; j++) {
                Datos+=MatAnimal[i][j].MuestraDatos();
                
            }
  
        }
        return Datos;
    }
    public void ModificarNombre(int id){
    Scanner sc  = new Scanner(System.in);    
        for (int i = 0; i < MatAnimal.length; i++) {
            for (int j = 0; j < MatAnimal[i].length; j++) {
                if(id==MatAnimal[i][j].getIdAnumal())
                    System.out.println("Nuevo Nombre");
                String nombre=sc.next();
                MatAnimal[i][j].setNombre(nombre);
                
            
                    }
        }
    
        
    }
    
    
    
}
