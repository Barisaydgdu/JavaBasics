package com.barisaydgdu.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {

        //Arrays

        String[] myStringArray = new String[3];
         myStringArray[0] = "James";
         myStringArray[1] = "Lars";
         myStringArray[2] = "Kirk";

        System.out.println(myStringArray[1]);


        int[] myIntegerArray = new int[3];

        myIntegerArray[0] = 40;
        myIntegerArray[1] = 50;
        myIntegerArray[2] = 20;

        System.out.println(myIntegerArray[1]);

        int[] myNumberArray ={1,2,3,4,5,6,7,8};
        System.out.println(myNumberArray[2]);


        //Lists

        ArrayList<String> myMusicians= new ArrayList<>();

        myMusicians.add("James");
        myMusicians.add("Lars");
        myMusicians.add(1,"Kirk");
        myMusicians.add("Rob");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));

        System.out.println(myMusicians.size());
        //Set

        HashSet<String> mySet = new HashSet<>();

        mySet.add("James");
        mySet.add("James");

        System.out.println(mySet.size());

        //HashMaps

        HashMap<String,String> myHashMap = new HashMap<String,String>();
        myHashMap.put("name","James");
        myHashMap.put("instrument","Guitar");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

        HashMap<String, Integer> mySecondMap = new HashMap<String,Integer>();

        mySecondMap.put("run",100);
        mySecondMap.put("basketball",200 );

        System.out.println(mySecondMap.get("run"));
        System.out.println(mySecondMap.get("basketball"));

    }


}
