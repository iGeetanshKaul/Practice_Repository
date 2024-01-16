import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        String str = "Geetansh Kaul";
        char target = 'K';
       // int num = search(str,target);
        //System.out.println(str.toCharArray());
        System.out.println(Arrays.toString(searchThatChar(str)));
    }
    static char[] searchThatChar(String str){
        char[] newCharArr = new char[str.toCharArray().length];

        for (int  i = 0; i < str.toCharArray().length; i++) {
            newCharArr[i] = str.charAt(i);
        }
        return newCharArr;

    }











//    static int search(String str,char target){
//        for (int index = 0; index < str.length(); index++) {
//            if(target == str.charAt(index)){
//                return index;
//            } else if(str.length() == 0){
//                return Integer.MAX_VALUE;
//            }
//        }
 //       return Integer.MAX_VALUE;

    }