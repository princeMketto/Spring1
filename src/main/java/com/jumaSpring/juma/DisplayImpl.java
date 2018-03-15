package com.jumaSpring.juma;

public class DisplayImpl implements Display {
    @Override
    public void println(String msg) {
        System.out.println(msg);
    }

    @Override
    public void print(String msg) {
    System.out.print(msg);
    }
}
