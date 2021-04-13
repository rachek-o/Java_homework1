package com.company.exercise9a;

public class Divide {
    double a,b;

    Divide(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public void div() {
        double result;
        try {
            result = a / b;
            System.out.println("The division of the two numbers is: " + result);
            if (b==0)
                throw new ArithmeticException("Ділення на 0");
        }catch (ArithmeticException e) {
            System.out.println("You can't divide a number by 0");
        }catch (NullPointerException e){
            System.out.println("An exception "+ e +" has occured.\nPlz enter a valid double integer");
        }catch (NumberFormatException e) {
            System.out.println("Invalid format "+ e + "\nPlz enter a valid double integer");
        }
        finally {
            System.out.println("I am in final block");
        }
    }
}
