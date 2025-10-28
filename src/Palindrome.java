
    import java.util.Scanner;

    class PalindromeCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int temp = n;
            int rev = 0;

            while (n > 0) {
                int digit = n % 10;
                rev = rev * 10 + digit;
                n = n / 10;
            }

            if (temp == rev)
                System.out.println(temp + " is Palindrome");
            else
                System.out.println(temp + " is NOT Palindrome");
        }
    }


