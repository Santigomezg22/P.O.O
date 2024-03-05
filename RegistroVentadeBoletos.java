/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class RegistroVentadeBoletos
{

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args)
    {
        Autobus[] autobuses = new Autobus[1];
        Pasajero[][] matPasajeros = new Pasajero[1][];
        int op;
        System.out.println(" Menu ");
        System.out.println("1. Registro de Autobús ");
        System.out.println("2. Modificaciones de precios por Autobús");
        System.out.println("3. Consuulta de Autobuses ");
        System.out.println("4. Registro de Venta por boleto");
        System.out.println("5. Consulta por número de Autobús");
        System.out.println("6. Salir");
        System.out.println(" Elige una opción ");
        do
        {
            op = leer.nextInt();
            leer.nextLine();
            switch (op)
            {
                case 1:
                    autobuses = insertarAutobus(autobuses);
                    matPasajeros= gestionarMatriz(autobuses,matPasajeros);
                    break;
                case 2:
                    cambiarPrecio(autobuses);
                case 3:
                    desplegarAutobuses(autobuses);
                case 4:
                    agregarDatosPasajero(autobuses,matPasajeros);
                case 5:
                     desplegarPasajeros(autobuses,matPasajeros);
                case 6:
                    System.out.println(" Saliendo....");
                default:
                    System.out.println("Opcion no disponible. ");
            }
            System.out.println("Ingresa una opcion del menu");
        }while (op!=6);
    }
    public static void desplegarAutobuses(Autobus[] autobuses)
    {
        String separar= "-----------------------------------------------------------------------------------------------";
        System.out.printf( "LineaT", "nRastreo", "Origen", "Destino", "FechaSalida", "HoraSalida", "PrecioBoleto");
        System.out.println(separar);
        for (int i = 0; i < autobuses.length&&autobuses[i]!=null; i++)
        {
            autobuses[i].desp();
        }
        System.out.println(separar);
    }
    
     public static void cambiarPrecio(Autobus[] autobuses)
    {
        System.out.println("Ingresa el Número del Autobus que quieres modificar su precio de boleto:");
        int nAut = leer.nextInt();
        leer.nextLine();
        int pos = buscarPorAutobus (autobuses, nAut);
        if(pos!=-1)
        {
            double aPrecio = autobuses[pos].getPrecio();
            String mensaje = (aPrecio) + ".";
            System.out.println("El precio del boleto para el Autobus " + nAut + " actualmente es de $" + mensaje);
            double nPrecio = cambiarPrecioBoleto();
            if (aPrecio==nPrecio)
            {
                System.out.println("El precio es igual. No se registraron cambios.");
            } else
            {
                autobuses[pos].setPrecio(nPrecio);
                System.out.println("Se cambio el precio por boleto de $" + aPrecio + " a $" + nPrecio + ".");
            }
        } else
        {
            System.out.println("No se encontro ningun Autobus con ese Número.");
        }
    }
     
     public static void agregarDatosPasajero(Autobus[] autobuses, Pasajero[][] pasajeros)
    {
        String nom, pApe,sApe;
        int nRes, nAut = 0, nAsien = 0;
        boolean salida = false;
        System.out.println("Ingresa el nombre del pasajero: ");
        nom = leer.nextLine();
        System.out.println("Ingresa el primer apellido del pasajero: ");
        pApe = leer.nextLine();
        System.out.println("Ingresa el segundo apellido del pasajero: ");
        sApe = leer.nextLine();
        System.out.println("Ingresa el numero del autobus que tomara el pasajero: ");
        do
        {
            nRes = leer.nextInt();
            leer.nextLine();
            if (buscarPorAutobus(autobuses,nRes)==-1)
            {
                System.out.println("No hay ningun Autobus registrado con ese Número, ingresa otro:");
            } else
            {
                nAut = buscarPorAutobus(autobuses,nRes);
                if (asientosDisponibles(pasajeros,nAut)==0)
                {
                    System.out.println("Todos los asientos de ese autobus estan ocupados, ingresa otro:");
                } else
                {
                    salida = true;
                    boolean disp;
                    System.out.println("El Autobus elegido tiene " + autobuses[nAut].getNumAsientos() + " asientos.");
                    System.out.println("Puedes elegir un asiento entre 0 y " + (autobuses[nAut].getNumAsientos() - 1) + ".");
                    System.out.println("Ingresa el Número de asiento del pasajero: ");
                    do
                    {
                        nAsien = leer.nextInt();
                        leer.nextLine();
                        disp = asientoDisponible(pasajeros, nAut, nAsien);
                        String mensajeF = disp ? "Datos registrados." : "Asiento no disponible, ingresa otro:";
                        System.out.println(mensajeF);
                    } while (!disp);
                }
            }
        } while (!salida);
        pasajeros[nAut][nAsien] = new Pasajero(nom,pApe,sApe,nAsien);
        pasajeros[nAut][nAsien].generarNumBoleto(Integer.toString(nRes));
        System.out.println("Pasajero registrado con el Número de boleto " + pasajeros[nAut][nAsien].getBoleto()+ ".");
    }
    
    public static Pasajero[][] gestionarMatriz(Autobus[] arrAutob, Pasajero[][] matrizPas)
    {
        if(matrizPas[0]==null)
        {
            matrizPas = new Pasajero[1][arrAutob[0].getNumAsientos()];
            return matrizPas;
        } else
        {
            Pasajero[][] nuevaMatriz = new Pasajero[matrizPas.length+1][];
            for (int i = 0; i < matrizPas.length; i++) 
            {
                nuevaMatriz[i] = new Pasajero[matrizPas[i].length];
                for (int j = 0; j < matrizPas[i].length; j++) 
                {
                     nuevaMatriz[i][j]=matrizPas[i][j];
                }
            }
            nuevaMatriz[nuevaMatriz.length-1] = new Pasajero[arrAutob[arrAutob.length-1].getNumAsientos()];
            return nuevaMatriz;
        }
    }

    public static void desplegarPasajeros(Autobus[] autobuses, Pasajero[][] pasajeros)
    {
        System.out.println("Ingresa el numero de rastreo del autobus:");
        int numRae = leer.nextInt();
        leer.nextLine();
        int pos = buscarPorAutobus(autobuses,numRae);
        if(pos==-1)
        {
            System.out.println("No se encontro ningun autobus con ese numero de rastreo.");
        } else
        {
            String sep = ("-------------------------------------------------------------------------------------------------------------------");
            System.out.println(sep);
            System.out.println("Numero del Autobus: " + numRae + ".");
            System.out.println("Fecha de salida: " + autobuses[pos].getfecha()+ ".");
            System.out.println("Hora de salida: " + autobuses[pos].getHoraSalida() + ".");
            System.out.printf("%-15s %-10s %-10s %-10s %-15s %n", "Asiento", "Nombre", "apPat", "apMat", "Boleto");
            System.out.println(sep);
            for (int i = 0; i < pasajeros[pos].length && pasajeros[pos][i]!=null; i++) {
                pasajeros[pos][i].desp();
            }
            System.out.println(sep);
            System.out.println("Total vendido: $" + ((autobuses[pos].getNumAsientos()-asientosDisponibles(pasajeros,pos))*autobuses[pos].getPrecio()) + ".");
            System.out.println(sep);
        }
    }
    public static Autobus[] gestorArregloDinamico(Autobus[]arrAutobus)
    {
        Autobus[] arrnvo= new Autobus[arrAutobus.length+1];
        System.arraycopy(arrAutobus, 0, arrnvo, 0, arrAutobus.length);
        insertarDatosAutobus(arrnvo.length-1,arrnvo);
        return arrnvo;
    }
    public static Autobus[] insertarAutobus(Autobus[] arrAutobus)
    {
        if (arrAutobus[0]==null)
        {
            insertarDatosAutobus(0,arrAutobus);
            return arrAutobus;           
        }else
        {
            return gestorArregloDinamico(arrAutobus);
        }
    }
    public static void insertarDatosAutobus(int posicion, Autobus[] arrAutobus)
    {
        String line,orig,dest,horaS,fecS;
        int nRenglon,nAsientos;
        System.out.println("Ingresa Linea de Autobus: ");
        line= leer.nextLine();
        System.out.println("Origen del Autobus: ");
        orig=leer.nextLine();
        System.out.println("Ingresa el destino del Autobus: ");
        dest=leer.nextLine();
        System.out.println("Ingresa la hora de Salida: ");
        horaS=leer.nextLine();
        System.out.println("Ingresa la fecha de Salida: ");
        fecS=leer.nextLine();
        System.out.println("Ingresa el número de Autobus: ");
        do
        {
            nRenglon=leer.nextInt();
            leer.nextLine(); 
            if (buscarPorAutobus(arrAutobus,nRenglon)!=-1)
            {
                System.out.println("El número de Autobus ya esta asignado, ingresa otro: ");
            }
        } while (buscarPorAutobus(arrAutobus,nRenglon)!=-1);
        System.out.println("Ingresa la cantidad de Asientos en el Autobus: ");
        nAsientos=leer.nextInt();
        leer.nextLine();
        leer.nextLine();
        double precio = cambiarPrecioBoleto();
        arrAutobus[posicion]= new Autobus(line,orig,dest,horaS,fecS,nRenglon,nAsientos,precio);
        System.out.println("Autobus registrado.");
    }
    public static double cambiarPrecioBoleto ()
    {
        double precio;
        System.out.println("Ingresa el precio del boleto: ");
        precio = leer.nextDouble();
        leer.nextLine();
        if (precio <= 0)
        {
            System.out.println("El precio del boleto no puede ser menor o igual a cero. ");
            return cambiarPrecioBoleto();
        }
        return precio;
    }
    
    public static int buscarPorAutobus(Autobus[] arrAutobus, int nRenglon)
    {
        for (int i = 0; i < arrAutobus.length && arrAutobus[i] !=null ; i++)
        {
            if (nRenglon== arrAutobus[i].getNumAutobus())
            {
                return i;
            }
        }
        return -1;
    }  
    
    public static int asientosDisponibles(Pasajero[][] pasajeros, int nAutobus)
    {
        int asientosDisponibles= 0;
        for (int i = 0; i < pasajeros[nAutobus].length; i++)
        {
            if (pasajeros[nAutobus][i]==null)
            {
                asientosDisponibles++;
            }
        }
        return asientosDisponibles;
    }
    public static boolean asientoDisponible(Pasajero[][] pasajeros, int nAutobus, int nAsiento)
    {
        if(nAsiento<0)
        {
            return false;
        }
        int asientosAut = pasajeros[nAutobus].length-1;
        if (asientosAut<nAsiento)
        {
            return false;
        }
        else
        {
            if (pasajeros[nAutobus][nAsiento]==null)
            {
                return true;
            }
        }
        return false;
    }
}
