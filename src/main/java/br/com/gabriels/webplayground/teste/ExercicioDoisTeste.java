package br.com.gabriels.webplayground.teste;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ExercicioDoisTeste    {
    public static void main (String[] args) {
        AtomicInteger maxNumber = new AtomicInteger(3);
//        AtomicInteger maxNumber = new AtomicInteger(3);
//        int[] A = new int[] {1};
//        int[] B = new int[] {3};





//        int[] A = new int[] {2,2,1,2};
//        int[] B = new int[] {1,3,4,4};
        int[] A = new int[] {4,3};
        int[] B = new int[] {2,1};

        List<Integer> collect = Arrays.stream(A).boxed().collect(Collectors.toList());
        collect.addAll(Arrays.stream(B).boxed().toList());

        HashMap<Integer, Integer> repetitionPerNumber = new HashMap<>();

        for(int i=0; i < collect.size(); i++) {
            if (!repetitionPerNumber.containsKey(collect.get(i))) {
                int frequency = Collections.frequency(collect, collect.get(i));
                repetitionPerNumber.put(collect.get(i), frequency);
            }
        }

        Comparator<Map.Entry<Integer, Integer>> comparator = Map.Entry.comparingByValue();

        Map<Integer, Integer> orderedMap = repetitionPerNumber.entrySet()
                .stream()
                .sorted(comparator.reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println(orderedMap);
        //ATRIBUIR O MAXNUMBER PARA QUEM APARECE MAIS VEZES

        Map<Integer, Integer> vertices = new HashMap<>();
        orderedMap.forEach((key, value) -> vertices.put(key, maxNumber.getAndDecrement()));

        orderedMap.entrySet();
        // FAZER A "DISTRIBUTIVA" ENTRE OS ARRAYS
        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            sum += vertices.get(A[i]) + vertices.get(B[i]);
        }

        System.out.println(sum);
    }
}
