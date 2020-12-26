package com.kodluyoruz.selen.question3;

import java.util.*;

public class ListCleaner {

    public static void main(String[] args) {

        List<Integer> list = randomGenerator(10);
        Set<Integer> duplicates = findDuplicates(list);
        //List<Integer> duplicates2 = findDuplicates2(list);
        System.out.println(list);

        System.out.println(duplicates);
        //System.out.println(duplicates2);
    }

    public static Set<Integer> findDuplicates(List<Integer> numbers){
        List<Integer> elements =  new ArrayList<>();
        Set<Integer> duplicates =  new HashSet<>();
        for (Integer num: numbers) {
            if (!elements.contains(num))
                elements.add(num);

            else
                duplicates.add(num);

        }
        return duplicates;
    }
    public static List<Integer> findDuplicates2(List<Integer> numbers){
        List<Integer> elements =  new ArrayList<>();
        Map<Integer,Integer> numberCounts = new HashMap<>();
        for (Integer num: numbers) {
           if (!numberCounts.containsKey(num)){
               numberCounts.put(num,1);
           }
           else{
               Integer count = numberCounts.get(num);
               count++;
               numberCounts.put(num,count);
           }
        }
        for(Map.Entry<Integer,Integer> entry : numberCounts.entrySet() ){
            if (entry.getValue() > 1)
                elements.add(entry.getKey());
        }
        return elements;
    }

    public static List<Integer> randomGenerator(int n){
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n ; i++){
            int randomIn = random.nextInt(10);
            list.add(randomIn);
        }
        return list;
    }


}
