package com.adonmo.meos.example;

import com.adonmo.meos.MeosLibrary.TBox;

public class Main {
    public static void main(String[] args) {
        TBox tbox = new TBox(10, 20);
        System.out.println(tbox.xmin());
        System.out.println(tbox.xmax());
    }
}
