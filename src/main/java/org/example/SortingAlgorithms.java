package org.example;

public class SortingAlgorithms {

    public static void main(String[] args) {

        int[] numb = {6,5,3,2,9,4};
        int size = numb.length;
        int temp =0;

        System.out.print("before sorting" );

        for (int num : numb){
            System.out.print(num + " ");
        }

        for (int i = 0; i<size; i++){
            for (int j = 0; j<size- i-1;j++){
                if (numb[j] > numb[j+1]){
                    temp = numb[j];
                    numb[j] = numb[j+1];
                    numb[j+1] = temp;

                }
            }
        }

        System.out.println();
        System.out.println("after sorting");

        for (int num : numb){
            System.out.print(num + "");
        }
    }
}
