package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        int n = asd.nextInt();
        float v1 = 0.0f;
        float maxVal = Float.MIN_VALUE;
        float minVal = Float.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            v1 = asd.nextFloat();
            if (v1 > maxVal) {
                maxVal = v1;
            }
            if (v1 < minVal) {
                minVal = v1;
            } else {
            }
        }
        System.out.println(maxVal);
        System.out.println(minVal);
    }
}