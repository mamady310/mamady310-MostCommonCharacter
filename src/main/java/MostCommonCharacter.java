import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        List<Character> chars = new ArrayList<>(); 
        Map<Character, Integer> feq = new HashMap<Character, Integer>();
        char letter = '\0'; 
             for (char ch : str.toCharArray()) { 
                 chars.add(ch); 
             } 
             for (Character x : chars){
                feq.put(x, Collections.frequency(chars, x));
              }
        int max = (Collections.max(feq.values()));
        
        for(Map.Entry<Character, Integer> c: feq.entrySet()) {
               if(c.getValue() == max) {
                   letter = c.getKey();
               }
        }
         return letter;
    }



}
