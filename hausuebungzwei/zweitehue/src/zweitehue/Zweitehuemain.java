/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zweitehue;

/**
 *
 * @author elias
 */
public class Zweitehuemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NumberTester numbertester = new NumberTester("");
       Erasthotiles e = new Erasthotiles(5);
       numbertester.setOddEven((i) -> (i%2) == 0);
       numbertester.setPrimeTester((i) -> e.isPrime(i));
    }
    
}
