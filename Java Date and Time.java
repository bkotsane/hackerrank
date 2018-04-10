/**
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

For example, if you are given the date, 08 05 2015 , the method should return , MONDAY, as the day on that date. 
**/

import java.util.Scanner;
import java.text.SimpleDateFormat; 
import java.util.Date; 

public class Solution {
    public static String getDay(String day, String month, String year) {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy") ; 
        Date dt;
        try {
           dt = df.parse(day + "-" + month + "-" + year); 
           df.applyPattern("EEEE");
           String dayStr= df.format(dt);
           return dayStr.toUpperCase(); 
        }catch (Exception e) { 
           System.out.println("Unparseable using " + df); 
        }
        return ""; 
    }
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}
