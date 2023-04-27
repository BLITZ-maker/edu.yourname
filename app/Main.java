package edu.yourname.app;

import edu.yourname.complex.Complex;
import edu.yourname.util.ComplexList;

public class Main {
    public static void main(String[] args) {
        ComplexList complexList = new ComplexList(5);
        complexList.add(Complex.Of(2, 3));
        complexList.add(Complex.Of(4, 5));
        complexList.add(Complex.Of(6, 7));
        
        if (complexList.isFull()) {
            System.out.println("The list is full.");
        } else {
            System.out.println("The list is not full.");
        }
        
        System.out.println("There are " + complexList.size() + " complex numbers in the list.");
        for (int i = 0; i < complexList.size(); i++) {
            System.out.println("Complex number " + (i+1) + ": " + complexList.get(i).toString());
        }
        
        boolean added = complexList.add(Complex.Of(8, 9));
        if (!added) {
            System.out.println("Failed to add complex number: 8.0 + 9.0i");
        }
        
        added = complexList.add(Complex.Of(10, 11));
        if (!added) {
            System.out.println("Failed to add complex number: 10.0 + 11.0i");
        }
        
        System.out.println("The list of complex numbers is: " + complexList.toString());
    }
}
