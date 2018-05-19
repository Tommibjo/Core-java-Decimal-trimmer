/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tommi
 */
public class DecimalTrimmer {

    public static Object trim(double value) {

        if (value % 1 == 0) {
            return (int) value;
        } else {
            return Math.round(value * 100.0) / 100.0;
        }
    }
    
    // All credits for the next method go to jpdymond @ Stackoverflow ( https://stackoverflow.com/users/2984077/jpdymond )  
    private static double round(double value, int precision) {

        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}
