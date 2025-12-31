//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String word = sc.nextLine();
        System.out.println(palindrome(word));
        if(palindrome(word) == 1){
            System.out.println("It Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
        
    }

    static int palindrome(String word){
        int left = 0;
        int right = word.length()-1;
        while(left<right){
            if(word.charAt(left) != word.charAt(right)){
                return 0;
            }
            left++;
            right--;
        }
        return 1;
    }   
}

