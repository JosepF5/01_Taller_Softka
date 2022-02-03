
package Clases;

/**
 * Representa los atributos y metodos de un libro de un usuario común
 * @author Josep Palomino
 */
public class Book {
    /**
     * Representa el nombre del libro
     */
    public String name;
    /**
     * Representa el autor del libro
     */
    public String author;
    /**
     * Representa el precio del libro
     */
    public double price;
    /**
     * Devuelve el valor del atributo "price"
     * @return Valor del atributo "price"
     */
    public String getPrice(){
        return name;
    }
    /**
     * Establece un nuevo valor para el atributo "price"
     * @param price valor de la nueva unidad del atributo "price"
     */
    public void setPrice(double price){
        this.price=price;
    }
}
