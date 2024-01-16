import java.util.Scanner;

public class untillzero {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int add=0;
        System.out.println("Enter numbers: ");

        while(input.hasNextInt()){
            int i=input.nextInt();
            if(i!=0){
                add+=i;
            }
            else
              break;

        }
        System.out.println(add);


    }
}
