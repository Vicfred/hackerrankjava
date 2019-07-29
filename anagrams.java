import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

public class Solution {

    static boolean isAnagram(String a, String b) {
        HashMap<String, Integer> letters_a = new HashMap<>();
        for(char c: a.toCharArray()) {
            if(null != letters_a.get(c+""))
                letters_a.put(c+"", letters_a.get(c+"")+1);
            else
                letters_a.put(c+"", 0);
        }
        HashMap<String, Integer> letters_b = new HashMap<>();
        for(char c: b.toCharArray()) {
            if(null != letters_b.get(c+""))
                letters_b.put(c+"", letters_b.get(c+"")+1);
            else
                letters_b.put(c+"", 0);
        }
        Set<String> letters = letters_a.keySet();
        boolean equals = true;
        for(String letter: letters) {
            if(letters_a.get(letter) != letters_b.get(letter))
                equals = false;
        }
        return equals;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a.toLowerCase(), b.toLowerCase());
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

