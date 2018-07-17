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
     * @since 1.0
     */
    public static < T extends Number> T min(final T ...x) {
        mintArrays.sort(x);
        return x[0];
    }

    /**
     * Computes Max of all passed numbers as arguments
     *
     * @param <T> Type T object
     * @param x Arguments that can be more than one
     * @return Returns maximum of all passed arguments
     * @since 1.0
     */
    public static < T extends Number> T max(final T ...x) {
        mintArrays.sort(x);
        return x[x.length-1];
    }

    /**
     * Floor finds the greatest integer less than or equal to that number
     *
     * @param <E> Generic datatype belonging to numbers
     * @param number Number to find its floor
     * @return greatest integer belonging to <code>int</code>
     * @since 1.0
     */
    public static < E extends Number> int floor(final E number) {
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
     * @param number Number to find its ceil
     * @return Least integer belonging to <code>int</code> datatype
     * @since 1.0
     */
    public static < E extends Number> int ceil(final E number) {
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
     * @since 1.0
     */
    public static int randomInt(final int n) {
        return (int) (Math.random()*n);
    }
}
