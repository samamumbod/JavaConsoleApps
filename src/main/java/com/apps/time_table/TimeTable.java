package com.apps.time_table;

import java.util.Scanner;

public class TimeTable {

    public static void main(String arg[])
    {
        int product,number,i;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number you want to see its time table: ");
        number=in.nextInt();
        for(i=1; i<=12; i++)
        {
            System.out.printf(" %d * %2d = %2d\n", number, i, (number*i));
        }
    }


}
