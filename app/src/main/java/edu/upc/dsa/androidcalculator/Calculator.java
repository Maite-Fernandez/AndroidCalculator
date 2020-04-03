package edu.upc.dsa.androidcalculator;
import java.util.*;

//In this class we implement the methods of the calculator
public class Calculator implements CalculatorInterface{
    //Instances and variables for the class
    private ArrayList<Integer> operations= new ArrayList<Integer>();
    private ArrayList<Double> numbers= new ArrayList<Double>();
    private double result=0;
    private boolean MathError=false;

    //Method to add an Operation
    @Override
    public void addOperation(int operation){ operations.add(operation); }
    //Method to add a Number
    @Override
    public void addNumber(Double number){ numbers.add(number); }
    /*Method to delete an Operation that throws and exception when
    there are no operations in the list to remove.*/
    @Override
    public void delOperation(int position) {
        if(operations.size()>0) {
            operations.remove(position);
        }
    }
    /*Method to delete a Number that throws and exception when
    there are no operations in the list to remove.*/
    @Override
    public void delNumber(int position){
        if(numbers.size()>0){
            numbers.remove(position);
        }
    }

    //Method to solve a chain of operations.
    @Override
    public String getResult() {
        int c=0;
        boolean second=false;
        boolean third=false;
        String total;

        while(c<operations.size()){
            int op=operations.get(c);
            if(op<4){
                if (c < numbers.size()) {
                    switch (op) {
                        case 1:
                            result = Math.sin(Math.toRadians(numbers.get(c)));
                            break;
                        case 2:
                            result = Math.cos(Math.toRadians(numbers.get(c)));
                            break;
                        case 3:
                            result = Math.tan(Math.toRadians(numbers.get(c)));
                            break;
                    }

                    numbers.remove(c);
                    numbers.add(c, result);
                    operations.remove(c);
                    c -= 1;
                }else{
                    MathError=true;
                }
            }
            else {
                if (op < 6) {
                    second = true;
                } else {
                    third = true;
                }
            }

            c+=1;
        }

        if(second) {
            c = 0;
            while ((c<operations.size())&&(c+1<numbers.size())) {
                int op = operations.get(c);
                boolean done=false;
                if(op<6) {
                    if (c + 1 < numbers.size()) {
                        switch (op) {
                            case 4:
                                result = numbers.get(c) * numbers.get(c + 1);
                                break;
                            case 5:
                                result = numbers.get(c) / numbers.get(c + 1);
                                break;
                        }
                        numbers.remove(c);
                        numbers.remove(c);
                        numbers.add(c, result);
                        operations.remove(c);
                        c -= 1;
                    } else {
                        MathError=true;
                    }
                }
                c+=1;
            }

        }

        if(third) {
            c = 0;
            while (c < operations.size()) {
                int op = operations.get(c);
                if(c+1<numbers.size()) {
                    switch (op) {
                        case 6:
                            result = numbers.get(c) + numbers.get(c + 1);
                            break;
                        case 7:

                            result = numbers.get(c) - numbers.get(c + 1);
                            break;
                    }
                    numbers.remove(c);
                    numbers.remove(c);
                    numbers.add(c, result);
                    operations.remove(c);
                    c-=1;
                }
                else{
                    MathError=true;
                }

                c+=1;
            }

        }
        if(MathError){
            return "Math Error! Clear and try again.";
        }
        else
            result= numbers.get(0);
            return String.valueOf(result);
    }
    //Method to clear calculator
    @Override
    public void deleteAll(){
        numbers.clear();
        operations.clear();
    }

}

