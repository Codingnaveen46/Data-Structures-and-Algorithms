package org.example;

public class Main {
    public static void main(String[] args) {
        //dsa in java
        int[] numsp = {5,9,7,8,4};

        int target = 9;

        //doing with linear search

        int result = linearSearch(numsp,target);
        if (result != -1){
            System.out.println("Element found at index : " + result);
        } else {
            System.out.println("element found");
        }

    }

    public static int linearSearch(int[] numsp, int target) {

        for (int i = 0; i <numsp.length; i++){
            if (numsp[i] == target){
                return i;
            }
        }

        return -1;

    }

    // using binary search
    public static int binarysearch(int[] numsp, int target) {

      //5,7,9,11,13

        int left = 0;
        int right = numsp.length-1;

        while (left <= right){
            int mid = (left + right)/2;
            if (numsp[mid] == target){
                return mid;
            } else if (numsp[mid] < target) {
                 left = mid+1;
            }else
                right = mid + 1;
        }
        return -1;

    }

}