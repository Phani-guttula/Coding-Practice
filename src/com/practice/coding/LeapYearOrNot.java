package com.practice.coding;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = scanner.nextInt();

        if(year % 400 == 0){
            System.out.println(year+ " Leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year+ " Leap year.");
        }else {
            System.out.println(year+ " Not a Leap year.");
        }
    }


}
