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
     * @param ar Returns Array to be reversed
     * @since 1.0
     */
    public static < E> void reverse(E[] ar) {
        for (int i = 0; i < mintNumbers.floor(ar.length / 2); i++) {
            E temp = ar[i];
            ar[i] = ar[ar.length - 1 - i];
            ar[ar.length - 1 - i] = temp;
        }
    }

    /**
     * Sorts numerical array in ascending order using bubble sort
     *
     * @param sortMe Array to be sorted
     * @since 1.0
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
     * Sorts Generic number object array in ascending order using bubble sort
     *
     * @param sortMe Numeric array to be sorted
     * @since 1.0
     */
    public static <E extends Number> void sort(E[] sortMe) {
        for (int i = 0; i < sortMe.length; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < sortMe.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (sortMe[j].doubleValue() > sortMe[j + 1].doubleValue()) {
                    E tmp = sortMe[j];
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
     * Sorts Generic number object array in descending order using bubble sort
     *
     * @param sortMe Numeric array to be sorted
     * @since 1.0
     */
    public static <E extends Number> void sortD(E[] sortMe) {
        for (int i = 0; i < sortMe.length; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < sortMe.length - 1; j++) {
                // Swap adjacent elements if they are in increasing order
                if (sortMe[j].doubleValue() < sortMe[j + 1].doubleValue()) {
                    E tmp = sortMe[j];
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
     * Sorts integer array in descending order using bubble sort
     *
     * @param sortMe Integer array to be sorted
     * @since 1.0
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
     * Sorts integer object array in descending order using bubble sort
     *
     * @param sortMe Integer object array to be sorted
     * @since 1.0
     */
    public static void sortD(Integer[] sortMe) {
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
     * Sorts String array in alphabetical order (case-insensitive) using
     * bubble sort
     *
     * @param sortMe String object array to be sorted
     * @since 1.0
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
     * Sorts String array in descending alphabetical order (case-insensitive)
     * using bubble sort
     *
     * @param sortMe String object array to be sorted
     * @since 1.0
     */
    public static void sortD(String[] sortMe) {
        for (int i = 0; i < sortMe.length; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < sortMe.length - 1; j++) {
                // Swap adjacent elements if they are in increasing order
                if (sortMe[j].compareToIgnoreCase(sortMe[j + 1]) <= 1) {
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
     * @param <E> Datatype E Array Object
     * @param array1 First Array Object
     * @param array2 Second Array Object
     * @return Returns boolean result
     * @since 1.0
     */
    public static < E extends Comparable> boolean compare(final E[] array1, final E[] array2) {
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
     * @param <E> Datatype E Array Object
     * @param array1 First Array Object
     * @param array2 Second Array Object
     * @return Returns boolean array after comparing
     * @since 1.0
     */
    public static <E> boolean[] compareE(final E[] array1, final E[] array2) {
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
     * @param array Input argument
     * @return Returns single first element of E datatype
     * @since 1.0
     */
    public static <E> E first(final E[] array) {
        return array[0];
    }

    /**
     * Returns first <code>n</code> elements from the <code>array</code>
     *
     * @param <E> Generic Datatype
     * @param array Input array as argument
     * @param n Number of first elements to return
     * @return Returns <code>E[]</code> array having first <code>n</code> elements
     * @since 1.0
     */
    public static <E> E[] first(final E[] array, final int n) {
        E[] newArr = (E[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), n);

        System.arraycopy(array, 0, newArr, 0, n);
        return newArr;
    }

    /**
     * isFirst checks if the specified <code>element</code> is the first element
     * of <code>array</code> or not
     *
     * @param <E> Generic Datatype
     * @param array Input array as argument
     * @param element Element to check if its first
     * @return Returns true or false if isFirst or not
     * @since 1.0
     */
    public static <E> boolean isFirst(final E[] array, final E element) {
        return first(array) == element;
    }

    /**
     * Initial returns everything but not the last element of the
     * <code>array</code>
     *
     * @param <E> Generic Datatype Element
     * @param array Input argument
     * @return Returns new array not having the last element
     * @since 1.0
     */
    public static <E> E[] initial(final E[] array) {
        E[] newArr = (E[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), array.length - 1);

        System.arraycopy(array, 0, newArr, 0, array.length - 1);
        return newArr;
    }

    /**
     * Initial returns everything but not the <code>n</code> last elements
     *
     * @param <E> Generic Datatype Element
     * @param array Input argument
     * @param n Number of elements to leave from the last
     * @return Returns new array not having last <code>n</code> elements
     * @since 1.0
     */
    public static <E> E[] initial(final E[] array, final int n) {
        E[] newArr = (E[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), array.length - n);

        System.arraycopy(array, 0, newArr, 0, array.length - n);
        return newArr;
    }

    /**
     * Last returns the last element of the array
     *
     * @param <E> Generic Datatype Element
     * @param array Input array as argument
     * @return Returns last element of array as <code>E</code> datatype
     * @since 1.0
     */
    public static <E> E last(E[] array) {
        return array[array.length - 1];
    }

    /**
     * Last returns last <code>n</code> element(s) of the array
     *
     * @param <E> Generic Datatype Element
     * @param array Input array as argument
     * @param n Number of elements to return from the last of array
     * @return Returns last element of array as <code>E</code> datatype
     * @since 1.0
     */
    public static <E> E[] last(final E[] array, final int n) {
        E[] newArr = (E[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), n);

        System.arraycopy(array, array.length - n, newArr, 0, n);
        return newArr;
    }

    /**
     * isLast checks if the specified <code>element</code> is the last element
     * of <code>array</code> or not
     *
     * @param <E> Generic Datatype
     * @param array Input array as argument
     * @param element Element to check if its last
     * @return Returns true or false if isLast or not
     * @since 1.0
     */
    public static <E> boolean isLast(final E[] array, final E element) {
        return last(array) == element;
    }

    /**
     * Resizes the given <code>array</code> as argument and returns a new array
     * of length <code>n</code>
     *
     * @param <E> Generic datatype element
     * @param array Input array to be resized as argument
     * @param n New length of array to resize
     * @return Returns resized array of datatype <code>E[]</code>
     * @since 1.0
     */
    public static <E> E[] resize(final E[] array, final int n) {
        E[] newArr = (E[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), n);
        
        if(array.length > n)
            System.arraycopy(array, 0, newArr, 0, n);
        else {
            System.arraycopy(array, 0, newArr, 0, array.length);
        }
            
        return newArr;
    }

    /**
     * Drops the specified element(s) at <code>index</code> and returns the rest of
     * the array
     *
     * @param <E> Generic datatype element
     * @param array Input array as argument
     * @param index Index of the array to be dropped
     * @return Returns New array after dropping the specified index
     * @since 1.0
     */
    public static <E> E[] drop(E[] array, int ...index) {
        E[] newArr = array.clone();

        for(int element : index) {
            System.arraycopy(array, 0, newArr, 0, index.length-1);
            System.arraycopy(array, element + 1, newArr, element, array.length - element - 1);
        }
        
        return newArr;
    }

    /**
     * Finds first occurance of the given <code>element</code> and returns the
     * index of the found element If nothing found then returns -1
     *
     * @param <E> Generic datatype element
     * @param array Input array to search in
     * @param element Element to find
     * @return Returns index of the element found if no matches found then return -1
     * @since 1.0
     */
    public static <E> int find(final E[] array, final E element) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == element) {
                return index;
            }
        }

        return -1;
    }

    /**
     * ToString returns the formal representation of the <code>array</code> in a
     * string
     *
     * @param array Input array to be toString
     * @return Returns String
     * @since 1.0
     */
    public static <E> String toString(final E[] array) {
        String toStr = "[";

        for (int index = 0; index < array.length; index++) {
            toStr += array[index];
            toStr += (index == array.length - 1) ? "" : ", ";
        }
        toStr += "]";
        return toStr;
    }

    /**
     * Checks if <code>array</code> contains the given <code>element</code>
     * 
     * @param array Input array as argument
     * @param element Element to be checked in array
     * @return Returns true if it contains else false
     * @since 1.0
     */
    public static <E> boolean contains(final E[] array, final E element) {
        if(find(array, element) != -1)  {
            return true;
        }
        return false;
    }
    
    /**
     * Generates random integer array of length less than 10 and numbers less
     * than 100
     * 
     * @return Returns randomly generated Integer object array
     * @since 1.0
     */
    public static Integer[] randomIntArray() {
        Integer[] arr = new Integer[mintNumbers.randomInt(10)];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = mintNumbers.randomInt(100);
        }
        
        return arr;
    }
    
    /**
     * Generates random integer array of length less than <code>n</code> and numbers less than <code>m</code> 
     * 
     * @param n Parameter belonging to int datatype
     * @param m Parameter belonging to int datatype
     * @return Returns randomly generated Integer object array
     * @since 1.0
     */
    public static Integer[] randomIntArray(final int n, final int m) {
        Integer[] arr = new Integer[mintNumbers.randomInt(n)];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = mintNumbers.randomInt(m);
        }
        
        return arr;
    }
    
    /**
     * Union returns an array of elements of <code>array1</code>, in 
     * <code>array2</code> or common in both <code>array1</code> and 
     * <code>array2</code>  
     * 
     * @param array1 first array as argument
     * @param array2 second array as argument
     * @return union-ed array of minimum length <code>array1.length</code>
     */
    public static <E> E[] union(final E[] array1, final E[] array2) {
        E[] result = array1.clone();
        
        for(E element : array2) {
            if(!contains(array1, element)) {
                result = resize(result, result.length + 1);
                result[result.length - 1] = element;
            }
        }
        
        return result;
    }
    
    /**
     * Intersection returns an array of elements containing common members of 
     * <code>array1</code> and <code>array2</code>
     * 
     * @param array1 first array as argument
     * @param array2 second array as argument
     * @return intersection array of <code>array1</code> and <code>array2</code>
     */
    public static <E> E[] intersection(final E[] array1, final E[] array2) {
        E[] result = (E[]) java.lang.reflect.Array.newInstance(array1.getClass().getComponentType(), 0);
        
        for(E element : array1) {
            if(contains(array1, element) && contains(array2, element)) {
                result = resize(result, result.length + 1);
                result[result.length - 1] = element;
            }
        }
        
        return result;
    }

}