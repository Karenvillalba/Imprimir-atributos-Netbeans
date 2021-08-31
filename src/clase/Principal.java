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
public class Principal {
    //Karen Villalba
    public static void main(String[] args) {
        Persona person = new Persona ();
        //Asignamos los valores
        person.setAltura(1.55);
        person.setPeso(60.0);
        person.setEdad(20);
        person.setSexo('F');
        person.setNombre("Karen");
        System.out.println("Altura: " + person.getAltura());
        System.out.println("Peso: " + person.getPeso());
        System.out.println("Edad: " +  person.getEdad());
        System.out.println("Nombre: " + person.getNombre());
        System.out.println("Sexo: " + person.getSexo());
}
}