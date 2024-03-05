/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Admin
 */
public class Autobus
{
    private String linea;
    private String origen;
    private String destino;
    private String horaSalida;
    private String fecha;
    private int numAutobus;
    private int numAsientos;
    private double precio;

    public Autobus(String linea, String origen, String destino, String horaSalida, String fecha, int numAutobus, int numAsientos, double precio)
    {
        this.linea = linea;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.fecha= fecha;
        this.numAutobus = numAutobus;
        this.numAsientos = numAsientos;
        this.precio = precio;
        
    }

    public Autobus()
    {
    }
   
    public String getLinea()
    {
        return linea;
    }

    public void setLinea(String linea)
    {
        this.linea = linea;
    }

    public String getOrigen()
    {
        return origen;
    }

    public void setOrigen(String origen)
    {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino()
    {
        return destino;
    }

    public void setDestino(String destino)
    {
        this.destino = destino;
    }

    /**
     * @return the horaSalida
     */
    public String getHoraSalida()
    {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida)
    {
        this.horaSalida = horaSalida;
    }
    
    public String getfecha()
    {
        return fecha;
    }

    public void setfecha(String fecha)
    {
        this.fecha = fecha;
    }

    public int getNumAutobus()
    {
        return numAutobus;
    }

    public void setNumAutobus(int numAutobus)
    {
        this.numAutobus = numAutobus;
    }

    public int getNumAsientos()
    {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos)
    {
        this.numAsientos = numAsientos;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    
    public void desp()
    {
        System.out.printf(linea, origen, destino,  horaSalida, fecha, numAutobus, numAsientos,  "$" + precio);
    }
}

