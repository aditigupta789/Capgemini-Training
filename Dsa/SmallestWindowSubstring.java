package Dsa;

import java.util.HashMap;

public class SmallestWindowSubstring {

    public static void main(String[] args) {

        String s="ADOBECODEBANC";

        String t="ABC";

        HashMap<Character,Integer> map=new HashMap<>();

        for(char c:t.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);

        int left=0,min=Integer.MAX_VALUE;

        for(int right=0;right<s.length();right++){

            if(map.containsKey(s.charAt(right)))
                map.put(s.charAt(right),
                        map.get(s.charAt(right))-1);

            while(map.values().stream().allMatch(v->v<=0)){

                min=Math.min(min,right-left+1);

                if(map.containsKey(s.charAt(left)))
                    map.put(s.charAt(left),
                            map.get(s.charAt(left))+1);

                left++;
            }
        }

        System.out.println("Min length: "+min);
    }
}
