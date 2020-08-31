# jMEOS

A minimal proof of concept for using MEOS in Java.

We use JavaCpp to achieve this.

The code is structured as two modules:

  1. jmeos: provides java bindings to MEOS.
  2. example: a minimal java application showing usage of jMEOS.

## Sample code for projects using jMEOS

Following snipped is from example module's main function:
```java
TBox tbox = new TBox(10, NanoChrono.TimePoint.now(), 20, NanoChrono.TimePoint.now());
System.out.println(tbox.xmin());
System.out.println(tbox.tmin().toString());
System.out.println(tbox.xmax());
System.out.println(tbox.tmax().toString());
```

## Running the example code
Use IntelliJ Idea, build and run the example module with following run configuration:
```
-Djava.library.path=<path to jmeos repository>/jmeos/build/classes/java/main/com/adonmo/meos/linux-x86_64
```
Note: Make sure to give absolute path when adding <path to jmeos repository>

If you see output similar to this, the code ran successfully:
```
10.0
2020-08-28 11:13:13.674
20.0
2020-08-28 11:13:13.677
```

## Running test for the library
```
./gradlew test
```
