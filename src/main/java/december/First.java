package december;

import java.util.LinkedHashMap;
import java.util.Map;

public class First {
    public static void main(String[] args) {

    }

    public Map<Character, Integer> getCharOccurence(String s){
        if (s == null){
            throw new RuntimeException("Given String is null");
        }

        Map<Character, Integer> result = new LinkedHashMap<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i]  == chars[j]){
                    count = count +1 ;
                }

            }
            result.put(chars[i], count);
        }
        return result;
    }
}
