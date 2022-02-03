
package Clases;

import java.util.ArrayList;
/**
 * Representa los atributos y metodos de la mascota de un usuario común
 * @author Josep Palomino
 */
public class Pet {
    /**
     * Representa el nombre de la mascota
     */
    public String name;
    /**
     * Representa la raza de la mascota
     */
    public String race;
    /**
     * Representa si la mascota presenta alergias
     */
    private boolean allergies;
    /**
     * Devuelve el valor del atributo "name"
     * @return Valor del atributo "name"
     */
    public String getName(){
        return name;
    }
    /**
     * Establece un nuevo valor para el atributo "name"
     * @param name valor de la nueva unidad del atributo "name"
     */
    public void setName(String name){
        this.name=name;
    }
}
