
package Clases;

import java.util.ArrayList;
/**
 * Representa los atributos y metodos de la fruta de un usuario común
 * @author Josep Palomino
 */
public class Fruit {
    /**
     * Representa el nombre de la fruta
     */
    public String name;
    /**
     * Representa el peso promedio de la fruta
     */
    private float averageWeight;
    /**
     * Representa los colores que posee la fruta
     */
    public ArrayList<String> colors;
    /**
     * Devuelve el valor del atributo "colors"
     * @return Valor del atributo "colors"
     */
    public ArrayList<String> getColors(){
        return colors;
    }
    /**
     * Establece un nuevo valor para el arreglo "colors"
     * @param name valor de la nueva unidad del arreglo "colors"
     */
    public void setColor(String name){
        colors.add(name);
    }
}
