package pdpuz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution_2942 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution_2942 sol1 = new Solution_2942();
        String[] arrwords={"leet","code"};
        char c='e';
        System.out.println(sol1.findWordsContaining(arrwords, c));

    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))){
                result.add(i);
            }

        }

        return result;


    }
}
