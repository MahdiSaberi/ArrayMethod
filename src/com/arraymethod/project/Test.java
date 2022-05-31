package com.arraymethod.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            int array = sc.nextInt();
            number.add(array);
        }

        ArrayMethod arrayMethod = new ArrayMethod();
        arrayMethod.getArrayList(number);
        //new PairSetting(1,3);

    }
}
