// Write a java program to input a 2 digit number and convert it into words.

import java.util.Scanner;

public class DoubleDigit {

    static String Words(int n) {
        String ones[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eigth", "Nine" };
        String tens[] = { "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        String result = "";
        switch (n) {
            case 10:
                result = "Ten";
                break;
            case 11:
                result = "Eleven";
                break;
            case 12:
                result = "Twelve";
                break;
            case 13:
                result = "Thirteen";
                break;
            default:
                int o = n % 10;
                int t = n / 10;
                if (n < 20)
                    result = ones[o] + "teen";
                else
                    result = tens[t - 1] + " " + ones[o];
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double digit number: ");
        int n = sc.nextInt();
        if (n < 10 || n > 99)
            System.out.println("Invalid number");
        else
            System.out.println(Words(n));
        sc.close();
    }
}
