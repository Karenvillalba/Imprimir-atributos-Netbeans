# Imprimir-atributos-Netbeans
Imprimir por consola en la clase principal los valores de los atributos 
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
