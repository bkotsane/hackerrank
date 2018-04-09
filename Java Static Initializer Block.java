/**
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth and height . You should read the variables from the standard input.

If or , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Constraints
The original constraints were -100 to 100, but i put the scanner in try-catch which means it an even work if it's not integer

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
**/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static Boolean flag = false ; 
    static int B = 0 ;
    static int H = 0 ;
    static {
        Scanner sc = new Scanner(System.in); 
        try {
            B = sc.nextInt(); 
            H = sc.nextInt(); 
            if (B <= 0 || H <= 0 )System.out.println("java.lang.Exception: Breadth and height must be positive");  
            else flag = true ; 
        } catch (Exception e) { 
        System.out.println("java.lang.Exception: Breadth and height must be positive"); 
        }  
    }
    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class


