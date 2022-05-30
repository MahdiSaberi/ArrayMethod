package com.arraymethod.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayMethod{

    public void getArrayList(ArrayList<Integer> numbers){

        //fix length
        if(numbers.size() % 2 == 1)
            numbers.remove(numbers.size()-1);
        //
        int size = numbers.size();

        for(int i = 0;i < size; i++){

            if(i % 2 == 0){
                if(numbers.get(i) > numbers.get(i+1)){
                    numbers.remove(i);
                    numbers.remove(i);
                    numbers.add(i,-999);
                    numbers.add(i,-999);
                }
            }

        }
        numbers.removeAll(Collections.singleton(-999));
        System.out.println(numbers);

    }

}
