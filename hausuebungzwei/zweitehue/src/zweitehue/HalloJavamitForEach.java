/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zweitehue;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author elias
 */
public class HalloJavamitForEach {

    List<String> liste = new ArrayList<>();

    public void forEachAusgabe() {
        liste.add("hallo");
        liste.add("hallo2");
        liste.add("hallo3");

        for (String sarhah : liste) {
            System.out.println(sarhah);
        }
        liste.forEach((String forEachString) -> System.out.println(forEachString));
    }

    public void fEhinzufuegen(String s) {
        liste.add(s);
    }

}
