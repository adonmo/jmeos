package com.adonmo.meos;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * java -jar /path/to/javacpp.jar NanoChrono.java
 * java -cp /path/to/javacpp.jar:. NanoChrono
 */
@Platform(include = "chrono")
public class NanoChrono {
    static { Loader.load(); }

    @Name("std::chrono::system_clock::time_point")
    public static class TimePoint extends Pointer {
        static { Loader.load(); }

        public TimePoint() { allocate(); }
        public TimePoint(Pointer p) { super(p); }
        private native void allocate();

        @ByVal @Namespace @Name("std::chrono::system_clock::now")
        public static native TimePoint now();

        @Name("time_since_epoch().count")
        public native long nano();

        @Override
        public String toString() {
            Date date = new Date(nano() / 1000000L);
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            return format.format(date);
        }
    }
}