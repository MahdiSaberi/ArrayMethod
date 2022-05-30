package com.arraymethod.project;

import java.util.ArrayList;

public class PairSetting extends ArrayList implements Pair<Integer, Integer>{

    private final Integer first;
    private final Integer second;

    public PairSetting(Integer first, Integer second){
        this.first = first;
        this.second = second;
    }

    public static void getArrayList(ArrayList<? extends Number> numbers){
        //fix length
        if(numbers.size()%2 == 1)
            numbers.remove(numbers.size()-1);
        //

        for(Number n : numbers){
            System.out.println(n);
        }
    }

    @Override
    public Integer getFirst() {
        return first;
    }

    @Override
    public Integer getSecond() {
        return second;
    }

    @Override
    public int compareTo(Pair<Integer, Integer> o) {
        return 0;
    }
}
