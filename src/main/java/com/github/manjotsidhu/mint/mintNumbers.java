/*
 * Copyright (C) 2018, Manjot Sidhu <manjot.techie@gmail.com>
 */
package com.github.manjotsidhu.mint;

/**
 * Contains methods useful for operations on numbers ONLY
 *
 * @author ManjotSidhu
 */
public class mintNumbers {

    /**
     * Computes Min of 2 numbers
     *
     * @param <T> Type T object
     * @param x First number
     * @param y Second number
     * @return min between x and y
     */
    public static < T extends Number> T min(T x, T y) {
        if (x.doubleValue() < y.doubleValue()) {
            return x;
        } else {
            return y;
        }
    }

    /**
     * Computes Max of 2 numbers
     *
     * @param <T> Type T object
     * @param x First number
     * @param y Second number
     * @return max between x and y
     */
    public static < T extends Number> T max(T x, T y) {
        if (x.doubleValue() > y.doubleValue()) {
            return x;
        } else {
            return y;
        }
    }
    
    /**
     * Floor
     */
    public static < E extends Number, Comparable> int floor(E number) {
        if(number.intValue() == number.doubleValue()) {
            return number.intValue();
        } else {
            if(number.intValue() > number.doubleValue()) {
                return number.intValue() - 1;
            } else {
                return number.intValue();
            }
        }
    }
    
    /**
     * Ceil
     */
    public static < E extends Number,Comparable> int ceil(E number) {
       if(number.intValue() == number.doubleValue()) {
            return number.intValue();
        } else {
            if(number.intValue() < number.doubleValue()) {
                return number.intValue() + 1;
            } else {
                return number.intValue();
            }
        }
    }
}
