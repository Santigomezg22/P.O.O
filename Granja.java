/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package granja;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Granja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        ArrayList<Especie> ListEspecie = new ArrayList<Especie>();
    
    //INSERTAR DATOS
    
   ListEspecie.add(new Especie("Gatos"," Carne") );
   ListEspecie.get(0).InsertarAnimal(0, 0, new  Animal("Garras",2,"Gris","Ch"));
   ListEspecie.get(0).InsertarAnimal(0, 1, new  Animal("Femboy",2,"Blanco","Ch"));
   ListEspecie.get(0).InsertarAnimal(1, 0, new  Animal("Punky",2,"Negro","Ch"));
   ListEspecie.get(0).InsertarAnimal(1, 1, new  Animal("Manchas",2,"Pardo","Ch"));
   
   ListEspecie.add(new Especie("Conejos"," Zanahoria") );
   ListEspecie.get(1).InsertarAnimal(0, 0, new  Animal("Bombom",1,"Gris","Ch"));
   ListEspecie.get(1).InsertarAnimal(0, 1, new  Animal("Pelusa",1,"Blanco","Ch"));
   ListEspecie.get(1).InsertarAnimal(1, 0, new  Animal("Canela",1,"Negro","Ch"));
   ListEspecie.get(1).InsertarAnimal(1, 1, new  Animal("Lola",1,"Pardo","Ch"));
   
   //Mostrar datos
        for (int i = 0; i < ListEspecie.size(); i++) {
            System.out.println(ListEspecie.get(i).MuestraDatosEspecie());
        }

        System.out.println("Que animal desea modificar ");
        int id = sc.nextInt();
        for (int i = 0; i < ListEspecie.size(); i++) {
            System.out.println(ListEspecie.get(i).MuestraDatosEspecie());  
            
        }
                       
    }
    
}
