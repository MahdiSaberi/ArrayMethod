package com.arraymethod.project;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayMethod{

    public void getArrayList(ArrayList<Integer> numbers){

        //fix length
        if (numbers.size() % 2 == 1)
            numbers.remove(numbers.size() - 1);
        //

        Iterator it = numbers.iterator();
        int index = 0;

        for (int i = 0; i < numbers.size(); i = i + 2)
            System.out.print("(" + numbers.get(i) + ", " + numbers.get(i + 1) + "), ");

        while (it.hasNext()) {

            if (index % 2 == 0) {
                if (numbers.size() > index) {

                    if (numbers.get(index) > numbers.get(index + 1)) {
                        numbers.remove(index);
                        numbers.remove(index);
                        it = numbers.iterator();
                            index = 0;
                        }

                    }

                }

                index++;
                it.next();

            }
        //int size = numbers.size();

        //for(int i = 0;i < size; i++){

          //  if(i % 2 == 0){
            //    if(numbers.get(i) > numbers.get(i+1)){
              //      numbers.remove(i);
                //    numbers.remove(i);
                  //  numbers.add(i,-999);
                    //numbers.add(i,-999);
                //}
            //}
        //}

        //numbers.removeAll(Collections.singleton(-999));
        System.out.println();
        System.out.println(numbers);
    }

}