package com.practice.coding;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        int count = 0;
        if(num < 0){
            System.out.println("Not a prime Number");
        }
        for(int i=1; i < num; i++){
            if(num % i == 0) {
                count++;
            }
        }
        if(count < 2){
            System.out.println(num+ " is Prime Number.");
        }else{
            System.out.println(num+ "is Not Prime Number");
        }
    }
}
