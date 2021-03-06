// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package com.adonmo.meos;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class MeosLibrary extends com.adonmo.meos.MeosLibraryConfig {
    static { Loader.load(); }

// Parsed from meos/types/box/TBox.hpp

// #pragma once

// #include <chrono>
// #include <cmath>
// #include <string>

/**
 * \brief %Temporal box - bounding box with value and/or time dimensions.
 */
@Namespace("meos") @NoOffset public static class TBox extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TBox(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TBox(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TBox position(long position) {
        return (TBox)super.position(position);
    }
//    @Override public TBox getPointer(long i) {
//        return new TBox(this).position(position + i);
//    }

  public TBox() { super((Pointer)null); allocate(); }
  private native void allocate();
  public TBox(double xmin, @ByVal @Cast("const meos::time_point*") NanoChrono.TimePoint tmin, double xmax, @ByVal @Cast("const meos::time_point*") NanoChrono.TimePoint tmax) { super((Pointer)null); allocate(xmin, tmin, xmax, tmax); }
  private native void allocate(double xmin, @ByVal @Cast("const meos::time_point*") NanoChrono.TimePoint tmin, double xmax, @ByVal @Cast("const meos::time_point*") NanoChrono.TimePoint tmax);
  public TBox(double xmin, double xmax) { super((Pointer)null); allocate(xmin, xmax); }
  private native void allocate(double xmin, double xmax);
  public TBox(@ByVal @Cast("const meos::time_point*") NanoChrono.TimePoint tmin, @ByVal @Cast("const meos::time_point*") NanoChrono.TimePoint tmax) { super((Pointer)null); allocate(tmin, tmax); }
  private native void allocate(@ByVal @Cast("const meos::time_point*") NanoChrono.TimePoint tmin, @ByVal @Cast("const meos::time_point*") NanoChrono.TimePoint tmax);
  public TBox(double xmin, @StdString BytePointer tmin, double xmax, @StdString BytePointer tmax) { super((Pointer)null); allocate(xmin, tmin, xmax, tmax); }
  private native void allocate(double xmin, @StdString BytePointer tmin, double xmax, @StdString BytePointer tmax);
  public TBox(double xmin, @StdString String tmin, double xmax, @StdString String tmax) { super((Pointer)null); allocate(xmin, tmin, xmax, tmax); }
  private native void allocate(double xmin, @StdString String tmin, double xmax, @StdString String tmax);
  public TBox(@StdString BytePointer xmin, @StdString BytePointer tmin, @StdString BytePointer xmax,
         @StdString BytePointer tmax) { super((Pointer)null); allocate(xmin, tmin, xmax, tmax); }
  private native void allocate(@StdString BytePointer xmin, @StdString BytePointer tmin, @StdString BytePointer xmax,
         @StdString BytePointer tmax);
  public TBox(@StdString String xmin, @StdString String tmin, @StdString String xmax,
         @StdString String tmax) { super((Pointer)null); allocate(xmin, tmin, xmax, tmax); }
  private native void allocate(@StdString String xmin, @StdString String tmin, @StdString String xmax,
         @StdString String tmax);
  public TBox(@StdString BytePointer serialized) { super((Pointer)null); allocate(serialized); }
  private native void allocate(@StdString BytePointer serialized);
  public TBox(@StdString String serialized) { super((Pointer)null); allocate(serialized); }
  private native void allocate(@StdString String serialized);

  public native double xmin();
  public native @ByVal @Cast("meos::time_point*") NanoChrono.TimePoint tmin();
  public native double xmax();
  public native @ByVal @Cast("meos::time_point*") NanoChrono.TimePoint tmax();

  
  
  
  
  
  

  
  
}

  // namespace meos


}
