package com.nvaldez.blue.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@Service
public class SumService {

    public Integer getSum(String arrayS) {
        String[] lista = arrayS.split(",");
        List<Integer> listaIntegers = Arrays.stream(lista).map(Integer::parseInt).toList();
        return getSum(listaIntegers);
    }

    private static Integer getSum(List<Integer> output) {
        // CODE GOES HERE
        HashMap<Integer, Integer> ocurrences = new HashMap<>();

        output.stream().forEach(i -> {
            Integer o = 0;
            if(ocurrences.containsKey(i)) {
                o = ocurrences.get(i);
            }
            o++;
            ocurrences.put(i, o);
        });
        int sum = 0;
        for (Integer i : output) {
            Integer o = ocurrences.get(i);
            if(o<2){
                sum = sum + i;
            }
        }
        return sum;

    }
}
