/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package com.crio.qcalc;


public class App {


   public static void main(String[] args) {

       System.out.println("Starting QCalc..");
       
    StandardCalculator calc = new StandardCalculator();

    calc.add(Double.MAX_VALUE, Double.MAX_VALUE);

    calc.printResult();

    
    LogicCalculator calc1 = new LogicCalculator();

    calc1.OR(8, 6);

    calc1.printResult();




   }


}

