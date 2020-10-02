package com.opensource.testmathlib;

import sample.CalculateMath;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 01.10.2020 09:02:02
 */
public class StartService {

    public static void main(String[] args) {
        
        System.out.println("mathlib.so library ");
        CalculateMath cm = new CalculateMath();
        int num = 3;
        System.out.println("Square of "+ num + " is: "+ cm.calcSquare(num));

    }

}
