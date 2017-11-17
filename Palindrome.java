/** Program: Palindrome Program
 * File: Palindrome.java
 * Summary: The program will take the prime palindrome of 100,000 and display them to the console.
 * Author: Robert J. Nichols
 * Date: November 6, 2017
 **/ 

public class Palindrome 
{
    public static void main(String[] args) 
    {
        int palindrome = 100000;

        for(int i=2; i<palindrome; i++)
        {
            if(isPalindrome(i) && isPrime(i)) //if the number is both a prime and an integer then we will print.
            {
                System.out.print(i + "\t");
            }
        }
    }
    
    public static boolean isPalindrome(int number) //Used to find the palindrome of the integer.
    {
        int palindrome = number;
        int reverse = 0;
        
        while(palindrome > 0)
        {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        
        if(number == reverse)
        {
            return true;
        }
        return false;
    }
    
    static boolean isPrime(int n) //method used to find the prime number of the integer.
    {
        for(int i=2; i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}