package week3;

import java.util.*;

public class task7 {


	public static void main( String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println("The lengths of the Strings: " + lengths(list));

    }

    public static ArrayList<Integer> lengths(ArrayList<String> list) {

        ArrayList<Integer> listLength = new ArrayList<>();

        for(String name : list) {
            listLength.add(name.length());
        }

        return listLength;
    }
}

