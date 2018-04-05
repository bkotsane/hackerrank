/**
Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, , print its first multiples. Each multiple (where ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, .

Constraints

Output Format

Print lines of output; each line (where ) contains the of in the form:
N x i = result.
**/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int N = scan.nextInt(); 
        for(int i = 1; i < 11; i++ )
            System.out.print(N + " x " + i + " = " + N * i + "\n");
    }
}
