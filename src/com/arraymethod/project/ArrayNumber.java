package com.arraymethod.project;

import java.util.ArrayList;

public abstract class ArrayNumber<T> extends ArrayList{
    Integer index = 0;

    public ArrayNumber(){

    }
    public static void getArrayList(ArrayList<? extends Number> numbers){
        //fix length
        if(numbers.size()%2 == 1)
            numbers.remove(numbers.size()-1);
        //

        for(Number n : numbers){
            System.out.println(numbers.indexOf(n));
        }
    }

    public static void makeCouple(ArrayList numbers){

    }

}
