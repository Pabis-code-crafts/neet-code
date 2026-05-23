package org.example.prac;

import java.util.*;

public class prac {
    public static void main(String[] args) {
        int container[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int l = 0;
        int r = container.length-1;
        int maxhold = 0;


        while(l<r){
            int surface = r -l;
            int holdheight = Math.min(container[r],container[l]);
            maxhold = Math.max(surface*holdheight,maxhold);
            if(container[r]>container[l]){
                l++;
            }else r--;


        }
        System.out.println(maxhold);
    }


}
