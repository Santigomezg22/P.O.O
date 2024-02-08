/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzaeria;

/**
 *
 * @author Usuario
 */
public class Pizza
{
    private String Nombre;
    private double CostoProduccion;
    private int CantidadProducida;
    private double PrecioVenta;
    //metodos
    
    public int DarCantidadProducida (){
        return CantidadProducida;
    }
    
    public void ModificarPrecioVenta(double nuevoPrecio){
    PrecioVenta=nuevoPrecio;
}
    public double darGananciaUnitaria(){
    return PrecioVenta-CostoProduccion;

}
//metodo constructot

    public Pizza (String nNombre, double nCosto, int Cantidad, double Precio){
    this.Nombre=nNombre;
    this.CostoProduccion=nCosto;
    this.CantidadProducida=Cantidad;
    this.PrecioVenta=Precio;
}

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    public double getCostoProduccion()
    {
        return CostoProduccion;
    }

    public void setCostoProduccion(double CostoProduccion)
    {
        this.CostoProduccion = CostoProduccion;
    }

    public int getCantidadProducida()
    {
        return CantidadProducida;
    }

    public void setCantidadProducida(int CantidadProducida)
    {
        this.CantidadProducida = CantidadProducida;
    }

    public double getPrecioVenta()
    {
        return PrecioVenta;
    }

    public void setPrecioVenta(double PrecioVenta)
    {
        this.PrecioVenta = PrecioVenta;
    }
    
}