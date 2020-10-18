/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zweitehue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author elias
 */
public class NumberTester {

    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;
    String fileName;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public NumberTester() {
    }

    public void setOddEven(NumberTest oddTester) {
        this.oddTester = oddTester;

    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void testFile() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(this.fileName));
        String line = br.readLine();
        line = br.readLine();
        while (line != null) {

            final String[] input = line.split(" ");
            int intEingabe = Integer.parseInt(input[0]);
            int i2 = Integer.parseInt(input[1]);
            switch (intEingabe) {
                case 1:
                    if (oddTester.testNumber(i2) == true) {         //1) abfrage von integer 2 ob gerade
                        System.out.println("EVEN");                 //1.1) Wenn ja -> soutEVEN 
                    } else {                                        //1.2) Wenn nein -> soutODD
                        System.out.println("ODD");                  //2) abfrage von int2 ob Primzahl
                    }
                    break;                                      //2.1) Wenn ja -> soutPrime
                case 2:                                             //2.2) Wenn nein -> soutNO_PRIME
                    if (primeTester.testNumber(i2) == true) {        //3) abfrage von int2 ob Palindrome          Palindrome = 315513 == vorwärts -> letzte == vordeste ...
                        System.out.println("PRIME");                //3.1) Wenn ja -> soutPalindrome
                    } else {                                        //3.2) Wenn nein -> soutNO_PALINDROME
                        System.out.println("NO PRIME");             //4) Nächste Zeile einlesen
                    }
                    break;
                case 3:
                    if (palindromeTester.testNumber(i2) == true) {
                        System.out.println("PALINDROME");
                    } else {
                        System.out.println("NO PALINDROME");
                    }
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            line = br.readLine();
        }
    }
}
