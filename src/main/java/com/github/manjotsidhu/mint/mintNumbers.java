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
     * Computes Min of all passed numbers as arguments
     *
     * @param <T> Type T object
     * @param x Arguments that can be more than one
     * @return Returns minimum of all passed arguments
     */
    public static < T extends Number> T min(T ...x) {
        mintArrays.sort(x);
        return x[0];
    }

    /**
     * Computes Max of all passed numbers as arguments
     *
     * @param <T> Type T object
     * @param x Arguments that can be more than one
     * @return Returns maximum of all passed arguments
     */
    public static < T extends Number> T max(T ...x) {
        mintArrays.sort(x);
        return x[x.length-1];
    }

    /**
     * Floor finds the greatest integer less than or equal to that number
     *
     * @param <E> Generic datatype belonging to numbers
     * @param number the number to be floor-ed
     * @return greatest integer belonging to <code>int</code>
     */
    public static < E extends Number> int floor(E number) {
        if (number.intValue() == number.doubleValue()) {
            return number.intValue();
        } else {
            if (number.intValue() > number.doubleValue()) {
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
        if (number.intValue() == number.doubleValue()) {
            return number.intValue();
        } else {
            if (number.intValue() < number.doubleValue()) {
                return number.intValue() + 1;
            } else {
                return number.intValue();
            }
        }
    }
    
    /**
     * RandomInt generates random integer in the range of 0-<code>n</code> numbers.
     * 
     * @param n Integer argument
     * @return Returns randomly generated integer
     */
    public static int randomInt(int n) {
        return (int) (Math.random()*n);
    }
}
