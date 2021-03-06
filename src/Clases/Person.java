
package Clases;

import java.util.Date;
/**
 * Representa los atributos y metodos de un usuario común
 * @author Josep Palomino
 */
public class Person {
    /**
     * Representa el nombre de una persona
     */
    public String name;
    /**
     * Representa el apellido de una persona
     */
    public String lastName1;
    /**
     * Representa el segundo apellido de una persona
     */
    public String lastName2;
    /**
     * Representa la fecha de nacimiento de una persona
     */
    public Date dateBirth;
    /**
     * Representa el peso de una persona
     */
    public float height;
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
