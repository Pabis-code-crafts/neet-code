package org.example.longestMountain;

public class LongestMountain {
    public static void main(String[] args) {
        int[] mountain = {2,4,7,3,1,4,5};
        int l=0;
        int r=0;
        int longest = 0;
        for (int i = 1; i < mountain.length-2; i++) {
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                r=i;
                l=r;
            }else {
                continue;
            }
            while (l>0 && mountain[l]>mountain[l-1]){
                l=l-1;
            }
            while (r< mountain.length-1 && mountain[r]>mountain[r+1]){
                r=r+1;
            }
            longest = Math.max(longest,r-l);
        }
        System.out.println(longest);
    }

}
