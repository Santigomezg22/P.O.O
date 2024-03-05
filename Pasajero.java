/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Admin
 */
public class Pasajero
{
    private String nom;   
    private String pap;
    private String sap;
    private String boleto;
    private int numAsiento;

    public Pasajero(String nom, String pap, String sap, String boleto, int numAsiento)
    {
        this.nom = nom;
        this.pap = pap;
        this.sap = sap;
        this.boleto = boleto;
        this.numAsiento = numAsiento;
    }

    public Pasajero()
    {
    }

    Pasajero(String nom, String pApe, String sApe, int nAsien)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPap()
    {
        return pap;
    }

    public void setPap(String pap)
    {
        this.pap = pap;
    }

    public String getSap()
    {
        return sap;
    }

    public void setSap(String sap)
    {
        this.sap = sap;
    }

    public String getBoleto()
    {
        return boleto;
    }

    public void setBoleto(String boleto)
    {
        this.boleto = boleto;
    }

    public int getNumAsiento()
    {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento)
    {
        this.numAsiento = numAsiento;
    }
    public void generarNumBoleto(String nBol)
    {
        this.boleto= nBol + "A"+ this.numAsiento;
    }
    public void desp()
    {
        
    }         
}
