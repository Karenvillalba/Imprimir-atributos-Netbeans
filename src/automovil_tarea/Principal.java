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
public class Principal {
// KAREN VILLALBA BRITEZ
    public static void main(String[] args) {
        Automovil auto = new Automovil ();
        auto.setMarca("Volkswagen");
        auto.setModelo("PASSAT CC SPORT 2.0");
        auto.setMatricula("KAV 015");
        auto.setAño(2013);
        auto.setColor("Negro");
        auto.setPrecio("30.000.000 Gs");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Matricula: " + auto.getMatricula());
        System.out.println("Año: " + auto.getAño());
        System.out.println("Color: " + auto.getColor());
        System.out.println("Precio: " + auto.getPrecio());
    }
    
}
