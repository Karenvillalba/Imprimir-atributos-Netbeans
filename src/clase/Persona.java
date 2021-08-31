/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Karen
 */
public class Persona {
    // Karen Villalba
    // Atributos
    private Double altura;
    private Double peso;
    private Integer edad;
    private String nombre;
    private char sexo;
  
//obtener valor de altura
    public Double getAltura() {
        return altura;
    }
    //Asigna valor a altura

    public void setAltura(Double altura) {
        this.altura = altura;
    }
//obtiene valor de peso

    public Double getPeso() {
        return peso;
    }
//obtiene valor de peso

    public void setPeso(Double peso) {
        this.peso = peso;
    }
//obtiene valor de Edad

    public Integer getEdad() {
        return edad;
    }
//Asigna valor a Edad

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}
