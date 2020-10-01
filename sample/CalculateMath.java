package sample;

public class CalculateMath {

    static {
        System.loadLibrary("mathlib");
    }

    public native int calcSquare(int n);
}
