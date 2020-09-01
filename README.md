# jMEOS

A minimal proof of concept for using [MEOS](https://github.com/adonmo/meos) in Java.

We use [JavaCpp](https://github.com/bytedeco/javacpp) to achieve this.

The code is structured as two modules:

  1. jmeos: provides java bindings to MEOS.
  2. example: a minimal java application showing usage of jMEOS.

## Example code for projects using jMEOS

Following code snippet is from example module's main function:
```java
TBox tbox = new TBox(10, NanoChrono.TimePoint.now(), 20, NanoChrono.TimePoint.now());

System.out.println(tbox.xmin());
System.out.println(tbox.tmin().toString());
System.out.println(tbox.xmax());
System.out.println(tbox.tmax().toString());
```

## Running the example code
Make sure you have [libmeos.a binary setup](#building-libmeosa), and do:
```
./gradlew :example:run
```

If you see output similar to this, the code ran successfully:
```
10.0
2020-08-28 11:13:13.674
20.0
2020-08-28 11:13:13.677
```

## Running jMEOS library tests
Make sure you have [libmeos.a binary setup](#building-libmeosa), and do:
```
./gradlew test
```

## Building libmeos.a
To build/test jMEOS, you also need to build the libmeos.a binary
```
cd ../meos
git clone https://github.com/adonmo/meos --depth=1
cmake -B build -S . -DCMAKE_BUILD_TYPE=Release
cmake --build build --config Release
```
