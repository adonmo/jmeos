package com.adonmo.meos.example;

import com.adonmo.meos.MeosLibrary.TBox;
import com.adonmo.meos.NanoChrono;

public class Main {
    public static void main(String[] args) {
        TBox tbox = new TBox(10, NanoChrono.TimePoint.now(), 20, NanoChrono.TimePoint.now());
        System.out.println(tbox.xmin());
        System.out.println(tbox.tmin().toString());
        System.out.println(tbox.xmax());
        System.out.println(tbox.tmax().toString());
    }
}
