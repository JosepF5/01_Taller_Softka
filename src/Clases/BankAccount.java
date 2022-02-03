
package Clases;

import java.util.ArrayList;
/**
 * Representa los atributos y metodos de una cuenta bancaria de un usuario común
 * @author Josep Palomino
 */
public class BankAccount {
    /**
     * Representa el numero de la cuenta bancaria del usuario.
     */
    private int accountNumber;
    /**
     * Representa el estado de la cuenta bancaria del usuario.
     */
    protected boolean activated;
    /**
     * Devuelve el valor del atributo "activated"
     * @return Valor del atributo "activated"
     */
    public boolean getActivated(){
        return activated;
    }
    /**
     * Establece un nuevo valor para el atributo "activated"
     * @param activated valor de la variable a cambiar
     */
    public void setActivated(boolean activated){
        this.activated=activated;
    }
}
