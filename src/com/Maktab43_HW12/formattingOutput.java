package com.Maktab43_HW12;
import java.util.Scanner;

public class formattingOutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<3;i++){
            String string = scanner.next();
            int digit = scanner.nextInt();
            System.out.printf("%-14s %03d\n", string, digit);
        }

    }
}
