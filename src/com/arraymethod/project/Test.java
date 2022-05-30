package com.arraymethod.project;

import java.util.ArrayList;

public abstract class Test {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(5);
        number.add(4);
        number.add(12);
        number.add(12);

        PairSetting.getArrayList(number);
    }
}
