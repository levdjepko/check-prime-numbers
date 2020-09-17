import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean isPrime (int number) {
        for( int i = 2; i <= Math.sqrt(number); i++ ) {
            if ( number % i == 0 ) {
                return false;
            }            
        }
        return true;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        for ( int i = 0; i < numberOfCases; i++ ) {
            if ( isPrime(sc.nextInt()) ) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not prime");
            }
        }
        
    }
}
