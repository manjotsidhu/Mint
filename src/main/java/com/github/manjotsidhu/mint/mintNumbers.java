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
     * Floor finds the greatest integer less than or equal to that number
     * 
     * @param <E> Generic datatype belonging to numbers
     * @param number the number to be floor-ed
     * @return greatest integer belonging to <code>int</code>
     */
    public static < E extends Number> int floor(E number) {
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
     * Ceil finds the least integer greater than or equal to that number
     * 
     * @param <E> Generic datatype belonging to numbers
     * @param number the number to be find the ceil of
     * @return least integer belonging to <code>int</code> datatype
     */
    public static < E extends Number> int ceil(E number) {
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
