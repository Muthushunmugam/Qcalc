package com.crio.qcalc;

public class LogicCalculator extends StandardCalculator {

    public void getVersion() {
        System.out.println("Logic Calculator 1.0");
    }

    public void AND(int num1, int num2) {
        result = (double) (num1 & num2);
    }

    public void OR(int num1, int num2) {
        result = (double) (num1 | num2);
    }

    public void XOR(int num1, int num2) {
        result = (double) (num1 ^ num2);
    }

    public void NOT(int num1) {
        result = (double) ~num1;
    }

    @Override
    public void printResult() {
        System.out.println("Logic Calculator Result: " + result);
    }

    // Optional: getter for result if needed
    
}

