/*
 * Copyright (C) 2018, Manjot Sidhu <manjot.techie@gmail.com>
 */

package com.github.manjotsidhu.mint;

import java.util.ArrayList;
import java.util.Arrays;

public class mintTest {
    public static void main(String[] args) {
        mintArrays mintMe = new mintArrays();
        mintNumbers mintMeToo = new mintNumbers();
        Integer[] i1 = {6,1,2,8,3,1,8,3,99,1222};
        mintArrays.reverse(i1);
        //System.out.println(Arrays.toString(i1));
        Integer[] i2 = {6,4,2,1,3,5,8,1,99,1222};
        ArrayList<Integer> i = new ArrayList<>();
        //i.addA(i1);
        double x = 9.99991;
        double y = 9.99992;
        String[] s1 = {"masnjot", "singh", "sidhu"};
        String[] s2 = {"manjot", "singh", "sidhu"};
        mintMe.reverse(s2);
        //System.out.println(Arrays.toString(s2));
        
        String[] sortt = {"ab", "Az", "ac", "ae", "ss"};
        //mintArrays.reverse(sortt);
       // System.out.println(Arrays.toString(sortt));
        
        //mintMe.sortD(testIntArr);
        //System.out.println(Arrays.toString(testIntArr));
        //System.out.println(mintMeToo.min(-0.9999, -0.99999));
        //System.out.println(mintMeToo.max(x, y));
        
        System.out.println(mintMeToo.ceil(-2));
        //System.out.println(Arrays.toString(mintMe.compareE(i1, i2)));
        //System.out.println(mintMeToo.floor(2214.9999));
        //System.out.println(mintMeToo.ceil(2214.9999));
    }
}
