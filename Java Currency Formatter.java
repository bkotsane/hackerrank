/**
Given a double-precision number, Payment, denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to Payment convert into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment

where formattedPayment is Payment formatted according to the appropriate Locale's currency.
Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).

Input Format

A single double-precision number denoting .

Constraints

Output Format

On the first line, print US: u where u is Payment formatted for US currency.
On the second line, print India: i where i is Payment formatted for Indian currency.
On the third line, print China: c where c is Payment formatted for Chinese currency.
On the fourth line, print France: f, where f is Payment formatted for French currency.
**/

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat usf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat cnf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat inf = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        
        String us = usf.format(payment);
        String china = cnf.format(payment);
        String france = frf.format(payment);
        String india = inf.format(payment);    
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
