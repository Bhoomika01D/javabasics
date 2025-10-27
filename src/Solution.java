import java.util.Scanner;

public class Solution {
    public int countDigit(int n) {
        int count=0;
        while(n!=0)
        {
            n=n/10;

            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        System.out.println(s.countDigit(n));
    }
}


