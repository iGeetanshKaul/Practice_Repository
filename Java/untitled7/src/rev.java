import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder reversedString= new StringBuilder();
        String s=input.nextLine();

        for(int i=0;i<=s.length();i++){
            char rev=s.charAt(i);

            reversedString.append(rev);
        }
        if(reversedString.toString().equals(s)){
            System.out.println("palindrome");
        }else System.out.println("not a pallindrome");
    }
}