package org.example;

public class Selectionsort {

    public static void main(String[] args) {

        int[] numb = {6,5,3,2,9,4};
        int size = numb.length;
        int temp =0;

        System.out.print("before sorting" );
        for (int num : numb){
            System.out.println(num + " ");
        }

        for (int i =0; i< size-1; i++ ){
            int minIndex = i;
            for (int j = i; j<size;j++){
                if (numb[minIndex]> numb[j]){
                    minIndex = j;
                }
            }

            temp = numb[minIndex];
            numb[minIndex] = numb[i];
            numb[i] = temp;

        }


        System.out.println();
        System.out.println("after sorting");

        for (int num : numb){
            System.out.print(num + "");
        }
    }
    }

