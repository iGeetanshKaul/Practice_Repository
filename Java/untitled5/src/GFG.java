


import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
        // code here
        int num1=0;
        int num2=1;
        // int c=n;
        int sum=0;

        for(int i=2;i<=n;i++){
            sum=num1+num2;
            num1=num2;
            num2=sum;

            //System.out.println(sum);
        }
        return sum;
    }
}