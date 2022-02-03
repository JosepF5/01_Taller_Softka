package Clases;
/**
 * Representa los atributos y metodos del carro de un usuario común
 * @author Josep Palomino
 */
public class Car {
    /**
     * Representa la marca del carro
     */
    public String label;
    /**
     * Representa el modelo del carro
     */
    public String model;
    /**
     * Representa el color del carro
     */
    public String color;
    /**
     * Representa que tantos años tiene de uso el carro
     */
    public int age;
    /**
     * Representa el tamaño del carro
     */
    public float size;
    /**
     * Devuelve el valor del atributo "color"
     * @return Valor del atributo "color"
     */
    public String getColor(){
        return color;
    }
    /**
     * Establece un nuevo valor para el atributo "activated"
     * @param color valor de la varissable a cambiar
     */
    public void setColor(String color){
        this.color=color;
    }
    /**
     * Reporta que tan antiguo es el vehículo
     * @param age valor de la variable a consultar
     * @return Devuelve un mensaje acerca de la antiguedad del vehiculo
     */
    private String getAntiquity(int age){
        String msg;
        if(age>3){
            msg="Antiguo";
            return msg;
        }
        else{
            msg="Nuevo";
            return msg;
        }
    }
    
}
