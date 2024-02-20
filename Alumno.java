/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;

/**
 *
 * @author Usuario
 */
public class Alumno{
    //Atributos
    private String Nombre;
    private int Edad;
    private String Sexo;

    //metodo constructor
    
    public Alumno(String Nombre, int Edad, String Sexo)
    {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }
   
    //getters setters

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    public int getEdad()
    {
        return Edad;
    }

    public void setEdad(int Edad)
    {
        this.Edad = Edad;
    }

    public String getSexo()
    {
        return Sexo;
    }

    public void setSexo(String Sexo)
    {
        this.Sexo = Sexo;
    }
    
    public String MuestraDatos(){
        String Datos ="Nombre: "+this.Nombre+"\n";
        Datos+="Edad: "+this.Edad+"\n";
        Datos+="Sexo: "+this.Sexo+"\n";
        return Datos;
    }
    
}
