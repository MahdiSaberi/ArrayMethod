package com.arraymethod.project;

import java.util.ArrayList;

public class ArrayMethod implements Pair<Integer, Integer>{

    private Integer first;
    private Integer second;

    public void getArrayList(ArrayList<Integer> numbers){

        //fix length
        if(numbers.size() % 2 == 1)
            numbers.remove(numbers.size()-1);
        //

        ArrayList<Integer> copyNumbers = new ArrayList<>(numbers);
        for(Integer n : copyNumbers) {

            if(numbers.indexOf(n) % 2 == 0){
                if(n.intValue() > numbers.get(numbers.indexOf(n) + 1).intValue()){
                    int index = numbers.indexOf(n);
                    numbers.remove(index);
                    numbers.remove(index);
                }
            }

        }

        System.out.println(numbers);
    }

    @Override
    public Integer getFirst() {
        return first;
    }

    @Override
    public Integer getSecond() {
        return second;
    }
}
