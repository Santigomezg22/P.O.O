/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escuela;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Escuela
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     // crear arreglo estatico de 3 objetos
        Alumno arrayAlumno [] = new Alumno[3];
        
    //llenar los objetos por cada posicion 
    //nombre del arreglo- posicion- = new Clae (parametros del Modo Constructor
     arrayAlumno[0]= new Alumno("Ana",10,"F");       
    arrayAlumno[1]= new Alumno("Punky",11,"F");
    arrayAlumno[2]= new Alumno("Luisa",12,"F");
    
    //recorremos y mostramos los datos del arreglo
        for (int i = 0; i < arrayAlumno.length; i++){
            System.out.println(arrayAlumno[i].MuestraDatos());
            
        }
        
        //###################################################################
        //Arreglos dinamicos
        
        //crreamos arreglos dinamicos
        ArrayList <Alumno> listaAlumno = new ArrayList <Alumno>();
        
        //llenamos los datos 
        listaAlumno.add(new Alumno("Juan",25,"M"));
        listaAlumno.add(new Alumno("Punky",26,"M"));
        listaAlumno.add(new Alumno("Maria",27,"F"));
        
        
        System.out.println("Nombre: ");
        String nombre=sc.next();
        System.out.println("Edad: ");
        int edad=sc.nextInt();
        System.out.println("Sexo: ");
        String sexo=sc.next();
        //agregando un nuevo objeto en el arreglo 
        listaAlumno.add(new Alumno(nombre, edad,sexo));
        
        
        
        
        //recorrer arreglo dinamico
        
        for (int i = 0; i < listaAlumno.size(); i++){
            Alumno e = listaAlumno.get(i);
            System.out.println(e.MuestraDatos());
            
        }
        
        //CREACION DEL MENU
        
   while(true){
       
       
       
       
   }
    }
  
}
