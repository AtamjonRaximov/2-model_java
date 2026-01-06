package pdpuz;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution_500 {
    public static void main(String[] args) {
        Solution_500 solution500 = new Solution_500();

        String[] arr = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(solution500.findWords(arr)));

    }

    public String[] findWords(String[] words) {
        return Stream.of(words).filter(w ->
                        w.toLowerCase()
                                .matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*"))
                .toArray(String[]::new);

    }
}
