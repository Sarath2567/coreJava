package institute.arrayPractice;
import java.util.*;

public class StringArray {
    public static void main(String[] args) {
        String[] names = {"eat", "tea", "ant", "tan", "bat","sleep"};
        Map<String, List<String>>map=new HashMap<>();
        for(String word:names){
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            map.computeIfAbsent(sorted,k->new ArrayList<>()).add(word);
        }
        System.out.println("Grouped Anagrams:");
        for (List<String>group:map.values()){
            System.out.println(group);
        }



    }


}
