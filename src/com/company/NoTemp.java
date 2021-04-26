package com.company;

//A simple function that returns swapped variables without using temporary variables
public class NoTemp {
    private int a;
    private int b;

    public NoTemp(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void swap(){
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public void set_a(int a){
        this.a = a;
    }

    public void set_b(int b){
        this.b = b;
    }

}
