# JavaNativeCodes
This repository offers sample builds supporting native code through the Java Native Interface (JNI).

Getting Started
=====================

  1. Create run directory using the mkdir command as directory name `/sample`
  
         $ mkdir sample
         $ cd sample

  2. Write a Java Class CalculateMath.java that uses C Codes

         $ touch CalculateMath.java
         
  3. You should use `javac -h` to compile the Java program and generate C/C++ header file called CalculateMath.h as follows:(In the parent directory)
  
         $ javac -h . sample/CalculateMath.java
  
  4. Create and implementing the C Program CalculateMath.c
  
         $ touch CalculateMath.c
         
  5.  Compile the C program CalculateMath.c
  
          $ gcc -fPIC -I"$JAVA_HOME/include" -I"$JAVA_HOME/include/linux" -shared -o libmathlib.so CalculateMath.c
         
  6.  Native library can be loaded by loadLibrary with a valid name and run java program.
  
          $ static {
                System.loadLibrary("mathlib"); // will load libmathlib.so
          }
