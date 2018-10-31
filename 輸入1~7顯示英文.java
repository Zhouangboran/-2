package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner asd=new Scanner(System.in);
	int v1=asd.nextInt();
	switch (v1){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
                System.out.println("Tue");
                break;
        case 3:
                    System.out.println("Wen");
                    break;
        case 4:
            System.out.println("Thr");
            break;
        case 5:
                System.out.println("Fri");
                break;
        case 6:
            System.out.println("Sat");
            break;
        case 7:
            System.out.println("Sun");
            break;
    }

    }
}
