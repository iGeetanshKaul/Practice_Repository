import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        System.out.println("Enter the three numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = getMaximum(a,b,c);
        int min = getMinimum(a,b,c);
        int intermediate = getIntermediate(a,b,c);


        }

    static int getMaximum(int a,int b, int c) {
        int g1 = a>b?a:b;
        int g2 = g1>c?g1:c;
        return g2;
    }

    static int getMinimum(int a,int b, int c){
        int m1 = (a<b)?a:b;
        int m2 = m1<c?m1:c;
        return m2;
    }

    static int getIntermediate(int a, int b ,int c){

    }


}