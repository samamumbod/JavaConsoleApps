package com.apps.one_month_calendar;

import java.util.Scanner;

public class OneMonthCalendar {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int number;
        int  i;
        int startDay;

        System.out.print("\n");
        System.out.print("Enter number of days in a month: ");
        number=in.nextInt();
        System.out.print("Sun=1 Mon=2 Tue=3 Wed=4 Thur=5 Fri=6 Sat=7\n");
        System.out.print("Enter starting day: ");
        startDay=in.nextInt();
        System.out.print("Su\tMo\tTu\tWe\tTh\tFr\tSa\n");
        for(i=1; i<=startDay; i++)
        {
            System.out.print("  ");
        }
        for(int j=1; j<=number; j++)
        {
            System.out.printf("%2d\t",j);
            if((j+startDay-1)%7==0)
            {
                System.out.print("\n");
            }
        }
    }
}
