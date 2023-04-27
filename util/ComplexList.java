package edu.yourname.util;

import edu.yourname.complex.Complex;

import java.util.ArrayList;

public class ComplexList {
    private int maxSize;
    private ArrayList<Complex> list;

    public ComplexList(int maxSize) {
        this.maxSize = maxSize;
        this.list = new ArrayList<>();
    }

    public boolean isFull() {
        return this.list.size() == this.maxSize;
    }

    public boolean add(Complex number) {
        if (!isFull()) {
            this.list.add(number);
            return true;
        } else {
            System.out.println("Failed to add complex number: " + number.toString());
            return false;
        }
    }

    public Complex get(int index) {
        return this.list.get(index);
    }

    public int size() {
        return this.list.size();
    }

    public String toString() {
        return "The list of complex numbers is: " + this.list.toString();
    }
}
