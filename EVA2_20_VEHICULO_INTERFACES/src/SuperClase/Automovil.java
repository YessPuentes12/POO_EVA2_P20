/*

 */
package SuperClase;


public class Automovil extends Vehiculo{
 private String modelo;
 private int año;   

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
//------------------------------------------------------------------------------
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
//------------------------------------------------------------------------------

    public Automovil(String modelo, int año, String marca, String color) {
        super(marca, color);
        this.modelo = modelo;
        this.año = año;
    }
//------------------------------------------------------------------------------
    
    public Automovil() {
        super();
        this.modelo = "---";
        this.año = 0;
    }


 

    
    
}
