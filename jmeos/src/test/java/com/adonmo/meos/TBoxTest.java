package com.adonmo.meos;

import com.adonmo.meos.MeosLibrary.TBox;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TBoxTest {
    @Test
    public void sanityTestTBox() {
        double xmin = 10;
        double xmax = 20;
        NanoChrono.TimePoint tmin = NanoChrono.TimePoint.now();
        NanoChrono.TimePoint tmax = NanoChrono.TimePoint.now();

        TBox tbox = new TBox(xmin, tmin, xmax, tmax);

        assertEquals(tbox.xmin(), xmin);
        assertEquals(tbox.xmax(), xmax);
        assertEquals(tbox.tmin().toString(), tmin.toString());
        assertEquals(tbox.tmax().toString(), tmax.toString());
    }
}
