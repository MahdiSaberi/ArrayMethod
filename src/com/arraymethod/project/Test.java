package com.arraymethod.project;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(3);
        number.add(7);
        number.add(9);
        number.add(2);
        number.add(5);
        number.add(5);
        number.add(8);
        number.add(5);
        number.add(6);
        number.add(3);
        number.add(4);
        number.add(7);
        number.add(3);
        number.add(1);

        ArrayMethod arrayMethod = new ArrayMethod();
        arrayMethod.getArrayList(number);
        //new PairSetting(1,3);

    }
}
