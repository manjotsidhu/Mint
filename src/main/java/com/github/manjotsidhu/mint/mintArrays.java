/*
 * Copyright (C) 2018, Manjot Sidhu <manjot.techie@gmail.com>
 */
package com.github.manjotsidhu.mint;

/**
 * Consists of several types of misc methods only for Arrays
 *
 * @author ManjotSidhu
 */
public class mintArrays {
    
    /**
     * Reverses array of any data type
     */
    public static < E > void reverse(E[] ar) {
        for(int i = 0; i < mintNumbers.floor(ar.length/2); i++) {
           E temp = ar[i];
           ar[i] = ar[ar.length - 1 - i];
           ar[ar.length - 1 - i] = temp;
        }
    }

    /**
     * Sorts integer array in ascending order
     *
     * @param sortMe integer array to be sorted
     */
    public static void sort(int[] sortMe) {
        for (int i = 0; i < sortMe.length; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < sortMe.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (sortMe[j] > sortMe[j + 1]) {
                    int tmp = sortMe[j];
                    sortMe[j] = sortMe[j + 1];
                    sortMe[j + 1] = tmp;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

    }

    /**
     * Sorts integer array in descending order
     *
     * @param sortMe integer array to be sorted
     */
    public static void sortD(int[] sortMe) {
        for (int i = 0; i < sortMe.length; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < sortMe.length - 1; j++) {
                // Swap adjacent elements if they are in ascending order
                if (sortMe[j] < sortMe[j + 1]) {
                    int tmp = sortMe[j];
                    sortMe[j] = sortMe[j + 1];
                    sortMe[j + 1] = tmp;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

    }
    
    /**
     * Sorts String array in alphabetical order (case-insensitive)
     * 
     * @param sortMe String object array to be sorted
     */
    public static void sort(String[] sortMe) {
        for (int i = 0; i < sortMe.length; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < sortMe.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (sortMe[j].compareToIgnoreCase(sortMe[j + 1]) >= 1) {
                    String tmp = sortMe[j];
                    sortMe[j] = sortMe[j + 1];
                    sortMe[j + 1] = tmp;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
    }
    
    /**
     * Compares two arrays
     *
     *
     * @param <E> Type E Array Object
     * @param array1 First Array Object
     * @param array2 Second Array Object
     * @return boolean result
     */
    public static < E extends Comparable> boolean compare(E[] array1, E[] array2) {
        if (array1.length == array2.length) {
            for (int index = 0; index < array1.length; index++) {
                if (!array1[index].equals(array2[index])) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    /**
     * Compares two arrays element wise
     *
     *
     * @param <E> Type E Array Object
     * @param array1 First Array Object
     * @param array2 Second Array Object
     * @return boolean array after comparing
     */
    public static < E> boolean[] compareE(E[] array1, E[] array2) {
        boolean[] result = new boolean[mintNumbers.max(array1.length, array2.length)];

        for (int index = 0; index < mintNumbers.min(array1.length, array2.length); index++) {
            if (array1[index].equals(array2[index])) {
                result[index] = true;
            } else {
                result[index] = false;
            }
        }
        return result;
    }
}
