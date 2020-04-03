package edu.upc.dsa.androidcalculator;

//In this interface we declare the methods that we will implement in the class Calculator
public interface CalculatorInterface {

    void addOperation(int operation);
    void addNumber(Double number);
    void delNumber(int position);
    void delOperation(int position);
    String getResult();
    void deleteAll();

}
