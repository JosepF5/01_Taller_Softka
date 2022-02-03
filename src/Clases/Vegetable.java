
package Clases;

import java.util.ArrayList;

public class Vegetable {
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;
    
    public ArrayList<String> getColors(){
        return colors;
    }
    
    public void setColor(String name){
        this.name=name;
    }
}
