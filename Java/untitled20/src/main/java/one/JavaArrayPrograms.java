package one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JavaArrayPrograms {
    public static void main(String[] args) {
        int[] arr = {1, 1, -55, -55, 9, 9,7 ,4, 6, 4, 9, 7, -1, 6,4};

        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            if(!hmap.containsKey(arr[i])){
                hmap.put(arr[i],1);
            }else
            {
                hmap.put(arr[i],hmap.get(arr[i]) + 1);
            }
        }

       for(Map.Entry entry: hmap.entrySet()){
           System.out.println("Element || Frequency");
           System.out.println(entry.getKey()+"  "+entry.getValue());
       }


        }



    }