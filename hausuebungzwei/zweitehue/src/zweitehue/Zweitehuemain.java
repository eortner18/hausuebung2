/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zweitehue;

import java.util.stream.IntStream;

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
       numbertester.setPalindromeTester((number) -> {
           
           return number == IntStream.iterate(number, i -> i / 10)
                   .map(n -> n % 10)
                   .limit(String.valueOf(number).length())
                   .reduce(0, (a, b) -> a = a * 10 + b); 
       });
    }
    
}
