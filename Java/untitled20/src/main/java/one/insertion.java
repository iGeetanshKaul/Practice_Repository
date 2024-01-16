package one;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 9,874, -23,5 ,7,3,-23,7};

        HashMap<Integer,Integer> hashm = new HashMap<>(arr.length);

        for(int i : arr){
            int count = 0;
            if(hashm.containsKey(i)){
                hashm.put(i,hashm.get(i + 1));

            }if(!hashm.containsKey(i)){
                hashm.put(i,++count);
            }
        }

       for(Map.Entry entry: hashm.entrySet()){
           System.out.println("Element | Frequency");
           System.out.println(entry.getKey()+"    "+entry.getValue());
       }




    }
}