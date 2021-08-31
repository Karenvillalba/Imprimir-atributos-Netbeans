/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovil_tarea;

/**
 *
 * @author Karen
 */
public class Automovil {
    //KAREN VILLALBA BRITEZ
    private String Marca;
    private String Modelo;
    private String Color;
    private String Matricula;
    private Integer Año;
    private String Precio;
    
    public Integer getAño() {
        return Año;
    }

    public void setAño(Integer Año) {
        this.Año = Año;
    }
    
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }
    
}
