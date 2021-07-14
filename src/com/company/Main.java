package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here


                Scanner input = new Scanner(System.in);
                System.out.println("Enter the weight of the package: ");
                int weight = input.nextInt();

                if(weight <= 2)
                {
                    System.out.println("Cost of package is 2.5$");
                } else if (weight <= 4)
                {
                    System.out.println("Cost of package is 4.5$");
                } else if ( weight <= 10)
                {
                    System.out.println("Cost of package is 7.5$");
                } else if (weight <= 20)
                {
                    System.out.println("Cost of package is 10.5$");
                } else if (weight > 20)
                {
                    System.out.println("Error");
                }


            }
        }


