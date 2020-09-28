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
public class NumberTester {

    public NumberTester(String fileName) {
    
    
    }
     public void setOddEven(NumberTest oddTester)
     {
      NumberTest isOdd = (k) -> (k%2) == 0;
     }
     public void setPrimeTester(NumberTest primeTester)
     {
     
     }
     
     public void setPalindromeTester(NumberTest palindromeTester)
     {
     
     }
     
     public void testFle()
     {}
     
     public interface NumberTest{
     boolean testNumber(int number);
     }
}
