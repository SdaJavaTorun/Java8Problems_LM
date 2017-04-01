package com.company;



import java.util.*;




/**
 * Created by RENT on 2017-04-01.
 */
public class ArraysExec {

    public static <T> T last(List<T> elements) {

        int numberOfElements = elements.size();
        return elements.get(numberOfElements - 1);
    }

    public static <T> T last(LinkedList<T> elements) {
        return elements.getLast();
    }

    public static <T> long length(List<T> list) {
        return list.stream().count();
    }

    public static <T> List<T> reverse(List<T> list) {
        Collections.reverse(list);
        return list;

    }


    public static <T> boolean isPalidrome(List<T> list) {
        List<T> original = new ArrayList<T>(list);
        ArraysExec.reverse(list);
        return Objects.equals(list, original);

    }


    public static <T> List compress(List<T> list) {
        List<T> compressedList = new ArrayList<>();
        compressedList.retainAll(list);
        return compressedList;

    }

}




