package com.company;

import java.util.*;

public class Solution {

    public Integer[] solution(int[] a, int[] b, int[] c, int[] d){
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        Set<Integer> intersection1 = new HashSet<Integer>();
        Set<Integer> intersection2 = new HashSet<Integer>();
        Set<Integer> lastIntersection = new HashSet<Integer>();

        for(int i: a) {
            if (set1.add(i) == false) {
                intersection1.add(i);
            }
        }

        for(int i: b) {
            if (set1.add(i) == false) {
                intersection1.add(i);
            }
        }
        set1.removeAll(intersection1);


        for(int i: c) {
            if (set2.add(i) == false) {
                intersection2.add(i);
            }
        }

        for(int i: d) {
            if (set2.add(i) == false) {
                intersection2.add(i);
            }
        }

        set1.removeAll(intersection2);

        intersection1.retainAll(intersection2);


        Integer[] result = new Integer[intersection1.size()];
        intersection1.toArray(result);

        return result;
    }
}
