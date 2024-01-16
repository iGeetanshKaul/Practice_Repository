import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        System.out.println("Enter the numbers: ");
        Scanner input=new Scanner(System.in);
        int large=0;
        int i,j;
        while(input.hasNextInt()){
            i=input.nextInt();
            j=input.nextInt();

            if(input.nextInt()!=0) {
                large = Math.max(i, j);
            }
            else
                break;
            }


        System.out.println(large);
            }




        }