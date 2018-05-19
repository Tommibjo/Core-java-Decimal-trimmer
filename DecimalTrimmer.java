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
}
