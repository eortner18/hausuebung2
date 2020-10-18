/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zweitehue;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author elias
 */
public class Zweitehuemain {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static double zahl3 = 0.0;
    static double x_a = 0.0;
    static double x_b = 0.0;
    static double y_a = 0.0;
    static double y_b = 0.0;
    static int actInput = 0;

    public static void main(String[] args) {
        String filename = "f";

         //NumberTester numbertester = new NumberTester("");
         //Erasthotiles e = new Erasthotiles(5);
         //numbertester.setOddEven((i) -> (i % 2) == 0);
         //numbertester.setPrimeTester((i) -> e.isPrime(i));
         //numbertester.setPalindromeTester((number) -> {

         //   return number == IntStream.iterate(number, i -> i / 10)
         //           .map(n -> n % 10)
         //           .limit(String.valueOf(number).length())
         //           .reduce(0, (a, b) -> a = a * 10 + b);
        //});
        String input;
        boolean stop = false;

        Number x = new Number();
        Number y = new Number();

        do {
            menu();
            input = sc.nextLine();
            actInput = Integer.parseInt(input);

            switch (actInput) {
                case 1:
                    numberEnter();
                    x.setA(x_a);
                    x.setB(x_b);
                    y.setA(y_a);
                    y.setB(y_b);
                    
                    operationChooser();
                    
                    CalculationOperation cadd = (Number x1, Number y1) -> {
                        if (x1.getB() == y1.getB()) {
                            double xy = x1.getA() + y1.getA();
                            Number erg = new Number();
                            erg.setA(xy);
                            erg.setB(x1.getB());
                            return erg;
                        } else {
                            double n = x1.getB() * y1.getB();
                            double z = x1.getA() * y1.getB();
                            double z2 = y1.getA() * x1.getB();
                            double xy = z + z2;
                            Number erg = new Number();
                            erg.setA(xy);
                            erg.setB(n);
                            return erg;
                        }
                    };
                    CalculationOperation calcOp = (Number x1, Number y1) -> {
                        if (x1.getB() == y1.getB()) {
                            double xy = x1.getA() - y1.getA();
                            Number erg = new Number();
                            erg.setA(xy);
                            erg.setB(x1.getB());
                            return erg;
                        } else {
                            double nenner = x1.getB() * y1.getB();
                            double zähler1 = x1.getA() * y1.getB();
                            double zähler2 = y1.getA() * x1.getB();
                            double xy = zähler1 - zähler2;
                            Number erg = new Number();
                            erg.setA(xy);
                            erg.setB(nenner);
                            return erg;
                        }
                    };
                    CalculationOperation cmult = (Number x1, Number y1) -> {
                        double xyZ = x1.getA() * y1.getA();
                        double xyN = x1.getB() * y1.getB();
                        Number erg = new Number();
                        erg.setA(xyZ);
                        erg.setB(xyN);
                        return erg;
                    };
                    CalculationOperation cdiv = (Number x1, Number y1) -> {
                        double xyZ = x1.getA() * y1.getB();
                        double xyN = x1.getB() * y1.getA();
                        Number erg = new Number();
                        erg.setA(xyZ);
                        erg.setB(xyN);
                        return erg;
                    };
                    RationaleZahlenCalculator rc = new RationaleZahlenCalculator(cadd, calcOp, cmult, cdiv);
                    
                    switch (actInput) {
                        case 1:
                        {
                            Number erg = rc.add(x, y);
                            System.out.println("Ergebniss:");
                            System.out.println("a = " + erg.getA());
                            System.out.println("b = " + erg.getB());
                            break;
                        }
                        case 2:
                        {
                            Number erg = rc.subtract(x, y);
                            System.out.println("Ergebniss:");
                            System.out.println("a = " + erg.getA());
                            System.out.println("b = " + erg.getB());
                            break;
                        }
                        case 3:
                        {
                            Number erg = rc.multiply(x, y);
                            System.out.println("Ergebniss:");
                            System.out.println("a = " + erg.getA());
                            break;
                        }
                        case 4:
                        {
                            Number erg = rc.divide(x, y);
                            System.out.println("Ergebniss:");
                            System.out.println("a = " + erg.getA());
                            break;
                        }
                        default:
                            System.out.println("Ungültiger Input");
                            break;
                    }
                case 2:
                    numberEnter();
                    x.setA(x_a);
                    x.setB(x_b);
                    y.setA(y_a);
                    y.setB(y_b);
                    
                    operationChooser();
                    
                    CalculationOperation Vektoradd = (Number x1, Number y1) -> {
                        double zah1 = x1.getA() + y1.getA();
                        double zah2 = y1.getB() + x1.getB();
                        Number erg = new Number();
                        erg.setA(zah1);
                        erg.setB(zah2);
                        return erg;
                    };
                    CalculationOperation VektorSubtract = (Number x1, Number y1) -> {
                        double zah1 = x1.getA() - y1.getA();
                        double zah2 = x1.getB() - y1.getB();
                        Number erg = new Number();
                        erg.setA(zah1);
                        erg.setB(zah2);
                        return erg;
                    };
                    CalculationOperation VektorMultiplication = (Number x1, Number y1) -> {
                        double zah1 = x1.getB() * 0 - 0 * y1.getB();
                        double zah2 = y1.getA() * 0 - 0 * x1.getA();
                        zahl3 = x1.getA() * y1.getB() - x1.getB() * y1.getA();
                        Number erg = new Number();
                        erg.setA(zah1);
                        erg.setB(zah2);
                        return erg;
                    };
                    CalculationOperation VektorDivide = (Number x1, Number y1) -> {
                        double zah1 = x1.getA() + x1.getB();
                        double zah2 = y1.getA() + y1.getB();
                        Number erg = new Number();
                        erg.setA(zah1);
                        erg.setB(zah2);
                        return erg;
                    };
                    
                    VektorCalculator vc = new VektorCalculator(Vektoradd, VektorSubtract, VektorMultiplication, VektorDivide);
                    
            switch (actInput) {
                case 1:
                    {
                        Number erg = vc.add(x, y);
                        System.out.println("Ergebniss:");
                        System.out.println("a = " + erg.getA());
                        System.out.println("b = " + erg.getB());
                        break;
                    }
                case 2:
                    {
                        Number erg = vc.subtract(x, y);
                        System.out.println("Ergebniss:");
                        System.out.println("a = " + erg.getA());
                        System.out.println("b = " + erg.getB());
                        break;
                    }
                case 3:
                    {
                        Number erg = vc.multiply(x, y);
                        System.out.println("Kreuzprodukt:");
                        System.out.println("a = " + erg.getA());
                        System.out.println("b = " + erg.getB());
                        System.out.println("c = " + zahl3);
                        break;
                    }
                case 4:
                    {
                        Number erg = vc.divide(x, y);
                        System.out.println("Skalarprodukt ist: ");
                        System.out.println(erg.getA() + erg.getB());
                        break;
                    }
                default:
                    System.out.println("Unvalid Input");
                    break;
            }
                case 3:
                    numberEnter();
                    x.setA(x_a);
                    x.setB(x_b);
                    y.setA(y_a);
                    y.setB(y_b);
                    operationChooser();
                    ComplexCalculator cc = new ComplexCalculator(
                            (Number x1, Number y1) -> {
                                double zah1 = x1.getA() + y1.getA();
                                double zah2 = y1.getB() + x1.getB();
                                Number erg = new Number();
                                erg.setA(zah1);
                                erg.setB(zah2);
                                return erg;
                            }, (Number x1, Number y1) -> {
                                double zah1 = x1.getA() - y1.getA();
                                double zah2 = y1.getB() - x1.getB();
                                Number erg = new Number();
                                erg.setA(zah1);
                                erg.setB(zah2);
                                return erg;
                            }, (Number x1, Number y1) -> {
                                double zah1 = x1.getA() * y1.getA();
                                double zahl1 = x1.getA() * y1.getB();
                                double zah2 = x1.getB() - y1.getA();
                                double zahl22 = x1.getB() * y1.getB();
                                double zahl111 = zah1 + zah2;
                                double zahl222 = zahl1 + zahl22;
                                Number erg = new Number();
                                erg.setA(zahl111);
                                erg.setB(zahl222);
                                return erg;
                            }, (Number x1, Number y1) -> {
                                double zah1 = x1.getA() * y1.getA();
                                double zahl1 = x1.getA() * y1.getB();
                                double zah2 = x1.getB() - y1.getA();
                                double zahl22 = x1.getB() * y1.getB();
                                double zahl111 = zah1 + zah2;
                                double zahl222 = zahl1 + zahl22;
                                Number erg = new Number();
                                erg.setA(zahl111);
                                erg.setB(zahl222);
                                return erg;
                            });
                    switch (actInput) {
                        case 1:
                        {
                            Number erg = cc.add(x, y);
                            System.out.println("Ergebniss:");
                            System.out.println("a = " + erg.getA());
                            System.out.println("b = " + erg.getB() + "i");
                            break;
                        }
                        case 2:
                        {
                            Number erg = cc.subtract(x, y);
                            System.out.println("Ergebniss:");
                            System.out.println("a = " + erg.getA());
                            System.out.println("b = " + erg.getB() + "i");
                            break;
                        }
                        case 3:
                        {
                            Number erg = cc.multiply(x, y);
                            System.out.println("Ergebniss:");
                            System.out.println("a = " + erg.getA());
                            break;
                        }
                        case 4:
                        {
                            Number erg = cc.divide(x, y);
                            System.out.println("Ergebniss:");
                            System.out.println("a = " + erg.getA());
                            break;
                        }
                        default:
                            System.out.println("Ungültiger Input");
                            break;
                    }   break;
                case 4:
                    stop = true;
                    break;
                default:
                    System.out.println("Ungültiger Input");
                    stop = true;
                    break;
            }
        } while (stop == false);
    }

    public static void menu() {
        System.out.println("1 - Relational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Exit program");
    }

    public static void numberEnter() {
        System.out.println("Enter number x_a>");
        String xaString = sc.nextLine();
        x_a = Integer.parseInt(xaString);
        System.out.println("Enter number x_b>");
        String xbString = sc.nextLine();
        x_b = Integer.parseInt(xbString);
        System.out.println("Enter number y_a>");
        String yaString = sc.nextLine();
        y_a = Integer.parseInt(yaString);
        System.out.println("Enter number y_b>");
        String ybString = sc.nextLine();
        y_b = Integer.parseInt(ybString);
    }

    public static void operationChooser() {
        System.out.println("Choose the operation:");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter the numbers again");
        String sinput = sc.nextLine();
        actInput = Integer.parseInt(sinput);
    }
}
