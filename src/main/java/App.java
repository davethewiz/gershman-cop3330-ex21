/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Hashtable;

public class App
{
    public static void main( String[] args )
    {
        Hashtable<Integer, String> numMonth = new Hashtable<Integer, String>();

        numMonth.put(1, "January");
        numMonth.put(2, "February");
        numMonth.put(3, "March");
        numMonth.put(4, "April");
        numMonth.put(5, "May");
        numMonth.put(6, "June");
        numMonth.put(7, "July");
        numMonth.put(8, "August");
        numMonth.put(9, "September");
        numMonth.put(10, "October");
        numMonth.put(11, "November");
        numMonth.put(12, "December");

        int monthNum = Input.GetInt("Please enter the number of the month: ");

        System.out.print("The name of the month is " + numMonth.get(monthNum) + ".");
    }
}