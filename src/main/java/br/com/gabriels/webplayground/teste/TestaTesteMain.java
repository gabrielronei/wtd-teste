package br.com.gabriels.webplayground.teste;

import java.util.HashSet;
import java.util.Set;

public class TestaTesteMain {
    public static int solution(int[] A) {
        // write your code in Java SE 8

        Set<Integer> numbers = new HashSet();

        for (Integer number: A) {
            if (number > 0) {
                numbers.add(number);
            }
        }

        for (int i = 1; i <= numbers.size() + 1; i++) {
            if (!numbers.contains(i)) {
                return i;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
    }
}
