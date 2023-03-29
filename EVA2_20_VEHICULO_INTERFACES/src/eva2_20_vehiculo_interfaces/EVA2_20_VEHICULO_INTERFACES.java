/*
Velocidad entero no tiene set, si tiene método get
marca métoos get y set
acelerar(entero/int)
detener
imprimirVel
 */
package eva2_20_vehiculo_interfaces;

import SuperClase.Automovil;


public class EVA2_20_VEHICULO_INTERFACES {


    public static void main(String[] args) {
     Automovil auto = new Automovil("Sentra", 2010, "NISSAN", "Blanco");
     auto.acelerar();
     auto.imprimirVel();
     auto.data();
        
    }
    
}
