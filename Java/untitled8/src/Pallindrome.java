public class Pallindrome {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean check = checkPallindrome(n);
        System.out.println(check);
    }

    private static boolean checkPallindrome(int n) {
        int a=n;
        int rev = 0;
        while(n!=0){
            int rem = n%10;
            rev = rev*10 + rem;
            n=n/10;
        }
        return rev == a;
    }
}