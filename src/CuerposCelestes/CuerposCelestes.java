/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuerposCelestes;

import java.util.ArrayList;

/**
 *
 * @author Juan José González G
 */
public class CuerposCelestes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> cuerpos = new ArrayList<>();
        
        cuerpos.add("Sol");
        cuerpos.add("Mercurio");
        cuerpos.add("Venus");
        cuerpos.add("Tierra");
        cuerpos.add("Marte");
        cuerpos.add("Júpiter");
        cuerpos.add("Saturno");
        cuerpos.add("Urano");
        cuerpos.add("Neptuno");
                
        System.out.println("Número elementos " + cuerpos.size());
        System.out.println(cuerpos);
        
        cuerpos.forEach((cuerpo) -> {
            System.out.println(cuerpo);
        });
        
        cuerpos.remove(0);
        cuerpos.remove("Mercurio");
    }
    
}
