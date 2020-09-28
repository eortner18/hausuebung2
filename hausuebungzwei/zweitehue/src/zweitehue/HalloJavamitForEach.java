/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zweitehue;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author elias
 */
public class HalloJavamitForEach {
    
    List<String> liste = new ArrayList<>();
    
    
    public void forEachAusgabe()
    {
        liste.add("hallo");
        liste.add("fEhinzufügen is kagge");
        liste.add("Onii-chan");
        
        for (String sarhah: liste) {
            System.out.println(sarhah);
        }
        
    }
    public void fEhinzufuegen(String s)
    {
    liste.add(s);
    }
    
}
