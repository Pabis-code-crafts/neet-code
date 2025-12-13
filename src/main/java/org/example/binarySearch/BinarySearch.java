package org.example.binarySearch;

public class BinarySearch {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int target = 4;
        int indexLeft = 0;
        int indexRight = numbers.length - 1;


       int result = binarySearch(indexLeft,indexRight,numbers,target);


        System.out.println(result);



//        while (indexLeft <= indexRight){
//            int mid = (indexLeft+indexRight)/2;
//            if(numbers[mid]==target){
//                System.out.println(numbers[mid]);
//                break;
//            }
//            else if(numbers[mid]<=target){
//                indexLeft = mid + 1;
//            }else{
//                indexRight = mid - 1;
//            }
//        }

    }
    public static int binarySearch(int indexLeft,int indexRight,int[] numbers, int target ){

        if (indexLeft > indexRight) {
            return -1;
        }
        int mid = (indexLeft+indexRight)/2;
        if(numbers[mid]==target){
            return mid;
        }
        else if(numbers[mid]<=target){
            return binarySearch(mid+1,indexRight,numbers,target);
        }else{
            return binarySearch(indexLeft,mid-1,numbers,target);
        }

    }
}

