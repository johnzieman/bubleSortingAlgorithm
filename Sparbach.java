package com.first;

import java.util.Arrays;

public class Sparbach {
    public static void main(String[] args) {
        int [] massive = {4, 2, 9, 6, 12, 7, 10, 3, 13, 11, 77, 100, 1};
        bubleSort(massive);
    }

    public static void bubleSort(int[] massive){
        for(int i = 0; i < massive.length - 1; i++){
            for(int j = 0; j < massive.length-1; j++){
                if(massive[j] > massive[j+1]){
                    int m = massive[j];
                    massive[j] = massive[j+1];
                    massive[j+1] = m;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}