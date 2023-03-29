/*

 */
package SuperClase;


public class Bicicleta extends Vehiculo{
 
private String tipo; //Montaña, triciclo, etc.    

    public String getTipo() {
        return tipo;
    }
//------------------------------------------------------------------------------
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
//------------------------------------------------------------------------------

    public Bicicleta(String tipo, String marca, String color) {
        super(marca, color);
        this.tipo = tipo;
    }
//------------------------------------------------------------------------------
    
    public Bicicleta(String tipo) {
        super();
        this.tipo = "---";
    }


    
    
    
}
