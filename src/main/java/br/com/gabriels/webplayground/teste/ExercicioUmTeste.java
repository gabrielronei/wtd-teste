package br.com.gabriels.webplayground.teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ExercicioUmTeste {
    public static void main(String[] args) {
        int[] A = new int[]{12332, 5, 6, 14, 10};
        int K = 2;

        List<Integer> convertedArray = Arrays.stream(A).boxed()
                .collect(Collectors.toList());

        int maxLength = convertedArray.stream().
                mapToInt(element -> element.toString().length()).max().orElse(0);

        int numberOfCompletedRows = convertedArray.size() / K;
        int totalNumbersLeftToCompleteRow = convertedArray.size() % K;

        if (numberOfCompletedRows > 0) {
            printDivider(K, maxLength);
        } else {
            printDivider(totalNumbersLeftToCompleteRow, maxLength);
        }

        System.out.println();

        for (int i = 0; i < numberOfCompletedRows; i++) {
            printFullFilledRow(K, convertedArray, maxLength);
        }

        if (totalNumbersLeftToCompleteRow > 0) {
            printIncompleteRow(totalNumbersLeftToCompleteRow, convertedArray, maxLength);
        }

    }

    private static void printFullFilledRow(int K, List<Integer> convertedArray, int maxLength) {
        printRow(K, convertedArray, maxLength);
    }

    private static void printIncompleteRow(int K, List<Integer> convertedArray, int maxLength) {
        printRow(K, convertedArray, maxLength);
    }

    private static void printRow(int K, List<Integer> convertedArray, int maxLength) {
        printNumberRow(K, maxLength, convertedArray);
        System.out.println();
        printDivider(K, maxLength);
        System.out.println();
    }

    static void printDivider(int cells, int maxLength) {
        StringBuilder row = new StringBuilder("+");
        for (int i = 0; i < cells; i++) {
            row.append("-".repeat(Math.max(0, maxLength)));
            row.append("+");
        }
        System.out.print(row);
    }

    static void printNumberRow(int cells, int maxLength, List<Integer> convertedArray) {
        StringBuilder row = new StringBuilder("|");

        for (int i = 0; i < cells; i++) {
            if (convertedArray.size() != 0) {
                int number = convertedArray.get(0);
                convertedArray.remove(0);

                StringBuilder blankSpacesBefore = new StringBuilder();
                int intLength = Integer.toString(number).length();

                blankSpacesBefore.append(" ".repeat(Math.max(0, maxLength - intLength)));
                blankSpacesBefore.append(number);
                row.append(blankSpacesBefore);
            }
            row.append('|');
        }
        System.out.print(row);
    }
}


//    SELECT place
//    FROM opinions
//    GROUP BY place
//        HAVING SUM(CASE
//        WHEN opinion = 'recommended' THEN 1
//        WHEN opinion = 'not recommended' THEN -1
//        END) > 0;


