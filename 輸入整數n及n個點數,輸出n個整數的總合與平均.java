package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner asd=new Scanner(System.in);
        int n=asd.nextInt();
        int v1=0,sum=0;
        for (int i=0;i<n;i++){
            v1=asd.nextInt();
            sum=sum+v1;
        }
        System.out.println(sum);
        System.out.println(sum/n);
    }
}
