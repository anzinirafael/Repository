package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        try{
            String[] vector = sc.nextLine().split(" ");
            Integer position = sc.nextInt();
            System.out.println(vector[position]);
        }
        catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Invalid position!");
            error.printStackTrace();
            sc.nextLine();
        }
        catch (InputMismatchException error){
            System.out.println("Input error");
            error.printStackTrace();
            sc.nextLine();
        }
        sc.close();
        System.out.println("***METHOD2 END***");
    }
}
