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
     * 
     * @param <E> Generic datatype belonging to arrays
     * @param ar array to be reversed
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
     * Sorts String array in alphabetical order (case-insensitive) using bubblesort
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
     * @param <E> Datatype E Array Object
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
     * @param <E> Dataype E Array Object
     * @param array1 First Array Object
     * @param array2 Second Array Object
     * @return boolean array after comparing
     */
    public static <E> boolean[] compareE(E[] array1, E[] array2) {
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
    
    /**
     * First returns the first element of the given array
     * 
     * @param <E> Generic datatype E belonging to array object
     * @param array input argument
     * @return single first element of E datatype
     */
    public static <E> E first(E[] array) {
        return array[0];
    }
    
    /**
     * returns first <code>n</code> elements from the <code>array</code>
     * 
     * @param <E> Generic Datatype
     * @param array input array as argument
     * @param n number of first elements to return
     * @return <code>E[]</code> array having first <code>n</code> elements
     */
    public static <E> E[] first(E[] array, int n) {
        Object[] newArr = new Object[n];
 
        System.arraycopy(array, 0, newArr, 0, n);       
        return (E[]) newArr;
    }
    
    /**
     * isFirst checks if the specified <code>element</code> is the first element of <code>array</code> or not
     * 
     * @param <E> Generic Datatype
     * @param array input array as argument
     * @param element element to check if its first
     * @return true or false if isFirst or not
     */
    public static <E> boolean isFirst(E[] array, E element) {
        return first(array) == element;
    }
    
    /**
     * Initial returns everything but not the last element of the <code>array</code>
     * 
     * @param <E> Generic Datatype Element
     * @param array input argument
     * @return new array not having the last element
     */
    public static <E> E[] initial(E[] array) {
        Object[] newArr = new Object[array.length-1];
        
        System.arraycopy(array, 0, newArr, 0, array.length-1);
        return (E[]) newArr;
    }
    
    /**
     * Initial returns everything but not the <code>n</code> last elements
     * 
     * @param <E> Generic Datatype Element
     * @param array input argument
     * @param n number of elements to leave from the last
     * @return new array not having last <code>n</code> elements
     */
    public static <E> E[] initial(E[] array, int n) {
        Object[] newArr = new Object[array.length-n];
        
        System.arraycopy(array, 0, newArr, 0, array.length-n);
        return (E[]) newArr;
    }
    
    /**
     * Last returns the last element of the array
     * 
     * @param <E> Generic Datatype Element
     * @param array input array as argument
     * @return last element of array as <code>E</code> datatype
     */
    public static <E> E last(E[] array) {
        return array[array.length-1];
    }
    
    /**
     * Last returns last <code>n</code> element(s) of the array
     * 
     * @param <E> Generic Datatype Element
     * @param array input array as argument
     * @param n number of elements to return from the last of array
     * @return last element of array as <code>E</code> datatype
     */
    public static <E> E[] last(E[] array, int n) {
        Object[] newArr = new Object[n];
 
        System.arraycopy(array, array.length-n, newArr, 0, n);       
        return (E[]) newArr;
    }
    
    /**
     * isLast checks if the specified <code>element</code> is the last element of <code>array</code> or not
     * 
     * @param <E> Generic Datatype
     * @param array input array as argument
     * @param element element to check if its last
     * @return true or false if isLast or not
     */
    public static <E> boolean isLast(E[] array, E element) {
        return last(array) == element;
    }
    
    /**
     * Resizes the given <code>array</code> as argument and returns a new array of length <code>n</code>
     * 
     * @param <E> Generic datatype element
     * @param array input array to be resized as argument
     * @param n new length of array to resize
     * @return resized array of datatype <code>E[]</code>
     */
    public static <E> E[] resize(E[] array, int n) {
        Object[] newArr = new Object[n];        
        
        System.arraycopy(array, 0, newArr, 0, n);
        return (E[]) newArr;
    }
    
    /**
     * Drops the specified element at <code>index</code> and returns the rest of the array
     * 
     * @param <E> Generic datatype element
     * @param array input array as argument
     * @param index index of the array to be dropped
     * @return new array after dropping the specified index
     */
    public static <E> E[] drop(E[] array, int index) {
        Object[] newArr = new Object[array.length-1];
        
        System.arraycopy(array, 0, newArr, 0, index);
        System.arraycopy(array, index+1, newArr, index, array.length-index-1);
        
        return (E[]) newArr;
    }
    
    /**
     * Finds first occurance of the given <code>element</code> and returns the index of the found element
     * If nothing found then returns -1
     * 
     * @param <E> Generic datatype element
     * @param array input array to search in
     * @param element element to find
     * @return index of the element found if no matches found then return -1
     */
    public static <E> int find(E[] array, E element) {
        for(int index = 0; index < array.length; index++) {
            if(array[index] == element) return index;
        }
        return -1;
    }
    
    /**
     * toString returns a formal representation of the <code>array</code> in a string
     * 
     * @param array input array to be toString
     * @return String
     */
    public static <E> String toString(E[] array) {
        String toStr = "[";
        
        for(E element : array) {
            toStr += element;
            toStr += (!isLast(array, element)) ? ", " : "";
        }
        toStr += "]";
        return toStr;
    }
}
