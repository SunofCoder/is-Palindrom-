import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen kelime giriniz. ");
        str = scanner.nextLine();
        if(isPalindrome(str)){
            System.out.println(str+"  Palindromdur.");
        }else {
            System.out.println(str+" Palindrom değildir");
        }


        System.out.println(isPalindrome("abba"));
    }
}